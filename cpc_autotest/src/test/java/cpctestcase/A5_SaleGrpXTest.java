package cpctestcase;

import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.cpc.Util.Log;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;
import io.github.artsok.RepeatedIfExceptionsTest;

@DisplayName("下单营业组别品牌交互")
@TestInstance(Lifecycle.PER_CLASS)
public class A5_SaleGrpXTest extends PublicTests{
	
	Map<String, String> beforemap;
	
	@BeforeAll
	public void set() {
		beforemap=before_verify(ElementLocate.GROUP_BUSI_TEXT,ElementLocate.fieldLocate("营业")[1]);
	}
	
	@Test
	@Order(1)
	@DisplayName("case_001_品牌")
	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void brand() throws InterruptedException {
		Log.info("输入品牌");
		wrtin(ElementLocate.fieldLocate("品牌")[1], "Eddie Bauer" );
	}
	@DisplayName("case_002修改下单")
	@Test
	@Order(2)
	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void xiadan() throws InterruptedException {
		Log.info("选择一个下单人");
		selecpare(ElementLocate.chooseVeryf("下单", "BONNY HUANG"));
	}
	
	@DisplayName("case_003下单带出组别")
	@Test
	@Order(3)
	public void jianyan1() throws InterruptedException {
		Thread.sleep(500);
		Log.info("验证下单带出的组别");
		verify(beforemap);
	}
	
	@DisplayName("case_004下单带出品牌")
	@Test
	@Order(4)
	public void jianyan3() throws InterruptedException {
		Log.info("输入品牌");
		wrtin(ElementLocate.fieldLocate("品牌")[1], ElementLocate.rtTextlocat("AP"),"AP");
	}
	
	@DisplayName("case_005选择类型")
	@Test
	@Order(5)
	public void cate() throws InterruptedException {
		Log.info("选择类型");
		selecpare(ElementLocate.chooseVeryf("类型", "取库存"));
	}
}
