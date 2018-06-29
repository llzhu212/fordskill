package com.ford.test;

import java.io.IOException;

public class testfordsupplier {
	
	public static void main(String[] args) {
		String url = "http://127.0.0.1:8080/fordskill/fordexhibition/addExhibition.act";
		String request = "{\"name\":\"康杨\",\"phone\":\"15215178931\",\"city\":\"重庆\",\"code\":\"A001\"}";
		try {
			String json = HttpTestUtils.testHttpConnection(url, "POST", request);
			System.out.println(json);
		}catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
