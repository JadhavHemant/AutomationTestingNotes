package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

public class HomePageTest extends BaseClass {
	private static HomePage homePage;

	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}

	@Test
	public void validateloginFunctionalityWithHandleWindow() throws InterruptedException {
		homePage = new HomePage();
		homePage.loginFunctionalityWithHandleWindow("Anuja", "Bhosale", "Admin", "admin123",
				"standard_user","secret_sauce","Delhi","Rohit","Shinde","Pune");
	}

	@AfterTest
	public void tearDown() {
//		getDriver().quit();

	}
}
