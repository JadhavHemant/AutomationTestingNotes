package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.CompanyPage;
import PageLayer.HomePage;

public class CompanyPageTest extends BaseClass {

	// use pre condition annotation
	// create test case using @Test annotations
	// call associated method from Page Layer Package by creating object of
	// Associated classes.
	// add assertion using hard assert
	// use post condition annotation
	private static CompanyPage companyPage;
	private static HomePage homePage;

	@Test(priority = 1)
	public void validateUserOnCompanyPage() throws InterruptedException {
		companyPage = new CompanyPage();
		Thread.sleep(4000);
		String actualResult = companyPage.companyFunctionality();

		Assert.assertEquals(actualResult.contains("companies"), true);
		Thread.sleep(4000);
	}

	@Test(priority = 2)
	public void validateNewCompanyFunctionality() {
		companyPage.createCompany("amdocs", "www.amdocs.com", "USA", "amdocs@gmail.com", "19000", "4.5B $");

	}

	@Test(priority = 3)
	public void validateDeleteCompanyFunctionality() {
		companyPage.deleteCompany();
	}

	@Test(priority = 4)
	public void validateLogout() throws InterruptedException {
		Thread.sleep(4000);
		HomePage homePage = new HomePage();
		homePage.logOutFunctionality();
	}

}
