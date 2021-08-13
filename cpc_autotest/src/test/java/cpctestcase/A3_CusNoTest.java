package cpctestcase;

import com.cpc.Util.CPCDateUtils;
import com.cpc.Util.Log;
import com.cpc.Util.PublicData;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;
import io.github.artsok.RepeatedIfExceptionsTest;

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
	@RepeatedIfExceptionsTest(repeats=5,minSuccess = 1)
	   public void B1_test() throws InterruptedException {
		Thread.sleep(1000);
		Log.info("选择开票客户");
		wrtin(ElementLocate.fieldLocate("开票客户")[1], "东莞伟展时装针织有限公司");
		Thread.sleep(100);
    }
	
	@Test
	@Order(2)
	@DisplayName("case_002_检查客户地址")
	public void advf() throws InterruptedException {
		Log.info("检查客户地址是否为空");
		textoratrNEq(ElementLocate.fieldLocate("客户地址")[1], "");
	}
	
	@Test
	@Order(3)
	@DisplayName("case_003_检查电话")
	public void phvf() throws InterruptedException {
		Log.info("检查客户电话是否为空");
		textoratrNEq(ElementLocate.fieldLocate("客户电话")[1], "");
	}
	
	@Test
	@Order(4)
	@DisplayName("case_004_检查下单")
	public void xdvf() throws InterruptedException {
		Log.info("检查下单人是否为空");
		textoratrNEq(ElementLocate.fieldLocate("下单")[1], "");
	}
	@Test
	@Order(5)
	@DisplayName("case_005_检查组别")
	public void zbvf() throws InterruptedException {
		Log.info("检查组别是否为空");
		textoratrNEq(ElementLocate.GROUP_BUSI_TEXT, "");
	}
	
	@Test
	@Order(6)
	@DisplayName("case_006_检查营业")
	public void savf() throws InterruptedException {
		Log.info("检查营业是否为空");
		textoratrNEq(ElementLocate.fieldLocate("营业")[1], "");
	}
	@Test
	@Order(7)
	@DisplayName("case_007_检查订单日期")
	public void ddvf() throws InterruptedException {
		Log.info("检查订单日期是否是今天");
		textoratrEq(ElementLocate.fieldLocate("订单")[1],CPCDateUtils.getCurDate());
	}
	
}
