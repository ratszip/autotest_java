package cpctestcase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cpc.Util.PublicData;
import com.cpc.Util.Screenshot;

import CPC_element.ElementLocate;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


@DisplayName("登录测试")
 class A1_CpcloginTest
{	
	String baseURL=PublicData.baseURL;
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 3);
	
    @Test
    @Order(1)
    @DisplayName("case_001_登录CPC")
    public void A1_test()
    {
    	d.get(baseURL);
    	//登录
    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user_name")));
		WebElement usrname = d.findElement(By.id("user_name"));
		usrname.click();
		usrname.sendKeys("zhipengxu");
		WebElement pswd = d.findElement(By.id("password"));
		pswd.sendKeys("xuzhipeng123");
		WebElement login = d.findElement(By.xpath(ElementLocate.LOGIN));
		login.click();
		WebDriverWait wait = new WebDriverWait(d, 10);	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementLocate.INDEX)));	
		WebElement info=d.findElement(By.xpath(ElementLocate.TITLE));
		try {
			assertTrue(info.isDisplayed(),"显示首页信息");
			}catch(AssertionError e) {
			Screenshot.DN(d, "-进入首页");
			throw e;
		}
    }
    
    
   
}