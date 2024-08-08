package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//div[@class='oxd-brand-banner']/child::img")
	private WebElement logo;
	
	public HomePage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public String validateTitle()
	{
		String actualTitle = getDriver().getTitle();
		return actualTitle;
	}
	
	public String validateUrl()
	{
		String actualUrl = getDriver().getCurrentUrl();
		return actualUrl;
	}
	
	public boolean checkLogoIsDisplayed()
	{
		boolean actualResult = logo.isDisplayed();
		return actualResult;
	}

}
