package com.ford.service.login.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ford.entity.login.LoginVO;
import com.ford.entity.user.FordAgentinfo;
import com.ford.entity.user.FordAgentinfoExample;
import com.ford.entity.user.FordAgentinfoExample.Criteria;
import com.ford.service.login.ILoginService;
import com.ford.service.user.IFordAgentinfoService;

@Repository("loginService")
public class LoginServiceImpl implements ILoginService {
	
	@Autowired
	private IFordAgentinfoService fordagentinfoService;
	
	/**
	 * 查询登录的经销商
	 * @param loginUserVO
	 * @return
	 * @throws Exception
	 */
	public List authority(LoginVO loginUserVO)throws Exception {
		FordAgentinfoExample fordAgentinfoExample = new FordAgentinfoExample();
		Criteria criteria = fordAgentinfoExample.createCriteria();
		criteria.andCodeEqualTo(loginUserVO.getAgentcode().trim().toUpperCase());
		List<FordAgentinfo> list = fordagentinfoService.selectFordInfoByCondition(fordAgentinfoExample);
		return list;
	}
}
