package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass{
	
	public static WebElement visibilityOf(WebElement wb)
	{
		return new WebDriverWait(getDriver(), Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	}
	
	public static void click(WebElement wb)
	{
		Wait.visibilityOf(wb).click();
	}
	
	public static void sendKeys(WebElement wb, String value)
	{
		Wait.visibilityOf(wb).clear();
		Wait.visibilityOf(wb).sendKeys(value);
	}
}
