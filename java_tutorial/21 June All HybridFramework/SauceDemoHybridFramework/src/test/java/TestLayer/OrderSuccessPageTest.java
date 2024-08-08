package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayerPackage.OrderSuccessPage;

public class OrderSuccessPageTest extends BaseClass {
	public static OrderSuccessPage page;

	@Test(priority = 1)
	public void validateSuccessMessage() {
		page = new OrderSuccessPage();
		String message = page.successMessageFunctionality();
		Assert.assertEquals(message, "Thank you for your order!");
	}

	@Test(priority = 2)
	public void validateLogOutFunctionality() {

		page.logoutfunctionality();

	}

}
