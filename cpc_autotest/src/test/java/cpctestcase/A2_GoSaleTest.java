package cpctestcase;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cpc.Util.CPCDateUtils;
import com.cpc.Util.PublicData;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("进入销售合同录入")
public class A2_GoSaleTest extends PublicTests{
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 3);
	@Test
    @Order(1)
    @DisplayName("case_001_打开销售合同录入")
    public void A2_test() throws InterruptedException {
		d.findElement(By.xpath(ElementLocate.ICON)).click();//打开左侧菜单
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementLocate.PRO_STORE)));
		d.findElement(By.xpath(ElementLocate.PRO_STORE)).click();//产品仓系统
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementLocate.SALE_CONTRA)));
		d.findElement(By.xpath(ElementLocate.SALE_CONTRA)).click();//销售合同
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementLocate.SALE_CONTRA_WR)));
		d.findElement(By.xpath(ElementLocate.SALE_CONTRA_WR)).click();//销售合同录入
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("con_no")));
		Boolean infosale=d.getPageSource().contains("*销售合同");
		assertTrue(infosale,"确定页面已经打开");
    }
    
    @Test
    @Order(2)
    @DisplayName("case_002_已自动生成合同日期")
    public void salesDate() throws InterruptedException {
    	WebElement htdate = d.findElement(By.xpath(ElementLocate.SALE_CON_DATE));
    	assertTrue(htdate.getAttribute("value").contains(CPCDateUtils.getCurDate2()),"合同日期");

    }
}
