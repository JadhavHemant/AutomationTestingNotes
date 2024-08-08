package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleWindow;
import UtilityLayer.Wait;

public class HomePage extends BaseClass {

	@FindBy(name = "fname")
	private WebElement firstName;

	@FindBy(name = "lname")
	private WebElement lastName;

	@FindBy(xpath = "//a[text()='Visit Orange HRM']")
	private WebElement orangehrmLink;

	// Orange HRM LoginPage
	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginButton;

	@FindBy(xpath = "//a[text()='SauceDemo Link']")
	private WebElement sauceDemoLink;

	@FindBy(name = "user-name")
	private WebElement sauceDemoUsername;

	@FindBy(name = "password")
	private WebElement sauceDemoPassword;

	@FindBy(name = "login-button")
	private WebElement sauceDemoLoginButton;

	@FindBy(name = "address")
	private WebElement address;

	@FindBy(xpath = "//a[text()='Visit Facebook']")
	private WebElement facebookLink;

	@FindBy(name = "firstname")
	private WebElement facebookFirstName;

	@FindBy(name = "lastname")
	private WebElement facebookLastName;

	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void loginFunctionalityWithHandleWindow(String FirstName, String LastName, String Username, String Password,
			String SauceUsername, String SaucePassword, String Address, String FacebookFirstName,
			String FacebookLastName, String NewAddress) throws InterruptedException {
		Wait.sendKeys(firstName, FirstName);
		Thread.sleep(5000);
		Wait.click(orangehrmLink);

		HandleWindow.handleWindowOrTab(1);
		Thread.sleep(5000);
		Wait.sendKeys(username, Username);
		Wait.sendKeys(password, Password);
		Wait.click(loginButton);
		Thread.sleep(5000);

		HandleWindow.handleWindowOrTab(0);
		Wait.sendKeys(lastName, LastName);

		Thread.sleep(5000);

		Wait.click(sauceDemoLink);

		HandleWindow.handleWindowOrTab(2);
		Thread.sleep(5000);
		Wait.sendKeys(sauceDemoUsername, SauceUsername);
		Wait.sendKeys(sauceDemoPassword, SaucePassword);
		Wait.click(sauceDemoLoginButton);
		Thread.sleep(5000);
		HandleWindow.handleWindowOrTab(0);
		Wait.sendKeys(address, Address);
		Thread.sleep(5000);
		Wait.click(facebookLink);
		Thread.sleep(5000);

		HandleWindow.handleWindowOrTab(3);

		Wait.sendKeys(facebookFirstName, FacebookFirstName);
		Wait.sendKeys(facebookLastName, FacebookLastName);
		Thread.sleep(5000);

		HandleWindow.handleWindowOrTab(0);
		Wait.sendKeys(address, NewAddress);
	}

}
