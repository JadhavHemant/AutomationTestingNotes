package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass {
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement loginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterValidCrediantials(String Email,String Pass)
	{
		Wait.SendKeys(email, Email);
		Wait.SendKeys(password, Pass);
	}
	public void clickOnLoginButton()
	{
		Wait.click(loginButton);
	}
	    

}
