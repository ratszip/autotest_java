package com.cpc.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PublicData {
	static {
		System.setProperty("webdriver.chrome.driver","D:\\autotest\\chromedriver.exe");
	}
	
	//窗口最大化
	public static ChromeOptions chromeOpt = new ChromeOptions().addArguments("--start-maximized");
	public static WebDriver d = new ChromeDriver(chromeOpt);
	public static String baseURL = "http://192.168.150.7/#/login";
	
	static PublicData pd;
	public static PublicData getPDIns() {
		if(pd == null) {
			pd = new PublicData();
		}
		return pd;
	}

}
