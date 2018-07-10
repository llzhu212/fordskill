package com.ford.controller.exam.util;

import java.util.Map;

import com.ford.controller.exam.vo.CallBackVO;

public class CallBackUtil {
	public CallBackVO map2CallBackVO(Map<String, Object> map){
		CallBackVO callBackVO = new CallBackVO();
		if (null!=map.get("activity")) {
			callBackVO.setActivity(map.get("activity").toString());
		}
		if (null!=map.get("index")) {
			callBackVO.setIndex(map.get("index").toString());
		}
		if (null!=map.get("ipaddress")) {
			callBackVO.setIpaddress(map.get("ipaddress").toString());
		}
		if (null!=map.get("joinid")) {
			callBackVO.setJoinid(map.get("joinid").toString());
		}
		if (null!=map.get("openid")) {
			callBackVO.setOpenid(map.get("openid").toString());
		}
		if (null!=map.get("q1")) {
			callBackVO.setQ1(map.get("q1").toString());
		}
		if (null!=map.get("q2")) {
			callBackVO.setQ2(map.get("q2").toString());
		}
		if (null!=map.get("q3")) {
			callBackVO.setQ3(map.get("q3").toString());
		}
		if (null!=map.get("q4")) {
			callBackVO.setQ4(map.get("q4").toString());
		}
		if (null!=map.get("q5")) {
			callBackVO.setQ5(map.get("q5").toString());
		}
		if (null!=map.get("q6")) {
			callBackVO.setQ6(map.get("q6").toString());
		}
		if (null!=map.get("q1")) {
			callBackVO.setQ1(map.get("q1").toString());
		}
		if (null!=map.get("q7")) {
			callBackVO.setQ7(map.get("q7").toString());
		}
		if (null!=map.get("q8")) {
			callBackVO.setQ8(map.get("q8").toString());
		}
		if (null!=map.get("q9")) {
			callBackVO.setQ9(map.get("q9").toString());
		}
		if (null!=map.get("q10")) {
			callBackVO.setQ10(map.get("q10").toString());
		}
		if (null!=map.get("q11")) {
			callBackVO.setQ11(map.get("q11").toString());
		}
		if (null!=map.get("q12")) {
			callBackVO.setQ12(map.get("q12").toString());
		}
		if (null!=map.get("q13")) {
			callBackVO.setQ13(map.get("q13").toString());
		}
		if (null!=map.get("q14")) {
			callBackVO.setQ14(map.get("q14").toString());
		}
		if (null!=map.get("q15")) {
			callBackVO.setQ15(map.get("q15").toString());
		}
		if (null!=map.get("q16")) {
			callBackVO.setQ16(map.get("q16").toString());
		}
		if (null!=map.get("q17")) {
			callBackVO.setQ17(map.get("q17").toString());
		}
		if (null!=map.get("q18")) {
			callBackVO.setQ18(map.get("q18").toString());
		}
		if (null!=map.get("q19")) {
			callBackVO.setQ19(map.get("q19").toString());
		}
		if (null!=map.get("q20")) {
			callBackVO.setQ20(map.get("q20").toString());
		}
		if (null!=map.get("q21")) {
			callBackVO.setQ21(map.get("q21").toString());
		}
		if (null!=map.get("q22")) {
			callBackVO.setQ22(map.get("q22").toString());
		}
		if (null!=map.get("q23")) {
			callBackVO.setQ23(map.get("q23").toString());
		}
		if (null!=map.get("q24")) {
			callBackVO.setQ24(map.get("q24").toString());
		}
		if (null!=map.get("q25")) {
			callBackVO.setQ25(map.get("q25").toString());
		}
		if (null!=map.get("q26")) {
			callBackVO.setQ26(map.get("q26").toString());
		}
		if (null!=map.get("timetaken")) {
			callBackVO.setSubmittime(map.get("timetaken").toString());
		}
		if (null!=map.get("submittime")) {
			callBackVO.setSubmittime(map.get("submittime").toString());
		}
		if (null!=map.get("totalvalue")) {
			callBackVO.setTotalvalue(map.get("totalvalue").toString());
		}
		if (null!=map.get("sojumpparm")) {
			callBackVO.setSojumpparm(map.get("sojumpparm").toString());
			if (null==callBackVO.getOpenid()||"".equals(callBackVO.getOpenid())) {
				callBackVO.setOpenid(map.get("sojumpparm").toString());
			}
		}
		return callBackVO;
	}
}
