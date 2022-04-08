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
import com.cpc.Util.Log;
import com.cpc.Util.PublicData;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("进入销售合同录入")
public class A2_GoSaleTest extends PublicTests{
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 9);
	@Test
    @Order(1)
    @DisplayName("case_001_打开销售合同录入")
//	@RepeatedIfExceptionsTest(repeats=5,minSuccess = 1)
    public void A2_test() throws InterruptedException {
		WebElement ele=d.findElement(By.xpath(ElementLocate.ICON));
		Log.info("打开左侧菜单");
		ele.click();
		d.findElement(By.xpath(ElementLocate.PRO_STORE)).click();//产品仓系统
		Log.info("打开产品仓系统");
		Thread.sleep(100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementLocate.SALE_CONTRA)));
		Log.info("打开销售合同");
		d.findElement(By.xpath(ElementLocate.SALE_CONTRA)).click();//销售合同
		Thread.sleep(100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementLocate.SALE_CONTRA_WR)));
		Log.info("打开销售合同录入");
		d.findElement(By.xpath(ElementLocate.SALE_CONTRA_WR)).click();//销售合同录入
		Thread.sleep(100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("con_no")));
		Boolean infosale=d.getPageSource().contains("*销售合同");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementLocate.DELIVERY_WAY_mk)));
		assertTrue(infosale,"确定页面已经打开");
		Log.info("验证页面是否打开");
    }
    
    @Test
    @Order(2)
    @DisplayName("case_002_已自动生成合同日期")
//    @RepeatedIfExceptionsTest(repeats=5,minSuccess = 1)
    public void salesDate() throws InterruptedException {
    	Log.info("验证自动生成了合同日期");
    	assertBoolean(ElementLocate.fieldLocate("合同日期")[1], CPCDateUtils.getCurDate2(), 2);
    }
}
