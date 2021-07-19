package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cpc.Util.PublicData;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;


@DisplayName("联系人")
public class Contact___Test extends PublicTests {
	WebDriver d=PublicData.d;
	WebElement ct = d.findElement(By.xpath(ElementLocate.CONTACTS));
	@Test
	@Order(1)
	@DisplayName("case_001_联系人")
	public void selectcont() throws InterruptedException {
		selecpare(ElementLocate.CONTACTS, ElementLocate.CONT_DOWN, "选择一个联系人", 2);
		
    }
	
	@Test
	@Order(2)
	@DisplayName("case_002_删除联系人")
	public void delcont() throws InterruptedException {
		delet(ElementLocate.CONTACTS, "删除联系人", 2);
    }
	
	@Test
	@Order(3)
	@DisplayName("case_003_输入联系人")
	public void wrcont() throws InterruptedException {
		wrtin(ElementLocate.CONTACTS,"联系人test", "输入联系人", 2);
    }
}
