package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {

	public static void selectByVisibleText(WebElement wb,String value)
	{
	   new Select(Wait.visibilityOf(wb)).selectByVisibleText(value);
	}
	public static void selectByIndex(WebElement wb,int Index)
	{
		new Select(Wait.visibilityOf(wb)).selectByIndex(Index);
	}
	public static void selectByValue(WebElement wb,String value)
	{
		new Select(Wait.visibilityOf(wb)).selectByValue(value);
	}
}
