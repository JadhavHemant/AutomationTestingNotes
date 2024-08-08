package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class AddCustomerClass extends BaseClass {

	@FindBy(xpath = "//h3/a[@href='addcustomer.php']")
	private WebElement addcustomerlink;

//	@FindBy(xpath = "//label[text()='Pending']/preceding-sibling::input[@id='pending']")
//	private WebElement pendingbutton;

	@FindBy(xpath = "//input[@name='fname']")
	private WebElement fnametextbox;

	@FindBy(xpath = "//input[@name='lname']")
	private WebElement lnametextbox;

	@FindBy(xpath = "//input[@name='emailid']")
	private WebElement Emailidtextbox;

	@FindBy(xpath = "//textarea[@id='message']")
	private WebElement addresss;

	@FindBy(xpath = "//input[@id='telephoneno']")
	private WebElement mobilenumber;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitbutton;

	@FindBy(xpath = "//td[@align='center']/child::h3")
	private WebElement custID;
	
	@FindBy(xpath="//li/a[@class='button']")
	private WebElement homebutton;

	public AddCustomerClass() {
		PageFactory.initElements(driver, this);
	}

	public void userEntersFirstnameAndLastname(String firstname, String lastname) {
		Wait.click(addcustomerlink);
		//Wait.click(pendingbutton);
		Wait.sendKeys(fnametextbox, firstname);
		Wait.sendKeys(lnametextbox, lastname);

	}

	public void userEntersMobileNumberAndAddress(String emailid, String adress, String mbnumber) {
		Wait.sendKeys(Emailidtextbox, emailid);
		Wait.sendKeys(addresss, adress);
		Wait.sendKeys(mobilenumber, mbnumber);
	}

	public String userClicksOntheSubmitButton() {
		Wait.click(submitbutton);
		String capturedID = custID.getText();
		Wait.click(homebutton);
		return capturedID;

		
	}

}
