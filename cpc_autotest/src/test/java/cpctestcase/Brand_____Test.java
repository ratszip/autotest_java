package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("品牌")
public class Brand_____Test extends PublicTests{

	@Test
	@Order(1)
	@DisplayName("case001_品牌")
	public void brand() throws InterruptedException {
		selecpare(ElementLocate.BRAND, ElementLocate.BRAND_NOT, "无品牌", 2,"");
	}
}
