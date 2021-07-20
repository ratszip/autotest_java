package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("客户单号,SONO")
public class A4_RefContTest extends PublicTests{
	@Test
	@Order(1)
	@DisplayName("case_001_客户单号")
	   public void Ref_test() throws InterruptedException {
		wrtin(ElementLocate.CUS_ORDER_NUM, "Test:"+System.currentTimeMillis(), "输入客户单号", 2);
    }
	
	@Test
	@Order(2)
	@DisplayName("case_001_单号类别默认不为空")
	public void Order_test() throws InterruptedException {
		textoratrNEq(ElementLocate.ORDER_CATE, 1, "", "单号类别默认不为空");
		Thread.sleep(300);
    }
	
	@Test
	@Order(3)
	@DisplayName("case_002_选择单号类别")
	public void Order_wrin() throws InterruptedException {
		selecpare(ElementLocate.ORDER_CATE, ElementLocate.ORDER_CATE_DOWN, "选择一个单号类别", 1);
		Thread.sleep(200);
	}
	
	@Test
	@Order(4)
	@DisplayName("case002_SO.NO录入")
	public void sono() {
		wrtin(ElementLocate.SONO, "sono test", "SO.NO录入", 2);
	}
	
	@Test
	@Order(5)
	@DisplayName("case_001_联系人")
	public void selectcont() throws InterruptedException {
		selecpare(ElementLocate.CONTACTS, ElementLocate.CONT_DOWN, "选择一个联系人", 2);
    }
	
	@Test
	@Order(6)
	@DisplayName("case_002_删除联系人")
	public void delcont() throws InterruptedException {
		delet(ElementLocate.CONTACTS, "删除联系人", 2);
    }
	
	@Test
	@Order(7)
	@DisplayName("case_003_输入联系人")
	public void wrcont() throws InterruptedException {
		wrtin(ElementLocate.CONTACTS,"联系人test", "输入联系人", 2);
    }

}
