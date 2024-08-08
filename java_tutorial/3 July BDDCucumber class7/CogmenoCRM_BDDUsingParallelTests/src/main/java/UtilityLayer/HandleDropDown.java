package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{
	
	public static void selectDropDown(List<WebElement> list, String ExpectedVal)
	{
		for(WebElement abc:list)
		{
			String categorylist = abc.getText();
			if(categorylist.equalsIgnoreCase(ExpectedVal))
			{
				abc.click();
				break;
			}
		}
	}

}
