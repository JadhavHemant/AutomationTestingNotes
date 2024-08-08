package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

public class HomePageTest extends BaseClass {

	// use pre condition annotation
	// create test case using @Test annotations
	// call associated method from Page Layer Package by creating object of
	// Associated classes.
	// add assertion using hard assert
	// use post condition annotation
	private static HomePage homePage;

	@Test(priority = 1)
	public void validateHomePageTitle() {
		homePage = new HomePage();
		String actualTitle = homePage.getTitle();
		Assert.assertEquals(actualTitle, "Cogmento CRM");
	}

	@Test(priority = 2)
	public void validateHomePageUrl() {
		String actualUrl = homePage.getCurrentUrl();
		boolean abc = actualUrl.contains("cogmento");
		Assert.assertEquals(abc, true);
	}

	@Test(priority = 3)
	public void validateHomePageLogo() {
		boolean actualLogo = homePage.checkLogoIsDisplayed();
		Assert.assertEquals(actualLogo, true);
	}

}
