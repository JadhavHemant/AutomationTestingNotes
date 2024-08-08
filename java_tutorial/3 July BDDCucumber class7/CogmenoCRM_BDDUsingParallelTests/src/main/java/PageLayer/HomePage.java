package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath="//div[@class='header item']")
	private WebElement logo;
	
	public HomePage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public String titleHomePage()
	{
		String actualTitle = getDriver().getTitle();
		return actualTitle;
	}
	
	public String urlHomePage()
	{
		String actualUrl = getDriver().getCurrentUrl();
		return actualUrl;
	}
	
	public boolean logoHomePage()
	{
		boolean actualLogo = logo.isDisplayed();
		return actualLogo;
	}
}
