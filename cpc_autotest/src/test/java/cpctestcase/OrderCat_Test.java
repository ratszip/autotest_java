package cpctestcase;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("单号类别")
public class OrderCat_Test extends PublicTests{
	
	@Test
	@Order(1)
	@DisplayName("case_001_单号类别默认不为空")
	public void Order_test() throws InterruptedException {
		textoratrNEq(ElementLocate.ORDER_CATE, 1, "", "单号类别默认不为空");
		Thread.sleep(300);
    }
	
	@Test
	@Order(2)
	@DisplayName("case_002_选择单号类别")
	public void Order_wrin() throws InterruptedException {
		selecpare(ElementLocate.ORDER_CATE, ElementLocate.ORDER_CATE_DOWN, "选择一个单号类别", 1);
		Thread.sleep(200);
	}
	
}
