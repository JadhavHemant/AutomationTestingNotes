package utilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import baseLayer.BaseClass;

public class HandleDropDown extends BaseClass
{
	public static void selectValue(List<WebElement> wb,String value)
	{
		for(WebElement abc:wb)
		{
			String strGender = abc.getText();
			
			if(strGender.equalsIgnoreCase(value))
			{
				abc.click();
			}
		}

	}
	
}
