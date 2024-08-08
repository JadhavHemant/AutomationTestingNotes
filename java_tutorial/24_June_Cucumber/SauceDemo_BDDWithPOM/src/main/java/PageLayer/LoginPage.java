package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class LoginPage extends BaseClass {
	@FindBy(name = "user-name")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "login-button")
	private WebElement login;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public void enterUsernameAndPassword(String uname, String pass) {
		Wait.sendKeys(username, uname);
		Wait.sendKeys(password, pass);
	}

	public void clickOnLogin() {
		Wait.click(login);
	}

}
