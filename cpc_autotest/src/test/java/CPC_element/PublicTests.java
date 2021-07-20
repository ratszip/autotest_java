package CPC_element;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cpc.Util.PublicData;
import com.cpc.Util.Screenshot;

@TestMethodOrder(OrderAnnotation.class)
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
	public void selecpare(String elexpath,String eletext,String downxpath,String downtext,String shotname,int atr) 
			throws InterruptedException {
		vele=d.findElement(By.xpath(elexpath));
		vele.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(downxpath)));
		Thread.sleep(50);
		veledown=d.findElement(By.xpath(downxpath));
		compare=d.findElement(By.xpath(downtext)).getText();
		veledown.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(eletext)));
		veletext=d.findElement(By.xpath(eletext));
		textoratrEq(elexpath, atr, compare, shotname);
	}
	public void selecpare(String elexpath,String downxpath,String shotname,int atr) throws InterruptedException {
		vele = d.findElement(By.xpath(elexpath));
		vele.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(downxpath)));
		Thread.sleep(50);
		veledown = d.findElement(By.xpath(downxpath));
		compare=d.findElement(By.xpath(downxpath)).getText();
		veledown.click();
		textoratrEq(elexpath, atr, compare, shotname);
	}
	/**
	 * no data available
	 * @param ele 输入框
	 * @param eledown 输入框下拉项
	 * @param shotname 错误截图名称
	 * @param atr 获取内容的方式
	 * @param zdy 自定义断言的文本
	 * @throws InterruptedException
	 */
	public void selecpare(String elexpath,String downpath,String shotname,int atr,String zdy) throws InterruptedException {
		vele = d.findElement(By.xpath(elexpath));
		vele.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(downpath)));
		veledown = d.findElement(By.xpath(downpath));
		veledown.click();
		textoratrEq(elexpath, atr, zdy, shotname);
	}
	
	/**
	 * 保存原数据
	 * @param elements 传入的页面元素
	 * @return Map<String,String> 返回元素及对应的文本内容
	 */
	public Map<String,String> before_verify(String...elements ) {
		Map<String,String>  map=new HashMap<>();
		for (String vfstring : elements) {
			WebElement wele=d.findElement(By.xpath(vfstring));
			if(!"input".equals(wele.getTagName())) {
				map.put(vfstring, wele.getText());
			}else {
				map.put(vfstring, wele.getAttribute("value"));
			}
		}
		return map;
	}
	/**
	 * 校验修改后的内容
	 * @param map
	 */
	public void verify(Map<String,String> afmap,String shotname) {
		String textafter;
		WebElement ele;
		for (String path : afmap.keySet()) {
			String textbefore=afmap.get(path);
			ele=d.findElement(By.xpath(path));
			if(!"input".equals(ele.getTagName())) {
				textafter=ele.getText();
			}else {
				textafter=ele.getAttribute("value");
			}
//			System.out.println("before:"+textbefore);
//			System.out.println("after:"+textafter);
		try {
			assertTrue(!textbefore.equals(textafter), "是否修改");
		}catch(AssertionError e) {
			Screenshot.DN(d, shotname);
			throw e;
		}
		}
	}
	
	/**
	 * 删除文本内容
	 * @param ele
	 * @param shotname
	 * @param atr
	 */
	public void delet(String xpath,String shotname,int atr) {
		vele = d.findElement(By.xpath(xpath));
		int textlen=0;
		switch (atr) {
		case 1:
			textlen=vele.getText().length();
			break;
		case 2:
			textlen=vele.getAttribute("value").length();
			break;
		}
		for(int i=textlen;i>0;i--) {
			vele.sendKeys(Keys.BACK_SPACE);
		}
		vele.sendKeys(Keys.TAB);
		textoratrEq(xpath,atr,"",shotname);
	}
	
	/**
	 * 输入文本内容
	 * @param ele
	 * @param shotname
	 * @param atr
	 */
	public void wrtin(String xpath,String text,String shotname,int atr) {
		vele = d.findElement(By.xpath(xpath));
		vele.sendKeys(text);
		vele.sendKeys(Keys.TAB);
		textoratrEq(xpath,atr,text,shotname);
	}
	
	/**
	 * 判断用getText还是getAtrribute,断言Equal
	 * @param ele
	 * @param atr
	 * @param compare
	 * @param shotname
	 */
	public void textoratrEq(String xpath,int atr,String compare,String shotname) {
		vele=d.findElement(By.xpath(xpath));
		try {
			switch (atr) {
			case 1:
				assertEquals(vele.getText(), compare);
				break;
			case 2:
				assertEquals(vele.getAttribute("value"),compare);
				break;
			}
		}catch(AssertionError e) {
				Screenshot.DN(d, shotname);
				throw e;
			}
	}
	
	/**
	 * 判断用getText还是getAtrribute,断言assertNotEqual
	 * @param ele
	 * @param atr
	 * @param compare
	 * @param shotname
	 */
	public void textoratrNEq(String xpath,int atr,String compare,String shotname) {
		vele=d.findElement(By.xpath(xpath));
		try {
			switch (atr) {
			case 1:
				assertNotEquals(vele.getText(), compare);
				break;
			case 2:
				assertNotEquals(vele.getAttribute("value"),compare);
				break;
			}
		}catch(AssertionError e) {
				Screenshot.DN(d, shotname);
				throw e;
			}
	}
	
	public void checkboxSelec(String xpath,String xpathen,String shotname) {
		vele=d.findElement(By.xpath(xpath));
		veletext=d.findElement(By.xpath(xpathen));
		if(!vele.isSelected()) {
			veletext.click();
			try {
				assertTrue(vele.isSelected());
			}catch(AssertionError e){
				Screenshot.DN(d, shotname);
				throw e;
			}
		}
	}
}
