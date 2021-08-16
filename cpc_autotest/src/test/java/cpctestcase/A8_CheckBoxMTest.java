package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.cpc.Util.Log;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("主表复选框")
public class A8_CheckBoxMTest extends PublicTests{
	@Test
	@Order(1)
	@DisplayName("case_001_中性包装")
	public void zxbz() throws InterruptedException {
		Log.info("勾选中性包装");
		checkboxSelec(ElementLocate.checkpath("中性包装"));
    }
	@Test
	@Order(2)
	@DisplayName("case_002_过验针机")
	public void gyzj() throws InterruptedException {
		Log.info("勾选过验针机");
		checkboxSelec(ElementLocate.checkpath("过验针机"));
    }
	@Test
	@Order(3)
	@DisplayName("case_003_含运费")
	public void hyf() throws InterruptedException {
		Log.info("勾选含运费");
		checkboxSelec(ElementLocate.checkpath("含运费"));
    }
	@Test
	@Order(4)
	@DisplayName("case_004_货毛价")
	public void hmj() throws InterruptedException {
		Log.info("勾选货毛价");
		checkboxSelec(ElementLocate.checkpath("货毛价"));
    }
	@Test
	@Order(5)
	@DisplayName("case_005_免收款")
	public void msk() throws InterruptedException {
		Log.info("勾选免收款");
		checkboxSelec(ElementLocate.checkpath("免收款"));
    }
	@Test
	@Order(6)
	@DisplayName("case_006_等通知并线")
	public void bx() throws InterruptedException {
		Log.info("勾选等通知并线");
		checkboxSelec(ElementLocate.checkpath("等通知并线"));
    }
	@Test
	@Order(7)
	@DisplayName("case_007_等通知生产")
	public void sc() throws InterruptedException {
		Log.info("勾选等通知生产");
		checkboxSelec(ElementLocate.checkpath("等通知生产"));
    }
	@Test
	@Order(8)
	@DisplayName("case_008_客人色排纺")
	public void krs() throws InterruptedException {
		Log.info("勾选客人色排纺");
		checkboxSelec(ElementLocate.checkpath("客人色排纺"));
    }
	@Test
	@Order(9)
	@DisplayName("case_009_不统计")
	public void btj() throws InterruptedException {
		Log.info("勾选不统计");
		checkboxSelec(ElementLocate.checkpath("不统计"));
    }
}
