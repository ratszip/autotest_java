package com.cpc.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Testss {
	public static void main(String args[]) {
		System.out.println(getformat());
		
		String[] str=getformat().split("/");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
	}
	
   public static String getformat(){
	   DateFormat dateformat= new SimpleDateFormat("yyyy/MM/dd");  //创建一个data format对象
	    Date date = new Date();  //利用Date()获取当前时间
	    return dateformat.format(date);
    }
}
