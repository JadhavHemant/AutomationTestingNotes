package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass {
	public static void click(WebElement wb) {
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(wb)).click();
	}

	public static void sendKeys(WebElement wb, String value) {
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).sendKeys(value);
		
	}
	public static String getText(WebElement wb) {
		 return new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb)).getText();
		
	}

}
