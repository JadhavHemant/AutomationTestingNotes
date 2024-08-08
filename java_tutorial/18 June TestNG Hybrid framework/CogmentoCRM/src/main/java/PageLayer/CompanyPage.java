package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class CompanyPage extends BaseClass {

	// create Object Repository by using Page Object Model design pattern with Page
	// Factory
	// if u want to find single element then we use @FindBy() annotations
	// if u want to find multiple element then we use @FindBys(@FindBy) annotations
	@FindBy(xpath = "//a[@href='/companies']")
	private WebElement companyLink;

	@FindBy(xpath = "//a[@href='/companies/new']")
	private WebElement createbutton;

	@FindBy(name = "name")
	private WebElement name;

	@FindBy(name = "url")
	private WebElement url;

	@FindBy(name = "address")
	private WebElement address;

	@FindBy(name = "value")
	private WebElement value;

	@FindBy(name = "num_employees")
	private WebElement num_employees;

	@FindBy(name = "annual_revenue")
	private WebElement annual_revenue;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;

	@FindBy(xpath = "//button[@class='ui button icon']")
	private WebElement deletebutton;

	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement deleteconfirm;
	
	

	// step 2; initialize the Object repository using PageFactory.initElements()
	// method by passing driver, this keyword in constructor
	public CompanyPage() {
		PageFactory.initElements(driver, this);
	}

	// step 3: create associated method for each and every object repository without
	// entering test data.

	public String companyFunctionality() {
		companyLink.click();
		return driver.getCurrentUrl();
		
	}

	public void createCompany(String Name) {
		createbutton.click();
		name.sendKeys(Name);
		saveButton.click();
	}

	public void createCompany(String Name, String WebSite) {
		createbutton.click();
		name.sendKeys(Name);
		url.sendKeys(WebSite);
		saveButton.click();
	}

	public void createCompany(String Name, String WebSite, String Address) {
		createbutton.click();
		name.sendKeys(Name);
		url.sendKeys(WebSite);
		address.sendKeys(Address);
		saveButton.click();
	}

	public void createCompany(String Name, String WebSite, String Address, String EmailId) {
		createbutton.click();
		name.sendKeys(Name);
		url.sendKeys(WebSite);
		address.sendKeys(Address);
		value.sendKeys(EmailId);
		saveButton.click();
	}

	public void createCompany(String Name, String WebSite, String Address, String EmailId, String totalEmp) {
		createbutton.click();
		name.sendKeys(Name);
		url.sendKeys(WebSite);
		address.sendKeys(Address);
		value.sendKeys(EmailId);
		num_employees.sendKeys(totalEmp);
		saveButton.click();
	}

	public void createCompany(String Name, String WebSite, String Address, String EmailId, String totalEmp,
			String AnnualRevenue) {
		createbutton.click();
		name.sendKeys(Name);
		url.sendKeys(WebSite);
		address.sendKeys(Address);
		value.sendKeys(EmailId);
		num_employees.sendKeys(totalEmp);
		annual_revenue.sendKeys(AnnualRevenue);
		saveButton.click();
	}

	public void deleteCompany() {
		deletebutton.click();
		deleteconfirm.click();
	}

}
