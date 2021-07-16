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
import CPC_element.PublicTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@DisplayName("开票客户")
public class CusNo____Test extends PublicTests{
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 10);
	@Test
	@Order(1)
	@DisplayName("case_001_录入开票客户")
	   public void B1_test() throws InterruptedException {
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementLocate.DELIVERY_WAY_mk)));
		Thread.sleep(4000);
		selecpare(ElementLocate.CUS_NO, ElementLocate.KNITWEAR, "选择开票客户",2);
    }
	
	@Test
	@Order(2)
	@DisplayName("case_002_检查开票客户带出的字段")
	   public void B2_test() throws InterruptedException {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementLocate.PL_ORDER_TEXT)));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementLocate.ORDER_DATE)));
		WebElement phonenum = d.findElement(By.xpath(ElementLocate.PHONE_NUM));
		WebElement faxnum = d.findElement(By.xpath(ElementLocate.FAX_NUM));
		WebElement xiadan = d.findElement(By.xpath(ElementLocate.PL_ORDER_TEXT));
		WebElement zubie = d.findElement(By.xpath(ElementLocate.GROUP_BUSI_TEXT));
		WebElement saleman = d.findElement(By.xpath(ElementLocate.SALESMAN));
		WebElement ddrq = d.findElement(By.xpath(ElementLocate.ORDER_DATE));
		WebElement khadr = d.findElement(By.xpath(ElementLocate.CUS_ADDR));
		try {
			assertTrue(khadr.getAttribute("value").length()>3,"客户地址不为空");
			assertTrue(phonenum.getAttribute("value").length()>3, "电话不为空");
			assertTrue(faxnum.getAttribute("value").length()>3, "传真不为空");
			assertTrue(xiadan.getText().length()>1, "下单不为空");
			assertTrue(zubie.getText().length()>0, "组别不为空");
			assertTrue(saleman.getText().length()>1, "营业不为空");
			assertEquals(ddrq.getAttribute("value"), CPCDateUtils.getCurDate());
		}catch(AssertionError e) {
			Screenshot.DN(d, "-开票客户带出的数据");
			throw e;
		}
		Thread.sleep(200);
    }
	
}
