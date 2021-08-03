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
		wrtin(ElementLocate.CUS_ORDER_NUM, "Test:"+System.currentTimeMillis(), 2);
    }
	
	@Test
	@Order(2)
	@DisplayName("case_002_单号类别默认不为空")
	public void Order_test() throws InterruptedException {
		textoratrNEq(ElementLocate.ORDER_CATE, 1, "");
		Thread.sleep(300);
    }
	
	@Test
	@Order(3)
	@DisplayName("case_003_下单客户")
	public void ordercus() throws InterruptedException {
		wrtin(ElementLocate.CUST_ORDER, ElementLocate.UPWKH2966,"升丽", 2);
		Thread.sleep(200);
	}
	
	@Test
	@Order(4)
	@DisplayName("case_003_选择单号类别")
	public void Order_wrin() throws InterruptedException {
		selecpare(ElementLocate.ORDER_CATE, ElementLocate.ORDER_CATE_DOWN, 1);
		Thread.sleep(200);
	}
	
	@Test
	@Order(5)
	@DisplayName("case_004_SO.NO录入")
	public void sono() {
		wrtin(ElementLocate.SONO, "sono test", 2);
	}
	
	@Test
	@Order(6)
	@DisplayName("case_005_联系人")
	public void selectcont() throws InterruptedException {
		selecpare(ElementLocate.CONTACTS, ElementLocate.CONT_DOWN, 2);
    }
	
	@Test
	@Order(7)
	@DisplayName("case_006_删除联系人")
	public void delcont() throws InterruptedException {
		delet(ElementLocate.CONTACTS, 2);
    }
	
	@Test
	@Order(8)
	@DisplayName("case_007_输入联系人")
	public void wrcont() throws InterruptedException {
		wrtin(ElementLocate.CONTACTS,"联系人test", 2);
    }
	
	@Test
	@Order(9)
	@DisplayName("case_007_输入传真")
	public void wrfax() throws InterruptedException {
		wrtin(ElementLocate.FAX_NUM,"07968888", 2);
    }

}
