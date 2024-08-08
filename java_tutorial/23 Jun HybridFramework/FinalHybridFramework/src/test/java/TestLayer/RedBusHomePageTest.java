package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.RedBusHomePage;

public class RedBusHomePageTest extends BaseClass{

	private static RedBusHomePage redBusHomePage;

	@BeforeTest
	public void setUp() {
		BaseClass.initialization();
	}

	@Test
	public void validateSearchFunctionality() throws InterruptedException {
		Thread.sleep(7000);
		redBusHomePage = new RedBusHomePage();
		redBusHomePage.searchFlights("Apr 2025","10");
	}
	
}
