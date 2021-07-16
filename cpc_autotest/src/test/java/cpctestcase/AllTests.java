package cpctestcase;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

//import org.junit.runners.Suite;
//import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({Cpclogin.class,Cus_no.class})

@RunWith(JUnitPlatform.class)
@SelectPackages("cpctestcase")
@SelectClasses(
		{
			Cpclogin__Test.class,
			CusNo____Test.class,
			RefOrder_Test.class,
			OrderCat_Test.class,
			SoNo_____Test.class,
			Contact___Test.class,
			Brand_____Test.class,
			SaleGrpX_Test.class,
			Category__Test.class,
			OrderDate_Test.class,
			BoatDate_Test.class,
			Year____Test.class,
			Season___Test.class
		}
)

public class AllTests {

}
