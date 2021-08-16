package cpctestcase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.cpc.Util.Log;
import com.cpc.Util.PublicData;

import CPC_element.ElementLocate;
import CPC_element.PublicTests;

@DisplayName("新增子表")
public class A9_NewSubTest extends PublicTests{

	@Test
    @Order(1)
    @DisplayName("点击新增")
    public void newsub() throws InterruptedException {
		Log.info("点击新增细表");
		btclick(ElementLocate.buttonM("新增细表"));
		PublicData.d.close();
		
	}
}
