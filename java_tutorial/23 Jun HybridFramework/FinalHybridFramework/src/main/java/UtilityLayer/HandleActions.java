package UtilityLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class HandleActions extends BaseClass {

	public static void click(WebElement wb) {
		new Actions(getDriver()).click(Wait.visiblityOf(wb)).build().perform();
	}

	public static void sendKeys(WebElement wb, String value) {
		new Actions(getDriver()).sendKeys(Wait.visiblityOf(wb), value).build().perform();
	}

	public static void enterUpperCaseText(WebElement wb, String value) {
		new Actions(getDriver()).keyDown(Keys.SHIFT).sendKeys(Wait.visiblityOf(wb), value).build().perform();
	}

	public static void moveToElement(WebElement wb) {
		new Actions(getDriver()).moveToElement(Wait.visiblityOf(wb)).build().perform();
	}

	public static void doubleClick(WebElement wb) {
		new Actions(getDriver()).doubleClick(Wait.visiblityOf(wb)).build().perform();
	}

	public static void contextClick(WebElement wb) {
		new Actions(getDriver()).contextClick(Wait.visiblityOf(wb)).build().perform();
	}

	public static void clickAndHold(WebElement wb) {
		new Actions(getDriver()).clickAndHold(Wait.visiblityOf(wb)).build().perform();
	}

	public static void release(WebElement wb) {
		new Actions(getDriver()).release(Wait.visiblityOf(wb)).build().perform();
	}

	public static void dragAndDrop(WebElement src, WebElement trg) {
		new Actions(getDriver()).dragAndDrop(Wait.visiblityOf(src), Wait.visiblityOf(trg)).build().perform();
	}

}
