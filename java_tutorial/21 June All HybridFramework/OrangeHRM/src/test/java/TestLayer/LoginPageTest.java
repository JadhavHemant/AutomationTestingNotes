package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

@Test(groups={"LoginPage","endToEndAdminTest"})
public class LoginPageTest extends BaseClass{
	
	//@Parameters({"browsername"})
	@BeforeTest
	public void setUp()
	{
		BaseClass.initialization();
	}
	
	@Test
	public void validateLoginFunctionality()
	{
		LoginPage loginPage = new LoginPage();
		loginPage.loginPageFunctionality("Admin", "admin123");
	}

	@AfterTest
	public void tearDown()
	{
		//getDriver().quit();
	}
}
