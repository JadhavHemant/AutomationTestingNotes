package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class AddPersonalInformationPage extends BaseClass {
	@FindBy(name = "firstName")
	private WebElement firstname;

	@FindBy(name = "lastName")
	private WebElement lastname;

	@FindBy(name = "postalCode")
	private WebElement postalCode;

	@FindBy(name = "continue")
	private WebElement continuebutton;

	@FindBy(name = "finish")
	private WebElement finish;

	public AddPersonalInformationPage() {
		PageFactory.initElements(driver, this);
	}

	public void userEnterFirstnameLastnamePostalcode(String fname, String lname, String code) {
		Wait.sendKeys(firstname, fname);
		Wait.sendKeys(lastname, lname);
		Wait.sendKeys(postalCode, code);
	}

	public void userClickOnContinueButton() {
		Wait.click(continuebutton);
	}

	public void clickOnFinish() {
		Wait.click(finish);
	}

}
