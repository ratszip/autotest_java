package cpctestcase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cpc.Util.CPCDateUtils;
import com.cpc.Util.PublicData;
import com.cpc.Util.Screenshot;

import CPC_element.ElementLocate;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


@DisplayName("登录测试")
 class Cpclogin__Test
{	
	String baseURL=PublicData.baseURL;
	WebDriver d=PublicData.d;
   
	
    @Test
    @Order(1)
    @DisplayName("case_001_登录CPC")
    public void A1_test()
    {
    	d.get(baseURL);
    	//登录
		WebElement usrname = d.findElement(By.id("user_name"));
		usrname.click();
		usrname.sendKeys("zhipengxu");
		WebElement pswd = d.findElement(By.id("password"));
		//System.out.println(pswd.getTagName());
		pswd.sendKeys("xuzhipeng123");
		WebElement login = d.findElement(By.xpath(ElementLocate.LOGIN));
		login.click();
		WebDriverWait wait = new WebDriverWait(d, 10);	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementLocate.INDEX)));	
		WebElement info=d.findElement(By.xpath(ElementLocate.TITLE));
		try {
			//assertEquals(info.getText(),"UPW信息管理系统网页面版");
			assertTrue(info.isDisplayed(),"显示首页信息");
			}catch(AssertionError e) {
			Screenshot.DN(d, "-进入首页");
			throw e;
		}
    }
    
    
    @Test
    @Order(2)
    @DisplayName("case_002_打开销售合同录入")
    public void A2_test() throws InterruptedException {
    	//打开左侧菜单
		WebElement login = d.findElement(By.xpath(ElementLocate.ICON));
		login.click();
		Thread.sleep(200);
		//产品仓系统
		WebElement mainpage = d.findElement(By.xpath(ElementLocate.PRO_STORE));
		mainpage.click();
		Thread.sleep(200);
		//销售合同
		WebElement salesct = d.findElement(By.xpath(ElementLocate.SALE_CONTRA));
		salesct.click();
		Thread.sleep(200);
		//销售合同录入
		WebElement salesin = d.findElement(By.xpath(ElementLocate.SALE_CONTRA_WR));
		salesin.click();
		WebDriverWait wait = new WebDriverWait(d, 3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("con_no")));
		Boolean infosale=d.getPageSource().contains("*销售合同");
		try {
			assertTrue(infosale,"确定页面已经打开");
		}catch(AssertionError e) {
			Screenshot.DN(d, "打开合同录入");
			throw e;
		}
		Thread.sleep(2000);
    }
    
    @Test
    @Order(3)
    @DisplayName("case_003_已自动生成合同日期")
    public void salesDate() throws InterruptedException {
    	WebElement htdate = d.findElement(By.xpath(ElementLocate.SALE_CON_DATE));
    	try {
    		assertTrue(htdate.getAttribute("value").contains(CPCDateUtils.getCurDate2()),"合同日期");
    	}catch(AssertionError e) {
    		Screenshot.DN(d, "-生成合同日期");
			throw e;
    	}
    }
}
