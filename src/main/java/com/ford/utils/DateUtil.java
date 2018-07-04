package com.ford.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.hp.hpl.sparta.xpath.ThisNodeTest;

public class DateUtil {

	public static String getCurrentTiem(){
		String time = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		time = sdf.format(date);
		return time;
	}
	
	public static String formatTime(String time) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date date = sdf.parse(time);
		String result = sdf2.format(date);
		return result;
	}

	public static String getCurrentTime(){
		String time = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		time = sdf.format(date);
		return time;
	}
	
	public static boolean compareToday(String time){
		boolean flag = false;
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			String currentTime = df.format(date);
			Date date1 = df.parse(currentTime);
			Date date2 = df.parse(time);
			if (date1.getTime()>=date2.getTime()) {
				flag = true;
			}else if (date1.getTime()<date2.getTime()) {
				flag = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}
