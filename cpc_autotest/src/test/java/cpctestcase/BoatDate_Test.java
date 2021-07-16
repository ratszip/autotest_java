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


@DisplayName("船期-主表")
public class BoatDate_Test {
	//Date date=new Date();
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 2);
	@DisplayName("case_001录入船期")
	@Test
	@Order(1)
	public void btdt() {
		WebElement btdate=d.findElement(By.id("input-264"));
		String next2date=CPCDateUtils.getSpecifiedDayAfter(CPCDateUtils.getCurDate(),2);
		String js="var q=document.getElementById('input-264');q.value="+'\"'+next2date+'\"';
		JavascriptExecutor driver_js=((JavascriptExecutor) d);
		driver_js.executeScript(js);
		try {
			assertEquals(btdate.getAttribute("value"),next2date);
		}catch(AssertionError e) {
			Screenshot.DN(d, "-输入后天");
			throw e;
		}
	}
	
}
