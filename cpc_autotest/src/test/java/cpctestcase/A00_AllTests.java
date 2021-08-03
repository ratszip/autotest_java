package cpctestcase;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectPackages("cpctestcase")
@SelectClasses(
		{
			A1_CpcloginTest.class,
			A2_GoSaleTest.class,
			A3_CusNoTest.class,
			A4_RefContTest.class,
			A5_SaleGrpXTest.class,
			A6_DateBoatTest.class/*,
			A7_RateMarkTest.class,
			A8_CheckBoxMTest.class,
			B01_AddxTableTest.class*/
		}
)


public class A00_AllTests {

}
