package cpctestcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cpc.Util.PublicData;
import com.cpc.Util.Screenshot;

import CPC_element.ElementLocate;

@DisplayName("类型-主表")
public class Category__Test {
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 2);
	@DisplayName("case_001选择类型")
	@Test
	@Order(1)
	public void cate() throws InterruptedException {
		WebElement lx=d.findElement(By.xpath(ElementLocate.CATEGORY));
		lx.click();
		d.findElement(By.xpath(ElementLocate.G_STOCK)).click();
		try {
			assertEquals(lx.getText(),"取库存");
		}catch(AssertionError e) {
			Screenshot.DN(d, "-选择取库存");
			throw e;
		}
		Thread.sleep(200);
	}
}
