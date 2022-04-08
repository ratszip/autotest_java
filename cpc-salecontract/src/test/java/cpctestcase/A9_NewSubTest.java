package cpctestcase;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cpc.Util.CPCDateUtils;
import com.cpc.Util.Log;
import com.cpc.Util.PublicData;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("新增子表")
public class A9_NewSubTest extends PublicTests{
	WebDriver d=PublicData.d;
	@Test
    @Order(1)
    @DisplayName("点击新增")
    public void newsub() throws InterruptedException {
		Log.info("点击新增细表");
		WebElement vele= d.findElement(By.xpath("//tbody/tr/td"));
		assertEquals("No data available", vele.getText());
		btclick(ElementLocate.buttonM("新增细表"));
		WebElement vele2= d.findElement(By.xpath("//tbody/tr[2]"));
		assertTrue(vele2.isDisplayed());
	}
	
	@Test
    @Order(2)
    @DisplayName("添加色号")
    public void sehao() throws InterruptedException {
		Log.info("添加色号");
		WebElement vele= d.findElement(By.xpath("//tbody/tr[2]/td[6]/div/div/div/div/input"));
		vele.sendKeys("GC-1111");
		vele.sendKeys(Keys.TAB);
	}
	
	@Test
    @Order(3)
    @DisplayName("添加数量")
    public void shul() throws InterruptedException {
		Log.info("添加数量");
		WebElement vele= d.findElement(By.xpath("//*[@id='qty_1']"));
		vele.sendKeys("3");
		vele.sendKeys(Keys.TAB);
	}
	
	@Test
    @Order(4)
    @DisplayName("添加单价")
    public void danjia() throws InterruptedException {
		Log.info("添加单价");
		WebElement vele= d.findElement(By.xpath("//tbody/tr[2]/td[45]/div/div/div/div/input"));
		vele.clear();
		vele.sendKeys("75");
		vele.sendKeys(Keys.TAB);
	}
	
	@Test
    @Order(5)
    @DisplayName("速递方式")
    public void sdfs() throws InterruptedException {
		Log.info("速递方式");
		String xpath="//tbody/tr[2]/td[55]/div/div/div/div";
		selecpare(ElementLocate.xlocate("速递方式",xpath,"港车(H)"));
		Thread.sleep(200);
	}
	
	@Test
    @Order(6)
    @DisplayName("送货结束")
    public void shjs() throws InterruptedException {
		Log.info("送货结束");
		String xpath="//tbody/tr[2]/td[52]/div/div/div/div/input";
		WebElement vele= d.findElement(By.xpath(xpath));
		String nextNday=CPCDateUtils.getSpecifiedDayAfter(CPCDateUtils.getCurDate(),2);
		vele.sendKeys(nextNday);
		assertEquals(vele.getAttribute("value"),nextNday);
	}
	
	@Test
    @Order(7)
    @DisplayName("选择收货公司")
    public void shgs() throws InterruptedException {
		Log.info("添加单价");
		String xpath="//tbody/tr[2]/td[56]/div/div/div/div/input";
		selecpare(ElementLocate.xlocate("收货公司",xpath,"东莞升丽针织有限公司"));
		Thread.sleep(200);
//		d.close();
	}
	
//	@Test
//  @Order(8)
//  @DisplayName("保存")
//  public void bcun() throws InterruptedException {
//		Log.info("保存");
//		btclick(ElementLocate.buttoz("保存"));
//		Thread.sleep(200);
//	}
}
