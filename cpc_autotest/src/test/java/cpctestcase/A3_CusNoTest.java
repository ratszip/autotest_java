package cpctestcase;

import com.cpc.Util.CPCDateUtils;
import com.cpc.Util.PublicData;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DisplayName("开票客户")
public class A3_CusNoTest extends PublicTests{
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 9);
	@Test
	@Order(1)
	@DisplayName("case_001_录入开票客户")
	   public void B1_test() throws InterruptedException {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementLocate.DELIVERY_WAY_mk)));
		Thread.sleep(100);
		WebElement kp=d.findElement(By.xpath(ElementLocate.CUS_NO));
		kp.sendKeys("伟展");
		
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ElementLocate.KNITWEAR)));
		Thread.sleep(2000);
		WebElement wz=d.findElement(By.xpath(ElementLocate.KNITWEAR));
		wz.click();
		Thread.sleep(100);
    }
	
	@Test
	@Order(2)
	@DisplayName("case_002_检查客户地址")
	public void advf() throws InterruptedException {
		textoratrNEq(ElementLocate.CUS_ADDR, 2, "");
	}
	
	@Test
	@Order(3)
	@DisplayName("case_003_检查电话")
	public void phvf() throws InterruptedException {
		textoratrNEq(ElementLocate.PHONE_NUM, 2, "");
	}
	/*@Test
	@Order(4)
	@DisplayName("case_004_检查传真")
	public void faxvf() throws InterruptedException {
		textoratrNEq(ElementLocate.FAX_NUM, 2, "", "传真不为空");
	}*/
	@Test
	@Order(5)
	@DisplayName("case_005_检查下单")
	public void xdvf() throws InterruptedException {
		textoratrNEq(ElementLocate.PL_ORDER_TEXT, 1, "");
	}
	@Test
	@Order(6)
	@DisplayName("case_006_检查组别")
	public void zbvf() throws InterruptedException {
		textoratrNEq(ElementLocate.GROUP_BUSI_TEXT_A, 2, "");
	}
	
	@Test
	@Order(7)
	@DisplayName("case_007_检查营业")
	public void savf() throws InterruptedException {
		textoratrNEq(ElementLocate.SALESMAN, 1, "");
	}
	@Test
	@Order(8)
	@DisplayName("case_008_检查订单日期")
	public void ddvf() throws InterruptedException {
		textoratrEq(ElementLocate.ORDER_DATE, 2, CPCDateUtils.getCurDate());
	}
	
}
