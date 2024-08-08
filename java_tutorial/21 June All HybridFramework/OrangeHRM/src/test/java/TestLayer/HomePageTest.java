package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

@Test(groups={"HomePage","endToEndAdminTest"}, dependsOnGroups="LoginPage")
public class HomePageTest extends BaseClass{
	HomePage homePage;
	
	@Test(priority=1)
	public void validateHomePageTitle()
	{
		homePage = new HomePage();
		String actualResult = homePage.validateTitle();
		Assert.assertEquals(actualResult, "OrangeHRM");
	}
	
	@Test(priority=2)
	public void validateHomePageUrl()
	{
		String actualResult = homePage.validateUrl();
		Assert.assertEquals(actualResult.contains("orangehrm"), true);
	}
	
	@Test(priority=3)
	public void validateHomePageLogo()
	{
		boolean actualResult = homePage.checkLogoIsDisplayed();
		Assert.assertEquals(actualResult, true);
	}
}
