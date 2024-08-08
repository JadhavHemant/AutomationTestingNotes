package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class RegisterPage extends BaseClass {

	@FindBy(name = "ctl00$ContentPlaceHolder1$ddlTitle")
	private WebElement title;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtFName")
	private WebElement fname;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtLName")
	private WebElement lname;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtAddress")
	private WebElement address;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtCity")
	private WebElement city;

	@FindBy(name = "ctl00$ContentPlaceHolder1$ddlCountry")
	private WebElement country;

	@FindBy(name = "ctl00$ContentPlaceHolder1$ddlState")
	private WebElement state;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtNationality")
	private WebElement nationality;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtPinCode")
	private WebElement pincode;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtEmail")
	private WebElement email;

	@FindBy(name = "ctl00$ContentPlaceHolder1$txtMobileNum")
	private WebElement mobileNumber;

	@FindBys(@FindBy(xpath = "//label[contains(text(),'User')]"))
	private List<WebElement> listRadio;

	public RegisterPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public void selectTitleAndEnteFirstNameAndEnterLastLame(String Title, String FirstName, String LastName) {
		HandleDropDown.selectByVisibleText(title, Title);
		Wait.sendKeys(fname, FirstName);
		Wait.sendKeys(lname, LastName);
	}

	public void userEnterAddressAndCityAndSelectCountryAndSelectState(String Address, String City, String Country,
			String State) {

		Wait.sendKeys(address, Address);
		Wait.sendKeys(city, City);
		HandleDropDown.selectByVisibleText(country, Country);
		HandleDropDown.selectByVisibleText(state, State);
	}

	public void userEnterNationalityAndEnterPincode(String Nationality, String Pincode) {
		Wait.sendKeys(nationality, Nationality);
		Wait.sendKeys(pincode, Pincode);
	}

	public void userEnterEmailIdAndMobileNumber(String Emailid, String Mob) {
		Wait.sendKeys(email, Emailid);
		Wait.sendKeys(mobileNumber, Mob);
	}

	public void userSelectUserType(String value) {
		Wait.selectRadioButton(listRadio, value);
	}

}
