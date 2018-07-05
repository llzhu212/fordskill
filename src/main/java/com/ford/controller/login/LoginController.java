package com.ford.controller.login;

import java.util.Date;
import java.util.List;

import javax.persistence.metamodel.SetAttribute;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ford.entity.login.LoginSessionVO;
import com.ford.entity.login.LoginVO;
import com.ford.entity.user.FordAgentinfo;
import com.ford.service.login.ILoginService;
import com.ford.utils.DateUtil;


@Controller
@RequestMapping("/login")
public class LoginController {
	
	
	@Autowired
	private ILoginService loginService;
	
	/**
	 * 跳转登录
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value ="/forwardLogin")
	public String forwardLogin(HttpServletRequest request) throws Exception {
		
		//判断登录session
		LoginSessionVO loginSessionVO = (LoginSessionVO) request.getSession().getAttribute("loginSessionVO");
		if(null!=loginSessionVO){
			return "home";
		}
		/**
		 * 判断openid
		 */
//		String openid = (String) request.getSession().getAttribute("openid");
		String openid =(String) request.getParameter("openid"); 
		//如果openid为空
		if(null == openid || ""==openid){
//			return "http://wx.e2capp.com/auth.ashx?serv_name=ershou&scope=snsapi_userinfo&i=13";
			request.getSession().setAttribute("openid", "001");
			return "login";
		}else{
			request.getSession().setAttribute("openid", openid);
			return "login";
		}
	}
	
	/**
	 * 登录
	 * @param request
	 * @param loginUserVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value ="/login")
	public String login(HttpServletRequest request,LoginVO 
			loginUserVO,Model model) throws Exception {
		if(null==loginUserVO || null==loginUserVO.getAgentcode() || null == loginUserVO.getPassword()||
				"".equals(loginUserVO.getAgentcode().trim()) || "".equals(loginUserVO.getPassword().trim())){
			//设置uservo
			model.addAttribute("loginUserVO",loginUserVO);
			//设置错误信息
			model.addAttribute("msg", "请填写经销商代码及密码");
			//返回
			return "login";
		}
		//验证
		List<FordAgentinfo> agentlist = loginService.authority(loginUserVO);
		if(null == agentlist || agentlist.size()==0){
			//设置uservo
			model.addAttribute("loginUserVO",loginUserVO);
			//设置错误信息
			model.addAttribute("msg", "经销商代码或密码错误");
			//返回
			return "login";
		}
		if(!loginUserVO.getAgentcode().equals(loginUserVO.getPassword())){
			//设置uservo
			model.addAttribute("loginUserVO",loginUserVO);
			//设置错误信息
			model.addAttribute("msg", "经销商代码或密码错误");
			//返回
			return "login";
		}
		//设置sesseoinuser
		LoginSessionVO loginSessionVO = new LoginSessionVO();
		loginSessionVO.setAgentcode(loginUserVO.getAgentcode());
		String openid = (String) request.getSession().getAttribute("openid");
		loginSessionVO.setOpenid(openid);
		request.getSession().setAttribute("loginSessionVO", loginSessionVO);
		return "home";
	}
	
	@RequestMapping(value ="/toHome")
	public String toHome(HttpServletRequest request) throws Exception {
			return "home";
	}
	
	@RequestMapping(value ="/toExam")
	public String toExam(HttpServletRequest request) throws Exception {
			return "exam/examtip";
	}
	
	@RequestMapping(value ="/toExamScore")
	public String toExamScore(HttpServletRequest request) throws Exception {
			return "exam/examcore";
	}
	
	@RequestMapping(value ="/toExamruwei")
	public String toExamruwei(HttpServletRequest request) throws Exception {
		//公布入围时间
		String showdate = "2018-08-01 00:00:00";
		//如果当前时间在公布时间前，可以查看
		if(DateUtil.compareToday(showdate)){
			return "exam/examruwei";
		}else{
			return "exam/ruweiearly";
		}
	}
}
