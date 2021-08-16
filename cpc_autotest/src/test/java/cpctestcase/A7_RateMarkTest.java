package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.cpc.Util.Log;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("年份季度到单价备注")
public class A7_RateMarkTest extends PublicTests{
	
	@Test
	@Order(1)
	@DisplayName("case_001_年份")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void year() throws InterruptedException {
		Log.info("选择年份");
		selecpare(ElementLocate.chooseVeryf("年份", "2022"));
	}
	
	@Test
	@Order(2)
	@DisplayName("case_002_季度")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void season() throws InterruptedException {
		Log.info("选择季度");
		selecpare(ElementLocate.chooseVeryf("季度", "Spring/Summer"));
	}
	
	@Test
	@Order(3)
	@DisplayName("case_003_误差率")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void rate() throws InterruptedException {
		Log.info("选择误差率");
		selecpare(ElementLocate.chooseVeryf("误差率", "0.05"));
	}
	
	@Test
	@Order(4)
	@DisplayName("case_004_目的港")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void des() throws InterruptedException {
		Log.info("输入目的港");
		wrtin(ElementLocate.fieldLocate("目的港")[1], "DESHARBOR-test");
    }
	
	@Test
	@Order(5)
	@DisplayName("case_005_主表状态")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void state() throws InterruptedException {
		Log.info("选择主表状态");
		selecpare(ElementLocate.chooseVeryf("状态", "在用(U)"));
    }
	
	@Test
	@Order(6)
	@DisplayName("case_006_贸易方式")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void trade() throws InterruptedException {
		Log.info("选择贸易方式");
		selecpare(ElementLocate.chooseVeryf("贸易方式", "内销(D)"));
    }
	@Test
	@Order(7)
	@DisplayName("case_007_贸易条款")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void tradet() throws InterruptedException {
		Log.info("选择贸易条款");
		selecpare(ElementLocate.chooseVeryf("贸易条款", "FOB China 中国"));
    }
	
	@Test
	@Order(8)
	@DisplayName("case_008_交货方式")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void deliv() throws InterruptedException {
		Log.info("选择交货方式");
		selecpare(ElementLocate.chooseVeryf("交货方式", "空運 by air"));
    }
	
	@Test
	@Order(9)
	@DisplayName("case_009_付款方式")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void pay() throws InterruptedException {
		Log.info("选择付款方式");
		selecpare(ElementLocate.chooseVeryf("付款方式", "30D"));
    }
	
	@Test
	@Order(10)
	@DisplayName("case_010_订单类型")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void ordcate() throws InterruptedException {
		Log.info("选择订单类型");
		selecpare(ElementLocate.chooseVeryf("订单类型", "Bulk"));
    }
	
	@Test
	@Order(11)
	@DisplayName("case_011_出货类型")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void sip() throws InterruptedException {
		Log.info("选择出货类型");
		selecpare(ElementLocate.chooseVeryf("出货类型", "等通知出货"));
    }
	@Test
	@Order(12)
	@DisplayName("case_012_认证")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void auth() throws InterruptedException {
		Log.info("选择认证");
		selecpare(ElementLocate.chooseVeryf("认证", "GOTS"));
    }
	@Test
	@Order(13)
	@DisplayName("case_013_免收款用途")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void freefor() throws InterruptedException {
		Log.info("选择免收款用途");
		selecpare(ElementLocate.chooseVeryf("免收款用途", "UPW纱展"));
    }
	
	@Test
	@Order(14)
	@DisplayName("case_014_免收款备注")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void freemark() throws InterruptedException {
		Log.info("填入免收款备注");
		wrtin(ElementLocate.fieldLocate("免收款备注")[1], "Free-test");
    }
	
	@Test
	@Order(15)
	@DisplayName("case_015_送货单标注")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void delimark() throws InterruptedException {
		Log.info("输入送货单标注");
		wrtin(ElementLocate.fieldLocate("送货单标注")[1], "Deliv-test");
    }
	@Test
	@Order(16)
	@DisplayName("case_016_备注")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void mainmark() throws InterruptedException {
		Log.info("输入备注");
		wrtin(ElementLocate.fieldLocate("备注")[1], "MainMark-test");
    }
	@Test
	@Order(17)
	@DisplayName("case_017_单价备注")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void pricemark() throws InterruptedException {
		Log.info("输入单价备注");
		wrtin(ElementLocate.fieldLocate("单价备注")[1], "uprice-test");
    }
	@Test
	@Order(18)
	@DisplayName("case_018_开发者编号")
//	@RepeatedIfExceptionsTest(repeats=3,minSuccess = 1)
	public void devbh() throws InterruptedException {
		Log.info("输入开发者编号");
		wrtin(ElementLocate.fieldLocate("开发编号")[1], "uprice-test");
    }
}
