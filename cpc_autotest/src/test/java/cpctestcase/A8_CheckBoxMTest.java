package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("主表复选框")
public class A8_CheckBoxMTest extends PublicTests{
	@Test
	@Order(1)
	@DisplayName("case_001_中性包装")
	public void zxbz() throws InterruptedException {
		checkboxSelec(ElementLocate.NETRUL_PAK,ElementLocate.NETRUL_PAK_en,"中性包装勾选");
    }
	@Test
	@Order(2)
	@DisplayName("case_002_过验针机")
	public void gyzj() throws InterruptedException {
		checkboxSelec(ElementLocate.VARY_NEDL,ElementLocate.VARY_NEDL_en,"过验针机勾选");
    }
	@Test
	@Order(3)
	@DisplayName("case_003_含运费")
	public void hyf() throws InterruptedException {
		checkboxSelec(ElementLocate.FREIGHT_CONTAIN,ElementLocate.FREIGHT_CONTAIN_en,"含运费勾选");
    }
	@Test
	@Order(4)
	@DisplayName("case_004_货毛价")
	public void hmj() throws InterruptedException {
		checkboxSelec(ElementLocate.CARGO_GROSS,ElementLocate.CARGO_GROSS_en,"货毛价勾选");
    }
	@Test
	@Order(5)
	@DisplayName("case_005_免收款")
	public void msk() throws InterruptedException {
		checkboxSelec(ElementLocate.FREE_CHEK,ElementLocate.FREE_CHEK_en,"免收款勾选");
    }
	@Test
	@Order(6)
	@DisplayName("case_006_等通知并线")
	public void bx() throws InterruptedException {
		checkboxSelec(ElementLocate.DOUBLING_M,ElementLocate.DOUBLING_M_en,"等通知并线勾选");
    }
	@Test
	@Order(7)
	@DisplayName("case_007_等通知生产")
	public void sc() throws InterruptedException {
		checkboxSelec(ElementLocate.WAIT_PRODUCT,ElementLocate.WAIT_PRODUCT_en,"等通知生产勾选");
    }
	@Test
	@Order(8)
	@DisplayName("case_008_客人色排纺")
	public void krs() throws InterruptedException {
		checkboxSelec(ElementLocate.CUS_SPI,ElementLocate.CUS_SPI_en,"客人色排纺勾选");
    }
	@Test
	@Order(9)
	@DisplayName("case_009_不统计")
	public void btj() throws InterruptedException {
		checkboxSelec(ElementLocate.NOCOUNT,ElementLocate.NOCOUNT_en,"不统计勾选");
    }
}
