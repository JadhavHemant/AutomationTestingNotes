package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.AdminPage;

@Test(groups={"AdminPage","endToEndAdminTest"}, dependsOnGroups="PimPage")
public class AdminPageTest extends BaseClass {
	public static AdminPage adminPage;
	@Test(priority=1)
	public void validateCaptureCurrentUrl()
	{
		adminPage = new AdminPage();
		String actualUrl = adminPage.captureCurrentUrl();
		Assert.assertEquals(actualUrl.contains("admin"), true);
	}
	
	@Test(priority=2)
	public void validateLogoutFunctionality()
	{
		adminPage.logoutFunctionality();
	}
	}
