package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {

	public static void selectByVisibleText(WebElement wb, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb));

		Select sel = new Select(wb);

		sel.selectByVisibleText(value);
	}

	public static void selectByValue(WebElement wb, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb));

		Select sel = new Select(wb);

		sel.selectByValue(value);
	}

	public static void selectByIndex(WebElement wb, int value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb));

		Select sel = new Select(wb);

		sel.selectByIndex(value);
	}

}
