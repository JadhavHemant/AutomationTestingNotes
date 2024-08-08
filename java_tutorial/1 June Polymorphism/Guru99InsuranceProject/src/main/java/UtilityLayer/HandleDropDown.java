package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

//BaseClass is parent class of HandleDropDown class
public class HandleDropDown extends BaseClass {

	// Step 1: create static selectByVisibleText() method with WebElement and String
	// arguments

	public static void selectByVisibleText(WebElement wb, String value) {
		// Step 2: check element is isDisplayed or not as well as check Element is
		// isEnabled or not

		if (wb.isDisplayed() && wb.isEnabled()) {
			// step 3: if element is displayed and enabled then select the value

			// step 3a) :create object of Select class by passing WebElement instance
			Select sel = new Select(wb);

			// step 3b) select the value from drop down using selectByVisibleText() method
			// and by passing value
			sel.selectByVisibleText(value);
		}
	}

	// step 1:create static selectByValue() method with WebElement and String
	// arguments

	public static void selectByValue(WebElement wb, String value) {
		// step 2: check element is isDisplayed() or not as well as check element is
		// enabled or not

		if (wb.isDisplayed() && wb.isEnabled()) {
			// step 3: if element is displayed and enabled then select the value

			// step 3a) create Object of Select class by passing WebElement instance
			Select sel = new Select(wb);

			// step 3b) select the value from drop down using selectByValue() method by
			// passing the value

			sel.selectByValue(value);

		}

	}

	// step 1: create static selectByIndex() method with WebElement and int
	// arguments

	public static void selectByIndex(WebElement wb, int index) {
		// Step2 : check element is displayed or not as well as check element is enabled
		// or not

		if (wb.isDisplayed() && wb.isEnabled()) {
			// step 3: if element is displayed and enabled then select the value

			// step 3a) create object of Select class by passing WebElement instance
			Select sel = new Select(wb);

			// step 3b) select the value using selectByIndex() method by passing index
			// position
			sel.selectByIndex(index);
		}
	}

}
