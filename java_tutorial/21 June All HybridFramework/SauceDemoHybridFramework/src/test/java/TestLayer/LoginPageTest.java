package TestLayer;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayerPackage.LoginPage;

public class LoginPageTest extends BaseClass {
	
	@Parameters({ "browsername" })
	@BeforeTest
	public void setUp(String browsername) {
		BaseClass.initialization(browsername);
	}

	@Test(priority = 1)
	public void validateLoginFunctionality() throws InterruptedException {
		LoginPage loginpage = new LoginPage();
		loginpage.loginFunctionality("standard_user", "secret_sauce");

	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
