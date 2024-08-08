package UtilityLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleJsEvent extends BaseClass {

	public static void click(WebElement wb) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].click()", Wait.visiblityOf(wb));
	}

	public static void sendKeys(WebElement wb, String expectedValue) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].value='" + expectedValue + "'",
				Wait.visiblityOf(wb));
	}

	public static void scrollUpToElement(WebElement wb) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", Wait.visiblityOf(wb));
	}

	public static void borderForElement(WebElement wb) {
		((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='3px solid red';",
				Wait.visiblityOf(wb));
	}

	public static void get(String url) {
		((JavascriptExecutor) getDriver()).executeScript("window.location='" + url + "';");
	}

	public static void openUrlInNewTab(String url) {
		((JavascriptExecutor) getDriver()).executeScript("window.open(" + url + ")");
	}

	public static void forward(int forwardPages) {
		((JavascriptExecutor) getDriver()).executeScript("history.go(+" + forwardPages + ")");
	}

	public static void back(int backwordPages) {
		((JavascriptExecutor) getDriver()).executeScript("history.go(-" + backwordPages + ")");
	}

	public static void refresh() {
		((JavascriptExecutor) getDriver()).executeScript("history.go(0)");
	}

	public static String getTitle() {
		return ((JavascriptExecutor) getDriver()).executeScript("return document.title").toString();
	}

	public static String getCurrentUrl() {
		return ((JavascriptExecutor) getDriver()).executeScript("return document.URL").toString();
	}

	public static void selectValue(String BynameLocation, String expectedValue) {
		((JavascriptExecutor) getDriver())
				.executeScript("document.getElementsByName('" + BynameLocation + "')[0].value='" + expectedValue + "'");

	}

}
