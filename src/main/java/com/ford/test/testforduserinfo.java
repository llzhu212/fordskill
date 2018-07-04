package com.ford.test;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ford.controller.exam.vo.CallBackVO;

public class testforduserinfo {
	public static void main(String[] args) {
		String url = "http://127.0.0.1:8080/fordskill/forduserinfo/findFordUserinfo.act";
		String request = "{\"username\":\"kangyang\"}";
		try {
			String json = HttpTestUtils.testHttpConnection(url, "POST", request);
			System.out.println(json);
		}catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void test(){
		String json = "{\"activity\":\"25253413\",\"name\":\"闀垮畨绂忕壒鎶�鑳藉ぇ璧�\",\"ipaddress\":\"223.104.251.13\",\"openid\":\"oDCUuwVjqqjMq1akqFV_X1qoE1rs\",\"q1\":\"1\",\"q2\":\"2\",\"q3\":\"1\",\"q4\":\"1\",\"q5\":\"1\",\"q6\":\"1\",\"q7\":\"1\",\"q8\":\"2\",\"q9\":\"1\",\"q10\":\"2\",\"q11\":\"1\",\"q12\":\"1\",\"q13\":\"2\",\"q14\":\"2\",\"q15\":\"1\",\"q16\":\"1\",\"q17\":\"3\",\"q18\":\"3\",\"q19\":\"3\",\"q20\":\"3\",\"q21\":\"1,2,3\",\"q22\":\"2,3,4\",\"q23\":\"1,3\",\"q24\":\"1,2,3\",\"q25\":\"1,2,3\",\"q26\":\"e002\",\"index\":\"5\",\"joinid\":\"101688116432\",\"timetaken\":\"42\",\"submittime\":\"2018-07-03 15:13:10\",\"totalvalue\":\"62\"}";
		ObjectMapper om = new ObjectMapper();
		try {
			CallBackVO callBackVO = om.readValue(json, CallBackVO.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
