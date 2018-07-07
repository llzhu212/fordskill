package com.ford.service.user;

import java.util.List;

import com.ford.entity.user.FordUserinfoExam;

public interface IFordUserExamService {
	
	public int addFordUserExam(FordUserinfoExam fordUserinfoExam)throws Exception;
	
	/**
	 * 根据openid查询考试成绩
	 * @param openid
	 * @return
	 * @throws Exception
	 */
	public List<FordUserinfoExam> queryExamScore(String openid)throws Exception;
}
