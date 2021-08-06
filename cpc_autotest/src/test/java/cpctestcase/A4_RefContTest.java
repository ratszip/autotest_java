package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("客户单号到联系人")
public class A4_RefContTest extends PublicTests{
	@Test
	@Order(1)
	@DisplayName("case_001_客户单号")
	   public void Ref_test() throws InterruptedException {
		wrtin(ElementLocate.fieldLocate("客户单号"), "Test:"+System.currentTimeMillis(), 2);
    }
	
	@Test
	@Order(2)
	@DisplayName("case_002_单号类别默认不为空")
	public void Order_test() throws InterruptedException {
		textoratrNEq(ElementLocate.fieldLocate("单号类别"), 1, "");
		Thread.sleep(200);
    }
	
	@Test
	@Order(3)
	@DisplayName("case_003_下单客户")
	public void ordercus() throws InterruptedException {
		wrtin(ElementLocate.fieldLocate("下单客户"),"东莞升丽针织有限公司",2);
		Thread.sleep(200);
	}
	
	@Test
	@Order(4)
	@DisplayName("case_003_选择单号类别")
	public void Order_wrin() throws InterruptedException {
		selecpare(ElementLocate.chooseVeryf("单号类别", "Commission spinning"));
		Thread.sleep(200);
	}
	
	@Test
	@Order(5)
	@DisplayName("case_004_SO.NO录入")
	public void sono() throws InterruptedException {
		wrtin(ElementLocate.fieldLocate("SO No"), "sono test", 2);
	}
	
	@Test
	@Order(6)
	@DisplayName("case_005_联系人")
	public void selectcont() throws InterruptedException {
		
		selecpare(ElementLocate.chooseVeryf("联系人","曾广仲"));
    }
	
	@Test
	@Order(7)
	@DisplayName("case_006_删除联系人")
	public void delcont() throws InterruptedException {
		delet(ElementLocate.fieldLocate("联系人"), 2);
    }
	
	@Test
	@Order(8)
	@DisplayName("case_007_输入联系人")
	public void wrcont() throws InterruptedException {
		wrtin(ElementLocate.fieldLocate("联系人"),"Berry test", 2);
    }
	
	@Test
	@Order(9)
	@DisplayName("case_007_输入传真")
	public void wrfax() throws InterruptedException {
		wrtin(ElementLocate.fieldLocate("客户传真"),"07968888", 2);
    }

}
