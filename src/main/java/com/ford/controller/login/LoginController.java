package com.ford.controller.login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ford.entity.login.LoginSessionVO;
import com.ford.entity.login.LoginVO;
import com.ford.entity.user.FordAgentinfo;
import com.ford.service.login.ILoginService;


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
		String openid =(String) request.getParameter("openid"); 
		//如果openid为空
		if(null == openid || ""==openid){
			return "redirect:http://wx.e2capp.com/auth.ashx?serv_name=ershou&scope=snsapi_userinfo&i=14";
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
		if(!loginUserVO.getAgentcode().trim().toUpperCase().equals(
				loginUserVO.getPassword().trim().toUpperCase())){
			//设置uservo
			model.addAttribute("loginUserVO",loginUserVO);
			//设置错误信息
			model.addAttribute("msg", "经销商代码或密码错误");
			//返回
			return "login";
		}
		//设置sesseoinuser
		LoginSessionVO loginSessionVO = new LoginSessionVO();
		loginSessionVO.setAgentcode(loginUserVO.getAgentcode().trim().toUpperCase());
		String openid = (String) request.getSession().getAttribute("openid");
		loginSessionVO.setOpenid(openid);
		request.getSession().setAttribute("loginSessionVO", loginSessionVO);
		return "home";
	}
	
	@RequestMapping(value ="/toHome")
	public String toHome(HttpServletRequest request) throws Exception {
		LoginSessionVO loginSessionVO =(LoginSessionVO) request.getSession().getAttribute("loginSessionVO");
		if(null == loginSessionVO){
			return "redirect:/login/forwardLogin.action";
		}
		return "home";
	}
}
