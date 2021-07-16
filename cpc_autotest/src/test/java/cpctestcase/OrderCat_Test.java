package cpctestcase;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cpc.Util.PublicData;
import com.cpc.Util.Screenshot;

import CPC_element.ElementLocate;

@DisplayName("单号类别")
public class OrderCat_Test {
	WebDriver d=PublicData.d;
	WebElement dhlb = d.findElement(By.xpath(ElementLocate.ORDER_CATE));
	
	@Test
	@Order(1)
	@DisplayName("case_001_单号类别默认不为空")
	public void Order_test() throws InterruptedException {
		try {
			assertTrue(dhlb.getText().length()>3,"单号类别不为空");
		}catch(AssertionError e) {
			Screenshot.DN(d, "-单号类别默认值");
			throw e;
		}
		Thread.sleep(500);
    }
	
	@Test
	@Order(2)
	@DisplayName("case_002_选择单号类别")
	public void Order_wrin() throws InterruptedException {
		dhlb.click();
		WebElement seldh = d.findElement(By.xpath(ElementLocate.ORDER_CATE_DOWN));
		Thread.sleep(300);
		seldh.click();
		//列表刷新，需要重新findElement一次，不然会出错...no attach...
		dhlb=d.findElement(By.xpath(ElementLocate.ORDER_CATE));
		try {
			assertNotEquals(dhlb.getText(), "Your order no.");
		}catch(AssertionError e) {
			Screenshot.DN(d, "-选择单号类别");
			throw e;
		}
		Thread.sleep(200);
	}
	
}
