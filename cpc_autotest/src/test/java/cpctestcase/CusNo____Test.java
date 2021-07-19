package cpctestcase;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cpc.Util.CPCDateUtils;
import com.cpc.Util.PublicData;


import CPC_element.ElementLocate;
import CPC_element.PublicTests;


import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

@DisplayName("开票客户")
public class CusNo____Test extends PublicTests{
	WebDriver d=PublicData.d;
	WebDriverWait wait=new WebDriverWait(d, 10);
	Map<String, String> beforemap;
	
	@Test
	@Order(1)
	@DisplayName("case_001_录入开票客户")
	   public void B1_test() throws InterruptedException {
		Thread.sleep(4000);
		selecpare(ElementLocate.CUS_NO, ElementLocate.KNITWEAR, "选择开票客户",2);
    }
	
	@Test
	@Order(2)
	@DisplayName("case_003_检查开票客户带出的字段")
	public void phvf() throws InterruptedException {
		Thread.sleep(400);
		textoratrNEq(ElementLocate.CUS_ADDR, 2, "", "客户地址不为空");
		textoratrNEq(ElementLocate.PHONE_NUM, 2, "", "电话不为空");
		textoratrNEq(ElementLocate.FAX_NUM, 2, "", "传真不为空");
		textoratrNEq(ElementLocate.PL_ORDER_TEXT, 1, "", "下单不为空");
		textoratrNEq(ElementLocate.GROUP_BUSI_TEXT, 1, "", "组别不为空");
		textoratrNEq(ElementLocate.SALESMAN, 1, "", "组别不为空");
		textoratrEq(ElementLocate.ORDER_DATE, 2, CPCDateUtils.getCurDate(), "订单日期为今天");
	}
	
}
