package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.cpc.Util.Log;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;
import io.github.artsok.RepeatedIfExceptionsTest;

@DisplayName("客户单号到联系人")
public class A4_RefContTest extends PublicTests{
	@Test
	@Order(1)
	@DisplayName("case_001_客户单号")
	public void Ref_test() throws InterruptedException {
		Log.info("填写客户单号");
		wrtin(ElementLocate.fieldLocate("客户单号")[1], "Test:"+System.currentTimeMillis());
    }
	
	@Test
	@Order(2)
	@DisplayName("case_002_单号类别默认不为空")
	public void Order_test() throws InterruptedException {
		Log.info("验证单号类别不为空");
		textoratrNEq(ElementLocate.fieldLocate("单号类别")[1], "");
		Thread.sleep(200);
    }
	
	@Test
	@Order(3)
	@DisplayName("case_003_下单客户")
	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void ordercus() throws InterruptedException {
		Log.info("输入下单客户");
		wrtin(ElementLocate.fieldLocate("下单客户")[1],"东莞升丽针织有限公司");
		Thread.sleep(200);
	}
	
	@Test
	@Order(4)
	@DisplayName("case_003_选择单号类别")
	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void Order_wrin() throws InterruptedException {
		Log.info("选择单号类别");
		selecpare(ElementLocate.chooseVeryf("单号类别", "Commission spinning"));
		Thread.sleep(200);
	}
	
	@Test
	@Order(5)
	@DisplayName("case_004_SO.NO录入")
	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void sono() throws InterruptedException {
		Log.info("填入SO.NO");
		wrtin(ElementLocate.fieldLocate("SO No")[1], "sono test");
	}
	
	@Test
	@Order(6)
	@DisplayName("case_005_联系人")
	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void selectcont() throws InterruptedException {
		Log.info("选择联系人");
		selecpare(ElementLocate.chooseVeryf("联系人","曾广仲"));
    }
	
	@Test
	@Order(7)
	@DisplayName("case_006_删除联系人")
	public void delcont() throws InterruptedException {
		Log.info("删除联系人");
		delet(ElementLocate.fieldLocate("联系人")[1], 2);
    }
	
	@Test
	@Order(8)
	@DisplayName("case_007_输入联系人")
	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void wrcont() throws InterruptedException {
		Log.info("输入联系人");
		wrtin(ElementLocate.fieldLocate("联系人")[1],"Berry test");
    }
	
	@Test
	@Order(9)
	@DisplayName("case_007_输入传真")
	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void wrfax() throws InterruptedException {
		Log.info("输入客户传真");
		wrtin(ElementLocate.fieldLocate("客户传真")[1],"07968888");
    }

}
