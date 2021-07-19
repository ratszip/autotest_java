package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("客户单号")
public class RefOrder_Test extends PublicTests{
	@Test
	@Order(1)
	@DisplayName("case_001_客户单号")
	   public void Ref_test() throws InterruptedException {
		wrtin(ElementLocate.CUS_ORDER_NUM, "Test:"+System.currentTimeMillis(), "输入客户单号", 2);
    }
}
