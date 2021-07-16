package cpctestcase;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

@DisplayName("联系人")
public class Contact___Test {
	WebDriver d=PublicData.d;
	WebElement ct = d.findElement(By.xpath(ElementLocate.CONTACTS));
	@Test
	@Order(1)
	@DisplayName("case_001_联系人")
	   public void selectcont() throws InterruptedException {
			ct.click();
			WebElement ctinfo = d.findElement(By.xpath(ElementLocate.CONT_DOWN));
			ctinfo.click();
			
			//ct.sendKeys()
			try {
				assertTrue(ct.getAttribute("value").length()>1,"选择了联系人");
			}catch(AssertionError e) {
				Screenshot.DN(d, "-选择联系人");
				throw e;
			}
			Thread.sleep(200);
    }
	
	@Test
	@Order(2)
	@DisplayName("case_002_输入联系人")
	   public void wrtcont() throws InterruptedException {
			int clear=ct.getAttribute("value").length();
			for(int i=clear;i>0;i--) {
				ct.sendKeys(Keys.BACK_SPACE);
			}
			ct.sendKeys("cont test");
			ct.sendKeys(Keys.TAB);
			try {
				assertEquals(ct.getAttribute("value"),"cont test");
			}catch(AssertionError e) {
				Screenshot.DN(d, "-输入联系人");
				throw e;
			}
			Thread.sleep(200);
    }
}
