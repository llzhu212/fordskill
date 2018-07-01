package com.ford.service.skill.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ford.dao.base.CallMapper;
import com.ford.dao.skill.FordRegistrationUserinfoMapper;
import com.ford.entity.skill.FordRegistrationUserinfo;
import com.ford.entity.skill.FordRegistrationUserinfoExample;
import com.ford.service.skill.IFordRegisUserInfoService;
@Repository("fordregisUserInfoService")
public class FordRegisUserInfoServiceImpl implements IFordRegisUserInfoService {

	@Autowired
	private FordRegistrationUserinfoMapper fordRegistrationMapper;

	@Autowired
	private CallMapper callMapper;

	@Override
	public int addFordRegisUsers(FordRegistrationUserinfo fordRegisUser)
			throws Exception {
		String id = callMapper.callFGetId();
		fordRegisUser.setId(id);
		return fordRegistrationMapper.insertSelective(fordRegisUser);
	}

	@Override
	public List<FordRegistrationUserinfo> findFordRegisUsers(
			FordRegistrationUserinfoExample fordRegistrationUserinfoExample)
			throws Exception {
		return fordRegistrationMapper.selectByExample(fordRegistrationUserinfoExample);
	}

}
