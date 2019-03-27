package com.newt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassSet {
	public static String getDay(Date d1) {
		String s1;
		SimpleDateFormat sdf = new SimpleDateFormat("EEEEE");
		s1 = sdf.format(d1);
		return s1;
	}

	public static void main(String[] args) {
		Date d1 = new Date("2018/08/27");
		System.out.println("the day is:" + getDay(d1));
	}

}

