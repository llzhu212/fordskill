package com.ford.test;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class testread {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			DataInputStream in = new DataInputStream(new FileInputStream(new File("E:/私人文件/二手车代码交接/经销商信息表 (0625).csv")));
			BufferedReader br= new BufferedReader(new InputStreamReader(in,"GBK"));
			 String line = null;  
	            while((line=br.readLine())!=null){  
	                String item[] = line.split(",");//CSV格式文件为逗号分隔符文件，这里根据逗号切分 
	                String last = item[item.length-1];//这就是你要的数据了 
	                //int value = Integer.parseInt(last);//如果是数值，可以转化为数值 
	                System.out.println(last);  
	            } 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
