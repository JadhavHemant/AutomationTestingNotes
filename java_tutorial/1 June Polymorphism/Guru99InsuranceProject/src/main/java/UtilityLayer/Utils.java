package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

//BaseClass is parent class of Utils class.
public class Utils extends BaseClass {

	// step 1: create static click() method with WebElement arguments
	public static void click(WebElement wb) {
		// step 2: check element is displayed or not as well check element is enabled or
		// not
		if (wb.isDisplayed() && wb.isEnabled()) {
			// step 3: if element isDisplayed and isEnabled() then click on element
			wb.click();
		}
	}

	// step 1: create static sendKeys() method with WebElement and String arguments
	public static void sendKeys(WebElement wb, String value) {
		// step 2: check element is displayed or not as well as check element is enabled
		// or not

		if (wb.isDisplayed() && wb.isEnabled()) {
			// Step 3: if element is displayed and enabled then enter value in text box
			wb.sendKeys(value);
		}

	}

}
