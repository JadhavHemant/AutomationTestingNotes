package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.SauceDemoLoginPage;

public class SauceDemoLoginPageTest extends BaseClass {
	private static SauceDemoLoginPage sauceDemoLoginPage;

	@BeforeTest
	public void setup() throws InterruptedException {
		BaseClass.initialization();
		Thread.sleep(4000);
	}

	@Test
	public void validateLoginFunctionality() throws Exception {
		sauceDemoLoginPage = new SauceDemoLoginPage();
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");

		sauceDemoLoginPage.loginFunctionality(username, password);
	}

}
