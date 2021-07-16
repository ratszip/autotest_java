package CPC_element;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cpc.Util.PublicData;
import com.cpc.Util.Screenshot;

public class PublicTests {
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 3);
	WebElement vele;
	WebElement veledown;
	WebElement veletext;
	String compare;
	
	/**
	 * 
	 * @param ele 选项框
	 * @param eletext 选项框内容
	 * @param eledown 选项框下拉项目
	 * @param eledowntext 选项框下拉项目的内容
	 * @param shotname 截图保存的名称
	 * @param atr 获取文本方式
	 * @throws InterruptedException
	 */
	public void selecpare(String ele,String eletext,String eledown,String eledowntext,String shotname,int atr) 
			throws InterruptedException {
		vele=d.findElement(By.xpath(ele));
		vele.click();
		Thread.sleep(100);
		veledown=d.findElement(By.xpath(eledown));
		Thread.sleep(200);
		compare=d.findElement(By.xpath(eledowntext)).getText();
		veledown.click();
		Thread.sleep(100);
		veletext=d.findElement(By.xpath(eletext));
		try {
			switch (atr) {
			case 1:
				assertEquals(veletext.getText(), compare);
				break;
			case 2:
				assertEquals(veletext.getAttribute("value"), compare);
				break;
			}
		}catch(AssertionError e) {
			Screenshot.DN(d, shotname);
			throw e;
		}
	}
	public void selecpare(String ele,String eledown,String shotname,int atr) throws InterruptedException {
		vele = d.findElement(By.xpath(ele));
		vele.click();
		Thread.sleep(200);
		veledown = d.findElement(By.xpath(eledown));
		Thread.sleep(100);
		compare=d.findElement(By.xpath(eledown)).getText();
		veledown.click();
		try {
			switch (atr) {
			case 1:
				assertEquals(vele.getText(), compare);
				break;
			case 2:
				assertEquals(vele.getAttribute("value"), compare);
				break;
			}	
		}catch(AssertionError e) {
			Screenshot.DN(d, shotname);
			throw e;
		}
	}
	/**
	 * 
	 * @param ele 输入框
	 * @param eledown 输入框下拉项
	 * @param shotname 错误截图名称
	 * @param atr 获取内容的方式
	 * @param zdy 自定义断言的文本
	 * @throws InterruptedException
	 */
	public void selecpare(String ele,String eledown,String shotname,int atr,String zdy) throws InterruptedException {
		vele = d.findElement(By.xpath(ele));
		vele.click();
		Thread.sleep(200);
		veledown = d.findElement(By.xpath(eledown));
		veledown.click();
		try {
			switch (atr) {
			case 1:
				assertEquals(vele.getText(), zdy);
				break;
			case 2:
				assertEquals(vele.getAttribute("value"), zdy);
				break;
			}	
		}catch(AssertionError e) {
			Screenshot.DN(d, shotname);
			throw e;
		}
	}
	
	/**
	 * 保存未改变的数据
	 * @param elements 传入的页面元素
	 * @return Map<String,String> 返回元素及对应的文本内容
	 */
	Map<String,String> map;
	public Map<String,String> before_verify(String...elements ) {
		 map=new HashMap<>();
		for (String vfstring : elements) {
			WebElement wele=d.findElement(By.xpath(vfstring));
			if(!"input".equals(wele.getTagName())) {
				map.put(vfstring, wele.getText());
				//System.out.println(wele.getText()+":"+vfstring);
			}else {
				map.put(vfstring, wele.getAttribute("value"));
				//System.out.println(wele.getAttribute("value")+":"+vfstring);
			}
		}
		
		return map;
	}
	/**
	 * 校验修改后的内容
	 * @param map
	 */
	public void verify(Map<String,String> afmap) {
		
		String textafter;
		for (String xpath : afmap.keySet()) {
			WebElement lele=d.findElement(By.xpath(xpath));
			String textbefore=afmap.get(xpath);
			if(!"input".equals(lele.getTagName())) {
				textafter=lele.getText();
				//System.out.println(lele.getText()+":"+xpath);
			}else {
				textafter=lele.getAttribute("value");
			}
			assertTrue(textbefore.equals(textafter), "是否修改");
		}
	}
}
