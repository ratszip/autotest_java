package cpctestcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cpc.Util.PublicData;
import com.cpc.Util.Screenshot;

import CPC_element.ElementLocate;

@DisplayName("客户单号")
public class RefOrder_Test {
	WebDriver d=PublicData.d;
	@Test
	@Order(1)
	@DisplayName("case_001_客户单号")
	   public void Ref_test() throws InterruptedException {
			WebElement refno = d.findElement(By.xpath(ElementLocate.CUS_ORDER_NUM));
			refno.click();
			refno.sendKeys("客户单号test");
			refno.sendKeys(Keys.TAB);
			try {
				assertEquals("客户单号test",refno.getAttribute("value"));
			}catch(AssertionError e) {
				Screenshot.DN(d, "-输入客户单号");
				throw e;
			}
			Thread.sleep(200);
    }
}
