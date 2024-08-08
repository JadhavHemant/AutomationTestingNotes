package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class PimPage extends BaseClass{

	public static String employeeId;
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addEmployee;
	
	@FindBy(name="firstName")
	private WebElement firstName;
	
	@FindBy(name="middleName")
	private WebElement middleName;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(xpath="//label[text()='Employee Id']/parent::div/following-sibling::div/child::input")
	private WebElement empId;
	
	@FindBy(xpath="//button[text()=' Save ']")
	private WebElement save;
	
	@FindBy(xpath="//label[text()='Nationality']/parent::div/following-sibling::div/child::div")
	private WebElement country;
	
	@FindBys(@FindBy(xpath="//div[@class='oxd-select-option']/child::span"))
	private List<WebElement> countryList;
	
	@FindBys(@FindBy(xpath="//input[@type='radio']"))
	private List<WebElement> genderList;
	
	@FindBy(xpath="//p[text()=' * Required']/parent::div/child::button")
	private WebElement savebutton;
	
	@FindBy(xpath="//a[text()='Employee List']")
	private WebElement employeeList;
	
	@FindBy(xpath="//label[text()='Employee Id']/parent::div/following-sibling::div/child::input")
	private WebElement employeeId1;
	
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement search;
	
	public PimPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public String checkPimUrl()
	{
		Wait.click(pim);
		String actualUrl = getDriver().getCurrentUrl();
		return actualUrl;
	}
	
	public void pimPageFunctionality(String Fname, String Mname, String Lname, String Country, String Gender) throws InterruptedException
	{
		
		Thread.sleep(3000);
		Wait.click(addEmployee);
		Wait.sendKeys(firstName, Fname);
		Wait.sendKeys(middleName, Mname);
		Wait.sendKeys(lastName, Lname);
		Thread.sleep(5000);
		employeeId = empId.getAttribute("value");
		System.out.println(employeeId);
		Wait.click(save);
		Thread.sleep(5000);
		Wait.click(country);
		
		for(WebElement abc: countryList)
		{
			String actualResult = abc.getText();
			if(actualResult.equalsIgnoreCase(Country))
			{
				Wait.click(abc);
				break;
			}
		}
		Thread.sleep(3000);
		for(WebElement abc1: genderList)
		{
			String result = abc1.getText();
			if(result.equalsIgnoreCase(Gender))
			{
				Wait.click(abc1);
				break;
			}
		}
		
		Wait.click(savebutton);
		Wait.click(employeeList);
		Thread.sleep(3000);
		Wait.sendKeys(employeeId1, employeeId);
		Wait.click(search);
			
	}
}
