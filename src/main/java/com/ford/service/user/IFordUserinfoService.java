package com.ford.service.user;

import java.util.List;

import com.ford.entity.user.FordUserinfo;
import com.ford.entity.user.FordUserinfoExample;

public interface IFordUserinfoService {
	
	public int addFordUser(FordUserinfo fordUserinfo)throws Exception;
	
	public List<FordUserinfo> findFordUserinfo(FordUserinfoExample fordUserinfoExample)throws Exception;

}
