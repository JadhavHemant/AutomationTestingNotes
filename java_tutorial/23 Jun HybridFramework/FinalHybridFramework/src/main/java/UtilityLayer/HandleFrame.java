package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class HandleFrame extends BaseClass {

	public static void frame(String idOrName) {
		new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}

	public static void frame(int frameIndex) {
		new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}

	public static void frame(WebElement framewb) {
		new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framewb));
	}

	public static void parentFrame() {
		getDriver().switchTo().parentFrame();
	}

	public static void defaultContent() {
		getDriver().switchTo().defaultContent();
	}

}
