package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class SauceDemoLoginPage extends BaseClass {

	@FindBy(name = "user-name")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "login-button")
	private WebElement loginButton;

	public SauceDemoLoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void loginFunctionality(String Username, String Password) throws InterruptedException {
		Wait.sendKeys(username, Username);
		Wait.sendKeys(password, Password);
		Thread.sleep(4000);
		Wait.click(loginButton);
	}

}
