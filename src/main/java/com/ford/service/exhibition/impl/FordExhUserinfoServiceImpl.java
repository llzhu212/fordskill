package com.ford.service.exhibition.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ford.dao.base.CallMapper;
import com.ford.dao.exhibition.FordExhibitionUserinfoMapper;
import com.ford.dao.exhibition.custom.FordExhibitionUserinfoCustomMapper;
import com.ford.entity.exhibition.FordExhibitionUserinfo;
import com.ford.service.exhibition.IFordExhUserinfoService;

@Repository("fordExhUserinfoServiceImpl")
public class FordExhUserinfoServiceImpl implements IFordExhUserinfoService{

	@Autowired
	private FordExhibitionUserinfoCustomMapper fordExhibitionUserinfoCustomMapper;
	
	@Autowired
	private FordExhibitionUserinfoMapper fordExhibitionUserinfoMapper;
	
	@Autowired
	private CallMapper callMapper;
	
	@Override
	public int addUserinfo(FordExhibitionUserinfo fordExhibitionUserinfo) throws Exception {
		if (null==fordExhibitionUserinfo.getId()||"".equals(fordExhibitionUserinfo.getId())) {
			String id  = callMapper.callFGetId();
			fordExhibitionUserinfo.setId(id);
		}
		return fordExhibitionUserinfoMapper.insertSelective(fordExhibitionUserinfo);
	}

	@Override
	public int updateUserinfoWinByKey(Map<String, Object> map) throws Exception {
		return fordExhibitionUserinfoCustomMapper.updateUserWin(map);
	}

}
