package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayerPackage.AddPersonalInformationPage;

public class AddPersonalInformationPageTest extends BaseClass {

	@Test(priority = 1)
	public void validatecheckoutPage() {
		Assert.assertEquals(driver.getCurrentUrl().contains("checkout"), true);
	}

	@Test(priority = 2)
	public void addPersonalInformation() {
		AddPersonalInformationPage info = new AddPersonalInformationPage();
		info.addPersonalInformation("Alfiya", "Sanadi", "416410");
	}

}
