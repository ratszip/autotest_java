package com.cpc.demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HelloWorld {
	public String say() {
		WebDriver d=new ChromeDriver();
		d.get("http://www.baidu.com/");
		return "Hello World";
	}

}
