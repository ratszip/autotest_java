package cpctestcase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cpc.Util.CPCDateUtils;
import com.cpc.Util.PublicData;
import com.cpc.Util.Screenshot;

import CPC_element.ElementLocate;


@DisplayName("订单日期-主表")
public class OrderDate_Test {
	//Date date=new Date();
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 2);
	@DisplayName("case_001录入订单日期")
	@Test
	@Order(1)
	public void orderdt() {
		WebElement ordate=d.findElement(By.xpath(ElementLocate.ORDER_DATE));
		String nextdate=CPCDateUtils.getSpecifiedDayAfter(CPCDateUtils.getCurDate(),1);
		String js="var q=document.getElementById('input-263');q.value="+'\"'+nextdate+'\"';
		JavascriptExecutor driver_js=((JavascriptExecutor) d);
		driver_js.executeScript(js);
		try {
			assertEquals(ordate.getAttribute("value"),nextdate);
		}catch(AssertionError e) {
			Screenshot.DN(d, "-输入当天的下一天");
			throw e;
		}
		
		
	}
	
}
