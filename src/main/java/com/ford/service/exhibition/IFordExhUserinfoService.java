package com.ford.service.exhibition;

import java.util.Map;

import com.ford.entity.exhibition.FordExhibitionUserinfo;

public interface IFordExhUserinfoService {
	
	
	public int addUserinfo(FordExhibitionUserinfo fordExhibitionUserinfo)throws Exception;

	public int updateUserinfoWinByKey(Map<String, Object> map)throws Exception;
}
