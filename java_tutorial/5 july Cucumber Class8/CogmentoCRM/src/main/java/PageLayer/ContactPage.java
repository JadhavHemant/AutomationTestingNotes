package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class ContactPage extends BaseClass {

	@FindBy(xpath="//span[text()='Contacts']")
	private WebElement contactLink;
	
	@FindBy(xpath="//button[text()='Create']")
	private WebElement createButton;
	
	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(name="middle_name")
	private WebElement middlename;
	
	
	@FindBy(name="last_name")
	private WebElement lastName;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath="//i[@class='trash icon']")
	private WebElement deleteicon;
	
	@FindBy(xpath="//button[text()='Delete']")
	private WebElement confirmDelete;
	
	@FindBy(xpath="//div[@role='listbox']/child::i[@class='settings icon']")
	private WebElement settingIcon;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logOutButton;
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public boolean validateContactPageUrl(String Url)
	{
		Wait.click(contactLink);
		String actualUrl = driver.getCurrentUrl();
		if(actualUrl.contains(Url))
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	public void clickOnCreateButton()
	{
		Wait.click(createButton);
	}
	public void enterContactInformation(String Fname,String MiddleName,String Lname)
	{
		Wait.SendKeys(firstName, Fname);
		Wait.SendKeys(middlename, MiddleName);
		Wait.SendKeys(lastName, Lname);
	}
	public void clickOnSaveButton()
	{
		Wait.click(saveButton);
	}
	public void deleteContact()
	{
		Wait.click(deleteicon);
		Wait.click(confirmDelete);
	}
	public void clickOnProfileIcon()
	{
		Wait.click(settingIcon);
	}
	public void logOutTheApplication()
	{
		Wait.click(logOutButton);
		
	}
	public void closeTheSession()
	{
		driver.quit();
	}
	
}









