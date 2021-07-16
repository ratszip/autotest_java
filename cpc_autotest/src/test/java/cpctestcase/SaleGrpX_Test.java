package cpctestcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cpc.Util.PublicData;
import com.cpc.Util.Screenshot;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("下单营业组别品牌交互")
public class SaleGrpX_Test extends PublicTests{
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 2);
	WebElement zb;
	WebElement sale;
	String befozb;
	String befosale;

	Map<String, String> beforemap=
			before_verify(ElementLocate.GROUP_BUSI_TEXT,ElementLocate.SALESMAN);

	@DisplayName("case_001修改下单")
	@Test
	@Order(1)
	public void xiadan() throws InterruptedException {
		selecpare(ElementLocate.PL_ORDER, 
				ElementLocate.PL_ORDER_TEXT, 
				ElementLocate.PL_ORDER_DOWN, 
				ElementLocate.PL_ORDER_DOWN_TEXT,
				"修改下单",0);
	}
	
	@DisplayName("case_002下单带出组别")
	@Test
	@Order(2)
	public void jianyan1() throws InterruptedException {
		Thread.sleep(1000);
		verify(beforemap);
//		wait.until(ExpectedConditions
//				.presenceOfElementLocated(By
//						.xpath(ElementLocate.GROUP_BUSI_TEXT)));
//		
//		zb = d.findElement(By.xpath(ElementLocate.GROUP_BUSI_TEXT));
//		try {
//			assertNotEquals(zb.getText(), befozb);
//			assertTrue(zb.getText().length()>0, "不为空");
//		}catch(AssertionError e) {
//			Screenshot.DN(d, "-带出组别");
//			throw e;
//		}
	}
//	@DisplayName("case_003下单带出营业")
//	@Test
//	@Order(3)
//	public void jianyan2() {
//		
//		wait.until(ExpectedConditions
//				.presenceOfElementLocated(By
//						.xpath(ElementLocate.SALESMAN)));
//		WebElement sale = d.findElement(By.xpath(ElementLocate.SALESMAN));
//		try {
//			assertEquals(sale.getText(), "RICO SIU");
//		}catch(AssertionError e) {
//			Screenshot.DN(d, "-带出营业");
//			throw e;
//		}
//	}
	
	@DisplayName("case_004下单带出品牌")
	@Test
	@Order(4)
	public void jianyan3() {
		WebElement bd = d.findElement(By.xpath(ElementLocate.BRAND));
		bd.click();
		bd.sendKeys("Eddie Bauer");
		bd.sendKeys(Keys.TAB);
		try {
			assertEquals(bd.getAttribute("value"), "Eddie Bauer");
		}catch(AssertionError e) {
			Screenshot.DN(d, "-带出品牌");
			throw e;
		}
	}
}
