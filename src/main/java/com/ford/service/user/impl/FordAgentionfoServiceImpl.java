package com.ford.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ford.dao.base.CallMapper;
import com.ford.dao.user.FordAgentinfoMapper;
import com.ford.entity.user.FordAgentinfo;
import com.ford.entity.user.FordAgentinfoExample;
import com.ford.service.user.IFordAgentinfoService;

@Repository("fordagentinfoService")
public class FordAgentionfoServiceImpl implements IFordAgentinfoService{

	@Autowired
	private FordAgentinfoMapper fordAgentinfoMapper;
	
	@Autowired
	private CallMapper callMapper;
	
	@Override
	public int addInfo(FordAgentinfo fordAgentinfo) throws Exception {
		if (null==fordAgentinfo.getId()||"".equals(fordAgentinfo.getId())) {
			String id = callMapper.callFGetId();
			fordAgentinfo.setId(id);
		}
		return fordAgentinfoMapper.insertSelective(fordAgentinfo);
	}


	@Override
	public List<FordAgentinfo> selectFordInfoByCondition(FordAgentinfoExample fordAgentinfoExample) throws Exception {
		return fordAgentinfoMapper.selectByExample(fordAgentinfoExample);
	}
	
	
}
