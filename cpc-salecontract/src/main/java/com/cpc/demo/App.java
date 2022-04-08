package com.cpc.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\autotest\\webdriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.baidu.com/");
    }
}
