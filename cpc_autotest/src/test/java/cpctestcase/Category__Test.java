package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cpc.Util.PublicData;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("类型-主表")
public class Category__Test extends PublicTests {
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 2);
	@DisplayName("case_001选择类型")
	@Test
	@Order(1)
	public void cate() throws InterruptedException {
		selecpare(ElementLocate.CATEGORY, ElementLocate.G_STOCK, "选择类型", 1);
	}
}
