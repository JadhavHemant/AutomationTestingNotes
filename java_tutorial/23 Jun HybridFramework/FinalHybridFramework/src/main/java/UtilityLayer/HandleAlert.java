package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleAlert extends BaseClass {

	public static Alert alertIsPresent() {
		return new WebDriverWait(getDriver(), Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent());

	}

	public static void accept() {
		alertIsPresent().accept();
	}

	public static void dismiss() {
		alertIsPresent().dismiss();
	}

	public static String getText() {
		return alertIsPresent().getText();
	}

	public static void sendKeys(String value) {
		alertIsPresent().sendKeys(value);
	}
}
