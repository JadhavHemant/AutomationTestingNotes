package TestLayer;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;

@Test(groups = { "HomePage", "End2EndTesting", "PIMPage" }, dependsOnGroups = { "LoginPage" })
public class HomePageTest extends BaseClass {

	@Test(priority = 1)
	public void validateHomePageTitle() {
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, "OrangeHRM");
	}

	@Test(priority = 2)
	public void validateHomePageUrl() {
		String actualUrl = driver.getCurrentUrl();
		boolean actualResult = actualUrl.contains("orangehrm");
		Assert.assertEquals(actualResult, true);
	}

	@Test(priority = 3)
	public void validateHomePageLogo() {
		boolean actualLogo = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		Assert.assertEquals(actualLogo, true);
	}
}
