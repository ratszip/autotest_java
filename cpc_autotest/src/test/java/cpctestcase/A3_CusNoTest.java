package cpctestcase;

import com.cpc.Util.CPCDateUtils;
import com.cpc.Util.PublicData;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@DisplayName("开票客户")
public class A3_CusNoTest extends PublicTests{
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 9);
	@Test
	@Order(1)
	@DisplayName("case_001_录入开票客户")
	   public void B1_test() throws InterruptedException {
		Thread.sleep(1000);
		wrtin(ElementLocate.fieldLocate("开票客户"), "东莞伟展时装针织有限公司", 2);
		Thread.sleep(100);
    }
	
	@Test
	@Order(2)
	@DisplayName("case_002_检查客户地址")
	public void advf() throws InterruptedException {
		textoratrNEq(ElementLocate.fieldLocate("客户地址"), 2, "");
	}
	
	@Test
	@Order(3)
	@DisplayName("case_003_检查电话")
	public void phvf() throws InterruptedException {
		textoratrNEq(ElementLocate.fieldLocate("客户电话"), 2, "");
	}
	
	@Test
	@Order(4)
	@DisplayName("case_004_检查下单")
	public void xdvf() throws InterruptedException {
		textoratrNEq(ElementLocate.fieldLocate("下单"), 1, "");
	}
	@Test
	@Order(5)
	@DisplayName("case_005_检查组别")
	public void zbvf() throws InterruptedException {
		textoratrNEq(ElementLocate.GROUP_BUSI_TEXT, 2, "");
	}
	
	@Test
	@Order(6)
	@DisplayName("case_006_检查营业")
	public void savf() throws InterruptedException {
		textoratrNEq(ElementLocate.fieldLocate("营业"), 1, "");
	}
	@Test
	@Order(7)
	@DisplayName("case_007_检查订单日期")
	public void ddvf() throws InterruptedException {
		textoratrEq(ElementLocate.fieldLocate("订单"), 2, CPCDateUtils.getCurDate());
	}
	
}
