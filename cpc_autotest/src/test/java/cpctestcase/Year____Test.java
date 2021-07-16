package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("年份季度")
public class Year____Test extends PublicTests{

	
	@Test
	@Order(1)
	@DisplayName("case_001年份")
	public void year() throws InterruptedException {
		selecpare(ElementLocate.YEAR, 
				ElementLocate.YEAR_TEXT, 
				ElementLocate.YEAR_DOWN, 
				ElementLocate.YEAR_DOWN_TEXT, 
				"选择年份",1);
	}
}
