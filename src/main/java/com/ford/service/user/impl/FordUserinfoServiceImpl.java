package com.ford.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ford.dao.user.FordUserinfoMapper;
import com.ford.entity.user.FordUserinfo;
import com.ford.entity.user.FordUserinfoExample;
import com.ford.service.user.IFordUserinfoService;

@Repository("forduserinfoService")
public class FordUserinfoServiceImpl implements IFordUserinfoService{

	@Autowired
	private FordUserinfoMapper fordUserinfoMapper;
	
	@Override
	public int addFordUser(FordUserinfo fordUserinfo) throws Exception {
		return fordUserinfoMapper.insertSelective(fordUserinfo);
	}

	@Override
	public List<FordUserinfo> findFordUserinfo(FordUserinfoExample fordUserinfoExample) throws Exception {
		return fordUserinfoMapper.selectByExample(fordUserinfoExample);
	}

}
