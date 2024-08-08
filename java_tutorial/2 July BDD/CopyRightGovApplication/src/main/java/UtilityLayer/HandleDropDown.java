package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {

	public static void selectByVisibleText(WebElement wb, String ExpectedValue) {
		Select sel = new Select(Wait.visibilityOf(wb));
		sel.selectByVisibleText(ExpectedValue);
	}

	public static void selectByValue(WebElement wb, String ExpectedValue) {
		Select sel = new Select(Wait.visibilityOf(wb));
		sel.selectByValue(ExpectedValue);
	}

	public static void selectByIndex(WebElement wb, int ExpectedValue) {
		Select sel = new Select(Wait.visibilityOf(wb));
		sel.selectByIndex(ExpectedValue);
	}

}
