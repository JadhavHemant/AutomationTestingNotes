package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {

	// use pre condition annotation
	// create test case using @Test annotations
	// call associated method from Page Layer Package by creating object of
	// Associated classes.
	// add assertion using hard assert
	// use post condition annotation
	private static LoginPage loginPage;

	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}

	@Test
	public void validateLoginFunctionality() {
		loginPage = new LoginPage();
		loginPage.loginFunctionality("prafulp1010@gmail.com", "Pr@ful0812");
	}
	
	
	
}
