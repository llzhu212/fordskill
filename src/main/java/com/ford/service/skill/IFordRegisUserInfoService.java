package com.ford.service.skill;

import java.util.List;

import com.ford.entity.skill.FordRegistrationUserinfo;
import com.ford.entity.skill.FordRegistrationUserinfoExample;

public interface IFordRegisUserInfoService {
	
	public int addFordRegisUsers(FordRegistrationUserinfo fordRegisUser) throws Exception;

	public List<FordRegistrationUserinfo> findFordRegisUsers(FordRegistrationUserinfoExample fordRegistrationUserinfoExample) throws Exception;
}
