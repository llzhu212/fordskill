package com.ford.controller.exam.vo;

import com.ford.entity.user.FordUserinfoExam;
public class CallVOUtil {
	
	public FordUserinfoExam callVO2Exam(CallBackVO callBackVO){
		FordUserinfoExam fordUserinfoExam = new FordUserinfoExam();
		fordUserinfoExam.setJoinid(callBackVO.getJoinid());
		fordUserinfoExam.setOpenid(callBackVO.getOpenid());
		fordUserinfoExam.setQ1(callBackVO.getQ1());
		fordUserinfoExam.setQ2(callBackVO.getQ2());
		fordUserinfoExam.setQ3(callBackVO.getQ3());
		fordUserinfoExam.setQ4(callBackVO.getQ4());
		fordUserinfoExam.setQ5(callBackVO.getQ5());
		fordUserinfoExam.setQ6(callBackVO.getQ6());
		fordUserinfoExam.setQ7(callBackVO.getQ7());
		fordUserinfoExam.setQ8(callBackVO.getQ8());
		fordUserinfoExam.setQ9(callBackVO.getQ9());
		fordUserinfoExam.setQ10(callBackVO.getQ10());
		fordUserinfoExam.setQ11(callBackVO.getQ11());
		fordUserinfoExam.setQ12(callBackVO.getQ12());
		fordUserinfoExam.setQ13(callBackVO.getQ13());
		fordUserinfoExam.setQ14(callBackVO.getQ14());
		fordUserinfoExam.setQ15(callBackVO.getQ15());
		fordUserinfoExam.setQ16(callBackVO.getQ16());
		fordUserinfoExam.setQ17(callBackVO.getQ17());
		fordUserinfoExam.setQ18(callBackVO.getQ18());
		fordUserinfoExam.setQ19(callBackVO.getQ19());
		fordUserinfoExam.setQ20(callBackVO.getQ20());
		fordUserinfoExam.setQ21(callBackVO.getQ21());
		fordUserinfoExam.setQ22(callBackVO.getQ22());
		fordUserinfoExam.setQ23(callBackVO.getQ23());
		fordUserinfoExam.setQ24(callBackVO.getQ24());
		fordUserinfoExam.setQ25(callBackVO.getQ25());
		fordUserinfoExam.setQ26(callBackVO.getQ26());
		fordUserinfoExam.setSubmittime(callBackVO.getSubmittime());
		fordUserinfoExam.setTimetaken(callBackVO.getTimetaken());
		fordUserinfoExam.setTotalvalue(callBackVO.getTotalvalue());
		return fordUserinfoExam;
	}
}
