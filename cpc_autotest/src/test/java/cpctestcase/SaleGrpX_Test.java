package cpctestcase;

import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("下单营业组别品牌交互")
@TestInstance(Lifecycle.PER_CLASS)
public class SaleGrpX_Test extends PublicTests{
	
	Map<String, String> beforemap;
	
	@BeforeAll
	public void set() {
		beforemap=before_verify(ElementLocate.GROUP_BUSI_TEXT,ElementLocate.SALESMAN);
	}
	@DisplayName("case_001修改下单")
	@Test
	@Order(1)
	public void xiadan() throws InterruptedException {
		selecpare(ElementLocate.PL_ORDER, 
				ElementLocate.PL_ORDER_TEXT, 
				ElementLocate.PL_ORDER_DOWN, 
				ElementLocate.PL_ORDER_DOWN_TEXT,
				"修改下单",0);
	}
	
	@DisplayName("case_002下单带出组别")
	@Test
	@Order(2)
	public void jianyan1() throws InterruptedException {
		Thread.sleep(500);
		verify(beforemap,"带出组别营业");
	}
	
	@DisplayName("case_003下单带出品牌")
	@Test
	@Order(3)
	public void jianyan3() {
		wrtin(ElementLocate.BRAND, "Eddie Bauer", "带出品牌",2 );
	}
}
