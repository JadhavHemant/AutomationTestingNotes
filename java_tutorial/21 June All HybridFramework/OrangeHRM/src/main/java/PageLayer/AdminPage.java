package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class AdminPage extends BaseClass{
	
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement admin;
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")
	private WebElement profileIcon;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public AdminPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public String captureCurrentUrl()
	{
		Wait.click(admin);
		String actualUrl = getDriver().getCurrentUrl();
		return actualUrl;
	}
	
	public void logoutFunctionality()
	{
		Wait.click(profileIcon);
		Wait.click(logout);
	}

}
