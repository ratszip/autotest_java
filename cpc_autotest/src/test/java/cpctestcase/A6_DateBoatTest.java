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

import CPC_element.ElementLocate;
import CPC_element.PublicTests;


@DisplayName("订单日期-主表")
public class A6_DateBoatTest extends PublicTests{
	//Date date=new Date();
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 2);
	@DisplayName("case_001录入订单日期")
	@Test
	@Order(1)
	public void orderdt() {
		WebElement ordate=d.findElement(By.xpath(ElementLocate.fieldLocate("订单")));
		String nextdate=CPCDateUtils.getSpecifiedDayAfter(CPCDateUtils.getCurDate(),1);
		String js="document.evaluate(\""+
		ElementLocate.fieldLocate("订单")+
		"\",document).iterateNext().value="+
		"'"+nextdate+"'";
		JavascriptExecutor driver_js=((JavascriptExecutor) d);
		driver_js.executeScript(js);
		assertEquals(ordate.getAttribute("value"),nextdate);
	}
	
	@DisplayName("case_002录入船期")
	@Test
	@Order(2)
	public void btdt() {
		WebElement btdate=d.findElement(By.xpath(ElementLocate.fieldLocate("船期")));
		String next2date=CPCDateUtils.getSpecifiedDayAfter(CPCDateUtils.getCurDate(),2);
		String js2="document.evaluate(\""+
		ElementLocate.fieldLocate("船期")+
		"\",document).iterateNext().value="+
		"'"+next2date+"'";
		JavascriptExecutor driver_js2=((JavascriptExecutor) d);
		driver_js2.executeScript(js2);
		assertEquals(btdate.getAttribute("value"),next2date);
	}
	
}
