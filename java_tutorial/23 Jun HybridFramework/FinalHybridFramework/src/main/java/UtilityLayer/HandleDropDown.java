package UtilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {

	public static void selectByVisibleText(WebElement wb, String value) {
		new Select(Wait.visiblityOf(wb)).selectByVisibleText(value);
	}

	public static void selectByValue(WebElement wb, String value) {
		new Select(Wait.visiblityOf(wb)).selectByValue(value);
	}

	public static void selectByIndex(WebElement wb, int index) {
		new Select(Wait.visiblityOf(wb)).selectByIndex(index);
	}

	// If drop down element start without select tag then we use below to select the
	// value
	public static void selectValue(List<WebElement> listValue, String expectedValue) {
		new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfAllElements(listValue));

		for (WebElement value : listValue) {
			String abc = value.getText();
			if (abc.equalsIgnoreCase(expectedValue)) {
				Wait.click(value);
				break;
			}
		}
	}

	public static String getFirstSelectedOption(WebElement wb) {
		return new Select(Wait.visiblityOf(wb)).getFirstSelectedOption().getText();
	}

	public static int size(WebElement wb) {
		return new Select(Wait.visiblityOf(wb)).getOptions().size();
	}

	// Print all drop down value in console
	public static void getOptions(WebElement wb) {
		List<WebElement> list = new Select(Wait.visiblityOf(wb)).getOptions();
		for (WebElement value : list) {
			System.out.println(value.getText());
		}
	}

}
