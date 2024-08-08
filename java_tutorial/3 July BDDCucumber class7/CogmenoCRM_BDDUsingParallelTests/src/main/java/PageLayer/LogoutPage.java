package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LogoutPage extends BaseClass{

	@FindBy(xpath="//div[@class='ui basic button floating item dropdown']")
	private WebElement profIcon;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logout;
	
	public LogoutPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void logoutFun()
	{
		Wait.click(profIcon);
		Wait.click(logout);
	}
}
