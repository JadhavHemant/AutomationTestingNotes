package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class ContactPage extends BaseClass {

	// create Object Repository by using Page Object Model design pattern with Page
	// Factory
	// if u want to find single element then we use @FindBy() annotations
	// if u want to find multiple element then we use @FindBys(@FindBy) annotations
	@FindBy(xpath = "//a[@href='/contacts']")
	private WebElement contactLink;

	@FindBy(xpath = "//a[@href='/contacts/new']")
	private WebElement createButton;

	@FindBy(name = "first_name")
	private WebElement firstName;

	@FindBy(name = "last_name")
	private WebElement lastName;

	@FindBy(name = "middle_name")
	private WebElement middelName;

	@FindBy(name = "status")
	private WebElement statusDropDown;

	@FindBys(@FindBy(xpath = "//div[@name='status']/child::span"))
	private List<WebElement> statusDropDownList;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "//button[@class='ui button icon']")
	private WebElement deleteButton;

	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement deleteconfirm;

	// step 2; initialize the Object repository using PageFactory.initElements()
	// method by passing driver, this keyword in constructor

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}

	// step 3: create associated method for each and every object repository without
	// entering test data.

	public String contactPageFunctionality() {
		contactLink.click();
		String actualUrl = driver.getCurrentUrl();
		return actualUrl;
	}

	public void createNewContact(String FName, String LName) {
		createButton.click();
		firstName.sendKeys(FName);
		lastName.sendKeys(LName);
		saveButton.click();
	}

	public void createNewContact(String FName, String LName, String Mname) {
		createButton.click();
		firstName.sendKeys(FName);
		lastName.sendKeys(LName);
		middelName.sendKeys(Mname);
		saveButton.click();
	}

	public void createNewContact(String FName, String LName, String Mname, String selectStatus) {
		createButton.click();
		firstName.sendKeys(FName);
		lastName.sendKeys(LName);
		middelName.sendKeys(Mname);

		statusDropDown.click();

		for (WebElement abc : statusDropDownList) {
			String dpText = abc.getText();

			if (dpText.equalsIgnoreCase(selectStatus)) {
				abc.click();
				break;
			}
		}

		saveButton.click();
	}

	public void deleteContactFunctionality() {
		deleteButton.click();
		deleteconfirm.click();
	}

}
