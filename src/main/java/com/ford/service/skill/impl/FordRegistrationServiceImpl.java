package com.ford.service.skill.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ford.dao.base.CallMapper;
import com.ford.dao.skill.FordRegistrationMapper;
import com.ford.entity.skill.FordRegistration;
import com.ford.entity.skill.FordRegistrationExample;
import com.ford.service.skill.IFordRegistrationService;

@Repository("fordregistrationService")
public class FordRegistrationServiceImpl implements IFordRegistrationService {

	@Autowired
	private FordRegistrationMapper fordRegistrationMapper;

	@Autowired
	private CallMapper callMapper;

	@Override
	public int addFordRegist(FordRegistration fordRegistration) throws Exception {
		// 查询是否
		String id = callMapper.callFGetId();
		fordRegistration.setId(id);
		return fordRegistrationMapper.insertSelective(fordRegistration);
	}

	@Override
	public List<FordRegistration> findFordRegist(FordRegistrationExample fordRegistrationExample) throws Exception {
		return fordRegistrationMapper.selectByExample(fordRegistrationExample);
	}

}
