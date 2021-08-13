package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.cpc.Util.Log;

import CPC_element.PublicTests;
import io.github.artsok.RepeatedIfExceptionsTest;

@DisplayName("订单日期-主表")
public class A6_DateBoatTest extends PublicTests{
	@DisplayName("case_001录入订单日期")
	@Test
	@Order(1)
	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void orderdt() {
		Log.info("填写订单日期");
		jsdate("订单",1);
	}
	
	@DisplayName("case_002录入船期")
	@Test
	@Order(2)
	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void btdt() {
		Log.info("填写船期");
		jsdate("船期",2);
	}
	
	
	
}
