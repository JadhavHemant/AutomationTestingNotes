package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class ContactPage extends BaseClass{
	
	
	
	
	@FindBy(xpath="//a[@href='/contacts']")
	private WebElement contacts;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement createContacts;
	
	@FindBy(name="first_name")
	private WebElement firstname;
	
	@FindBy(name="last_name")
	private WebElement lastname;
	
	@FindBy(xpath="//div[@name='company']/child::input[@class='search']")
	private WebElement company;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	private WebElement email;
	
	@FindBy(xpath="//label[text()='Category']/following-sibling::div")
	private WebElement category;
	
	@FindBys(@FindBy(xpath="//div[@class='visible menu transition']/child::div"))
	private List<WebElement> listCategory;
	
	@FindBy(xpath="//input[@name='position']")
	private WebElement position;
	
	@FindBy(xpath="//input[@name='department']")
	private WebElement department;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath="//button[@class='ui button icon']")
	private WebElement delete;
	
	@FindBy(xpath="//button[text()='Delete']")
	private WebElement delete1;
	
	
	
	public ContactPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public String contactClick()
	{
		Wait.click(contacts);
		String contactUrl = getDriver().getCurrentUrl();
		return contactUrl;
	}
	public void createContact()
	{
		Wait.click(createContacts);
	}
	public void validateContactDetails(String Fname, String Lname, String CompanyName, String Email, String Category, String Position, String Department)
	{
		Wait.sendKeys(firstname, Fname);
		Wait.sendKeys(lastname, Lname);
		Wait.sendKeys(company, CompanyName);
		Wait.sendKeys(email, Email);
		Wait.click(category);
		HandleDropDown.selectDropDown(listCategory, Category);
		Wait.sendKeys(position, Position);
		Wait.sendKeys(department, Department);
	}
	
	public void clickSave()
	{
		Wait.click(save);
	}
	
	public void deleteContact()
	{
		Wait.click(delete);
		Wait.click(delete1);
	}

	
}
