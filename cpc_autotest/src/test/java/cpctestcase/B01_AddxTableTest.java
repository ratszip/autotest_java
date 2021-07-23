package cpctestcase;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cpc.Util.PublicData;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("新增细表")
public class B01_AddxTableTest extends PublicTests{
	
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 3);
	@Test
	@Order(1)
	@DisplayName("case_001_增加一条细表")
	public void xzxb() throws InterruptedException {
		List<WebElement> eles=d.findElements(By.xpath("//*[@id=\"tab-1\"]/div[2]/div/div[2]/div/div/div/table/tbody/tr"));
		int size_before=eles.size();
//		System.out.println(size_before);
		d.findElement(By.xpath(ElementLocate.ADD_X)).click();
//		Thread.sleep(1000);
		eles=d.findElements(By.xpath("//*[@id=\"tab-1\"]/div[2]/div/div[2]/div/div/div/table/tbody/tr"));
		int size_after=eles.size();
//		System.out.println(size_after);
		assertTrue((size_before+1)==size_after,"增加一行");
    }
}
