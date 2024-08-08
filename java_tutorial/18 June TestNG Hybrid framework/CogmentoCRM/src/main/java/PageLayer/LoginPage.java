package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass {

	// create Object Repository by using Page Object Model design pattern with Page
	// Factory
	// if u want to find single element then we use @FindBy() annotations
	// if u want to find multiple element then we use @FindBys(@FindBy) annotations
	@FindBy(name = "email")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//div[text()='Login']")
	private WebElement loginButton;

	// step 2; initialize the Object repository using PageFactory.initElements()
	// method by passing driver, this keyword in constructor
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// step 3: create associated method for each and every object repository without
	// entering test data.
	public void loginFunctionality(String UName, String Pass) {
		username.sendKeys(UName);
		password.sendKeys(Pass);
		loginButton.click();
	}

}
