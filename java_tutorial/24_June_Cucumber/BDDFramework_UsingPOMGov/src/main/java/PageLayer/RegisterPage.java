package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class RegisterPage extends BaseClass{
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlTitle")
	private WebElement title;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtFName")
	private WebElement firstname;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtLName")
	private WebElement lastname;

	@FindBy(name="ctl00$ContentPlaceHolder1$txtAddress")
	private WebElement address;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtCity")
	private WebElement city;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlCountry")
	private WebElement country;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlState")
	private WebElement state;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$ddlDistrict")
	private WebElement district;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtNationality")
	private WebElement nationality;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtPinCode")
	private WebElement pincode;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtEmail")
	private WebElement email;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtMobileNum")
	private WebElement mobile;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtUserId")
	private WebElement userId;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtPassword")
	private WebElement password;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$txtConfirmPwd")
	private WebElement cPassword;
	
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterBasicDetails(String Title, String Fname, String Lname)
	{
		Wait.click(title);
		HandleDropDown.selectByVisibleText(title, Title);
		Wait.sendKeys(firstname, Fname);
		Wait.sendKeys(lastname, Lname);
	}
	
	public void enterAddressDetails(String Address, String City, String Country, String State)
	{
		Wait.sendKeys(address, Address);
		Wait.sendKeys(city, City);
		Wait.click(country);
		HandleDropDown.selectByVisibleText(country, Country);
		Wait.click(state);
		HandleDropDown.selectByVisibleText(state,State);		
	}
	
	public void enterOtherDetails(String Nationality, String Pin, String Email, String Mobile)
	{
		Wait.sendKeys(nationality, Nationality);
		Wait.sendKeys(pincode, Pin);
		Wait.sendKeys(email, Email);
		Wait.sendKeys(mobile, Mobile);
	}
	
	public void enterCredential(String UID, String Pass, String CPass)
	{
		Wait.sendKeys(userId, UID);
		Wait.sendKeys(password, Pass);
		Wait.sendKeys(cPassword, CPass);
	}
}
