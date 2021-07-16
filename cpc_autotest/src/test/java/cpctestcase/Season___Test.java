package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("季度")
public class Season___Test extends PublicTests{
	
	@Test
	@Order(1)
	@DisplayName("case_001季度")
	public void season() throws InterruptedException {
		selecpare(ElementLocate.SEASON, 
				ElementLocate.SEASON_TEXT, 
				ElementLocate.SEASON_DOWN, 
				ElementLocate.SEASON_DOWN_TEXT, 
				"选择季度",1);
	}
}
