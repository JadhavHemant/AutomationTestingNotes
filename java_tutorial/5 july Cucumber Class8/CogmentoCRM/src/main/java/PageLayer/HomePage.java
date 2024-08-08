package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class HomePage extends BaseClass {

	@FindBy(xpath="//div[@class='header item']")
	private WebElement cogmentoLogo;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean validateHomePageTitle(String Title)
	{
		String actualTitle = driver.getTitle();
		if(actualTitle.equalsIgnoreCase(Title))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String validateHomePageUrl()
	{
		return driver.getCurrentUrl();
	}
	public boolean validateHomePageLogo()
	{
		return Wait.isDisplayed(cogmentoLogo);
	}
	
	
}



