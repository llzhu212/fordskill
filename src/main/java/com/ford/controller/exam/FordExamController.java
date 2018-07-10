package com.ford.controller.exam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ford.controller.exam.util.CallBackUtil;
import com.ford.controller.exam.vo.CallBackVO;
import com.ford.controller.exam.vo.CallVOUtil;
import com.ford.controller.user.comment.ExampleComment;
import com.ford.entity.login.LoginSessionVO;
import com.ford.entity.skill.FordRegistration;
import com.ford.entity.skill.FordRegistrationExample;
import com.ford.entity.skill.FordRegistrationExample.Criteria;
import com.ford.entity.user.FordUserinfoExam;
import com.ford.entity.user.FordUserinfoExamExample;
import com.ford.service.skill.IFordRegistrationService;
import com.ford.service.user.IFordUserExamService;
import com.ford.utils.DateUtil;

@Controller
@RequestMapping("/exam")
public class FordExamController {

	private Logger log = Logger.getLogger("error");
	
	@Autowired
	private IFordRegistrationService fordregistrationService;
	
	@Autowired
	private IFordUserExamService fordUserExamService;
	
	
	@RequestMapping(value = "/forwardExam.act")
	public String forwardExam(HttpServletRequest request){
		
		String openid ;
		if (null==request.getSession().getAttribute("openid")||"".equals(request.getSession().getAttribute("openid"))) {
			//返回登录页面
			return "redirect:/login/forwardLogin.action";
		}else {
			try {
				openid = request.getSession().getAttribute("openid").toString();
				FordRegistrationExample fordRegistrationExample = new FordRegistrationExample();
				fordRegistrationExample.createCriteria().andOpenidEqualTo(openid);
				List<FordRegistration> list = fordregistrationService.findFordRegist(fordRegistrationExample); 
				if (null==list||list.size()<=0) {
					//不是报名用户
					return "";
				}else{
					//进入考试链接
					return "redirect:"+ExampleComment.EXAM_EXAMADDRESS +openid;
				}
			} catch (Exception e) {
				log.error(e.getMessage());
				return "";
			}
			
		}
	}
	
	@RequestMapping(value = "/callback.act")
	public void callback(HttpServletRequest request){
		CallVOUtil callVOUtil = new CallVOUtil();
		CallBackUtil callBackUtil = new CallBackUtil();
		try {
			String json = IOUtils.toString(request.getInputStream());
			log.error("===回调json串===="+json);
			ObjectMapper om = new ObjectMapper();
			Map<String, Object> map = new HashMap<String,Object>();
			map = om.readValue(json, Map.class);
			CallBackVO callBackVO = callBackUtil.map2CallBackVO(map);
			FordUserinfoExam fordUserinfoExam = callVOUtil.callVO2Exam(callBackVO);
			fordUserExamService.addFordUserExam(fordUserinfoExam);
		} catch (Exception e) {
			log.error("===回调报错了=========="+e.getMessage());
		}
	}
	
	
	/**
	 * 点击我要考试
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value ="/toExam")
	public String toExam(HttpServletRequest request,Model model) throws Exception {
		LoginSessionVO loginSessionVO = (LoginSessionVO)request.getSession().getAttribute("loginSessionVO");
		if(null == loginSessionVO){
			return "redirect:/login/forwardLogin.action";
		}
		//查询是否已经报名
		//判断是否已经报名
		FordRegistrationExample fordRegistrationExample = new FordRegistrationExample();
		Criteria criteria = fordRegistrationExample.createCriteria();
		criteria.andCodeEqualTo(loginSessionVO.getAgentcode());
		List<FordRegistration> list = fordregistrationService.findFordRegist(fordRegistrationExample);
		if(null == list || list.size()==0){
			//返回
			model.addAttribute("msg", "您还没有报名哦！");
			return "exam/infotip";
		}
		//判断是否是报名的微信号
		FordRegistration fordRegistration = list.get(0);
		if(!loginSessionVO.getOpenid().equals(fordRegistration.getOpenid())){
			//返回
			model.addAttribute("msg", "请使用报名的微信号答题！");
			return "exam/infotip";
		}
		//判断是否已经报名
		FordUserinfoExamExample fordUserinfoExamExample = new FordUserinfoExamExample();
		com.ford.entity.user.FordUserinfoExamExample.Criteria examcri = fordUserinfoExamExample.createCriteria();
		examcri.andOpenidEqualTo(loginSessionVO.getOpenid());
		List<FordUserinfoExam> exams = fordUserExamService.findFordExams(fordUserinfoExamExample);
		if(null != exams && exams.size()>0){
			//返回
			model.addAttribute("msg", "您已经考完试，不能再考试了！");
			return "exam/infotip";
		}
		
		if (!DateUtil.compareToday(ExampleComment.EXAM_START_TIME)) {
			//返回来早了，还没有开始界面
			model.addAttribute("msg", "考试时间还未到哦！");
			return "exam/earlytip";
		}else if(DateUtil.compareToday(ExampleComment.EXAM_END_TIME)) {
			//返回考试已经结束界面
			model.addAttribute("msg", "考试已经结束了哦！");
			return "exam/infotip";
		}else{
			//考试规则
			return "exam/examtip";
		}
	}
	
	
	/**
	 * 查看成绩
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value ="/toExamScore")
	public String toExamScore(HttpServletRequest request,Model model) throws Exception {
		LoginSessionVO loginSessionVO = (LoginSessionVO)request.getSession().getAttribute("loginSessionVO");
		if(null == loginSessionVO){
			return "redirect:/login/forwardLogin.action";
		}
		//查询考试成绩
		List<FordUserinfoExam> list = fordUserExamService.queryExamScore(loginSessionVO.getOpenid());
		if(null == list || list.size() == 0){
			model.addAttribute("msg", "您还未参加考试哦！");
			return "exam/infotip";
		}
		FordUserinfoExam exam = list.get(0);
		model.addAttribute("exam",exam);
		return "exam/examcore";
	}
	
	
	@RequestMapping(value ="/toExamruwei")
	public String toExamruwei(HttpServletRequest request,Model model) throws Exception {
		//如果当前时间在公布时间前，可以查看
		if(DateUtil.compareToday(ExampleComment.EXAM_SHOWRUWEI_TIME)){
			return "exam/examruwei";
		}else{
			model.addAttribute("msg", "X月X日才公布分站赛入围名单哦！");
			return "exam/earlytip";
		}
	}
	
	
	@RequestMapping(value ="/toExamSuc")
	public String toExamSuc(HttpServletRequest request) throws Exception {
			return "exam/exsuccess";
	}
}
