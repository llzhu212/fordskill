package com.ford.service.user;

import java.util.List;

import com.ford.entity.user.FordAgentinfo;
import com.ford.entity.user.FordAgentinfoExample;

public interface IFordAgentinfoService 	{

	public int addInfo(FordAgentinfo fordAgentinfo)throws Exception;
	
	public List<FordAgentinfo> selectFordInfoByCondition(FordAgentinfoExample fordAgentinfoExample)throws Exception;
}
