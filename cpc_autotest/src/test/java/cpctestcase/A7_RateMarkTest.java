package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("年份季度到单价备注")
public class A7_RateMarkTest extends PublicTests{
	
	@Test
	@Order(1)
	@DisplayName("case_001_年份")
	public void year() throws InterruptedException {
		selecpare(ElementLocate.YEAR,ElementLocate.YEAR_TEXT, 
				ElementLocate.YEAR_DOWN, 1);
	}
	
	@Test
	@Order(2)
	@DisplayName("case_002_季度")
	public void season() throws InterruptedException {
		selecpare(ElementLocate.SEASON,
				ElementLocate.SEASON_TEXT, 
				ElementLocate.SEASON_DOWN,1);
	}
	
	@Test
	@Order(3)
	@DisplayName("case_003_误差率")
	public void rate() throws InterruptedException {
		selecpare(ElementLocate.RATE_M, 
				ElementLocate.RATE_M_TEXT, 
				ElementLocate.RATE_M_DOWN, 1);
	}
	
	@Test
	@Order(4)
	@DisplayName("case_004_目的地")
	public void des() throws InterruptedException {
		wrtin(ElementLocate.DESHARBOR, "DESHARBOR-test", 2);
    }
	
	@Test
	@Order(5)
	@DisplayName("case_005_主表状态")
	public void state() throws InterruptedException {
		selecpare(ElementLocate.STATE_M,
				ElementLocate.STATE_M_TEXT,
				ElementLocate.STATE_M_DOWN, 1);
    }
	
	@Test
	@Order(6)
	@DisplayName("case_006_贸易方式")
	public void trade() throws InterruptedException {
		selecpare(ElementLocate.TRADE_M,
				ElementLocate.TRADE_M_TEXT,
				ElementLocate.TRADE_M_DOWN,1);
    }
	/*@Test
	@Order(7)
	@DisplayName("case_007_贸易条款")
	public void tradet() throws InterruptedException {
		selecpare(ElementLocate.TRADET_M,
				ElementLocate.TRADET_M_TEXT,
				ElementLocate.TRADET_M_DOWN,1);
    }
	
	@Test
	@Order(8)
	@DisplayName("case_008_交货方式")
	public void deliv() throws InterruptedException {
		selecpare(ElementLocate.DELI_S,
				ElementLocate.DELI_S_TEXT,
				ElementLocate.DELI_S_DOWN,1);
    }
	
	@Test
	@Order(9)
	@DisplayName("case_009_付款方式")
	public void pay() throws InterruptedException {
		selecpare(ElementLocate.PAY_S,
				ElementLocate.PAY_S_TEXT,
				ElementLocate.PAY_S_DOWN,1);
    }
	
	@Test
	@Order(10)
	@DisplayName("case_010_订单类型")
	public void ordcate() throws InterruptedException {
		selecpare(ElementLocate.ORD_CATE,
				ElementLocate.ORD_CATE_TEXT,
				ElementLocate.ORD_CATE_DOWN, 1);
    }
	
	@Test
	@Order(11)
	@DisplayName("case_011_出货类型")
	public void sip() throws InterruptedException {
		selecpare(ElementLocate.SIP,
				ElementLocate.SIP_TEXT,
				ElementLocate.SIP_DOWN,1);
    }
	@Test
	@Order(12)
	@DisplayName("case_012_认证")
	public void auth() throws InterruptedException {
		selecpare(ElementLocate.AUTH,
				ElementLocate.AUTH_TEXT,
				ElementLocate.AUTH_DOWN,1);
    }
	@Test
	@Order(13)
	@DisplayName("case_013_免收款用途")
	public void freefor() throws InterruptedException {
		selecpare(ElementLocate.FREE_FOR,
				ElementLocate.FREE_FOR_TEXT,
				ElementLocate.FREE_FOR_DOWN,1);
    }
	
	@Test
	@Order(14)
	@DisplayName("case_014_免收款备注")
	public void freemark() throws InterruptedException {
		wrtin(ElementLocate.FREE_MARK, "Free-test",2);
    }
	
	@Test
	@Order(15)
	@DisplayName("case_015_送货单标注")
	public void delimark() throws InterruptedException {
		wrtin(ElementLocate.DELIV_MARK, "Deliv-test", 2);
    }
	@Test
	@Order(16)
	@DisplayName("case_016_备注")
	public void mainmark() throws InterruptedException {
		wrtin(ElementLocate.MAIN_MARK, "MainMark-test",2);
    }
	@Test
	@Order(17)
	@DisplayName("case_017_单价备注")
	public void pricemark() throws InterruptedException {
		wrtin(ElementLocate.UPRICE_MARK, "uprice-test",2);
    }*/
}
