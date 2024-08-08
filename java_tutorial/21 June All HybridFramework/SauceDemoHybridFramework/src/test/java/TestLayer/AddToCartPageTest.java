package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayerPackage.AddToCartPage;

public class AddToCartPageTest extends BaseClass {

	@Test(priority = 1)
	public void validateHomePageTitle() {
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}

	@Test(priority = 2)
	public void validateHomePageURL() {
		Assert.assertEquals(driver.getCurrentUrl().contains("saucedemo"), true);
	}

	@Test(priority = 3)
	public void validateAddToCartFunctionality() {

		AddToCartPage addtocart = new AddToCartPage();
		addtocart.addtocartfunctionality();

	}
}
