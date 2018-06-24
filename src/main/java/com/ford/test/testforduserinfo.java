package com.ford.test;

import java.io.IOException;

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
}
