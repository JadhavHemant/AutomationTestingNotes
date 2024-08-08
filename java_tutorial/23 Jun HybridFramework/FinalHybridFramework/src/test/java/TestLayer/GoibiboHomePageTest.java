package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.GoibiboHomePage;

public class GoibiboHomePageTest extends BaseClass {

	private static GoibiboHomePage goibiboHomePage;

	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}

	@Test
	public void validateSearchFunctionality() throws InterruptedException {
		Thread.sleep(7000);
		goibiboHomePage = new GoibiboHomePage();
		goibiboHomePage.searchFlights("March 2025", "24");
	}

}
