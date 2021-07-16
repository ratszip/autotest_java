package cpctestcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cpc.Util.PublicData;
import com.cpc.Util.Screenshot;

import CPC_element.ElementLocate;

@DisplayName("SO.NO")
public class SoNo_____Test {
	
	WebDriver d=PublicData.d;
	WebElement sono = d.findElement(By.xpath(ElementLocate.SONO));
	@Test
	@Order(1)
	@DisplayName("case001_SO.NO录入")
	public void sono() {
		//sono.click();
		sono.sendKeys("sono test");
		try {
			assertEquals(sono.getAttribute("value"),"sono test");
		}catch(AssertionError e) {
			Screenshot.DN(d, "-SO.NO录入");
			throw e;
		}
	}
	
}
