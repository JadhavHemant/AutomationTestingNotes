package pageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass;
import utilityLayer.HandleDropDown;
import utilityLayer.Wait;

public class NppCommercePage extends BaseClass{
	
	@FindBy(id="Email")
	private WebElement username;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement login;
	
	@FindBy(xpath="//a[@class='nav-link']/child::i[@class='nav-icon far fa-user']/following-sibling::p")
	private WebElement customer;
	
	@FindBy(xpath="//a[@class='nav-link']/child::p[text()=' Customers']")
	private  WebElement customers;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement addnew;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement email1;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement passwordCust;
	

	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement firstname;
	

	@FindBy(xpath="//input[@id='LastName']")
	private WebElement lastname;
	

	@FindBys(@FindBy(xpath="//div[@class='form-check']/child::input[@type='radio']"))
	private List <WebElement> gender; 
	

	@FindBy(xpath="//input[@id='DateOfBirth']")
	private WebElement cal;
	

	@FindBy(xpath="//input[@id='Company']")
	private WebElement company;
	

	@FindBy(xpath="//input[@id='IsTaxExempt']")
	private WebElement tax;
	
	@FindBy(xpath="//label[text()='Newsletter']/following::div[@data-select2-id='19']")
	private WebElement newsletter;
	
	@FindBy(xpath="//button[@name='save']")
	private WebElement save;
	
	
	public NppCommercePage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void loginFunctionality(String Uname,String Pass)
	{
		Wait.sendKeys(username, Uname);
		Wait.sendKeys(password, Pass);
		Wait.click(login);
	}
   
	public void clickOnCustomerssymbolAndClickCustomersAndClickAddNew()
	{
		Wait.click(customer);
		Wait.click(customers);
		Wait.click(addnew);
	}
	
	public void userEntersEmailPasswordFirstnameLastname(String Email,String Pass,String Fname,String Lname)
	{
		Wait.sendKeys(email1, Email);
		Wait.sendKeys(passwordCust, Pass);
		Wait.sendKeys(firstname, Fname);
		Wait.sendKeys(lastname , Lname);
	}
	
	public void selectGender(String value)
	{
		Wait.selectRadioButton(gender, value);
	}

//    And select date of birth
	
//    And user enter company name and select tax and select newsletter and click on save
	public void clickOnSave()
	{
		Wait.click(save);
	}
//	
	
}
