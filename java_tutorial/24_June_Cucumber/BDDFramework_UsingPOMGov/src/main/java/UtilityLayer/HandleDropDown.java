package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{
	public static void selectByVisibleText(WebElement wb, String value)
	{
		Wait.visibilityOf(wb);
		Select sel = new Select(wb);
		sel.selectByVisibleText(value);
	}
	
	public static void selectByValue(WebElement wb, String value)
	{
		Wait.visibilityOf(wb);
		Select sel = new Select(wb);
		sel.selectByValue(value);
	}
	public static void selectByIndex(WebElement wb, int value)
	{
		Wait.visibilityOf(wb);
		Select sel = new Select(wb);
		sel.selectByIndex(value);
	}
	
	
}
