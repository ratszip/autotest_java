package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("SO.NO")
public class SoNo_____Test extends PublicTests{

	@Test
	@Order(1)
	@DisplayName("case001_SO.NO录入")
	public void sono() {
		wrtin(ElementLocate.SONO, "sono test", "SO.NO录入", 2);
	}
	
}
