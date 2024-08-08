package PageLayerPackage;

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

	public void addPersonalInformation(String Fname, String Lname, String pincode) {
		Wait.sendKeys(firstname, Fname);
		Wait.sendKeys(lastname, Lname);
		Wait.sendKeys(postalCode, pincode);
		Wait.click(continuebutton);
		Wait.click(finish);
	}

}
