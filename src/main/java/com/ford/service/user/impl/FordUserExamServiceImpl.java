package com.ford.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ford.dao.base.CallMapper;
import com.ford.dao.user.FordUserinfoExamMapper;
import com.ford.entity.user.FordUserinfoExam;
import com.ford.service.user.IFordUserExamService;

@Repository("fordUserExamService")
public class FordUserExamServiceImpl implements IFordUserExamService{
	
	@Autowired
	private FordUserinfoExamMapper fordUserinfoExamMapper;
	
	@Autowired
	private CallMapper callMapper;

	@Override
	public int addFordUserExam(FordUserinfoExam fordUserinfoExam) throws Exception {
		if (null==fordUserinfoExam.getId()||"".equals(fordUserinfoExam.getId())) {
			String id = callMapper.callFGetId();
			fordUserinfoExam.setId(id);
		}
		return fordUserinfoExamMapper.insertSelective(fordUserinfoExam);
	}
	
}
