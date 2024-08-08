package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	// create Object Repository by using Page Object Model design pattern with Page
	// Factory
	// if u want to find single element then we use @FindBy() annotations
	// if u want to find multiple element then we use @FindBys(@FindBy) annotations
	@FindBy(xpath = "//div[@class='header item']")
	private WebElement logo;

	@FindBy(xpath="//div[@role='listbox']")
	private WebElement settingIcon;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logoutbutton;
	
	
	
	// step 2; initialize the Object repository using PageFactory.initElements()
	// method by passing driver, this keyword in constructor
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// step 3: create associated method for each and every object repository without
	// entering test data.
	public boolean checkLogoIsDisplayed() {
		boolean actualResult = logo.isDisplayed();
		return actualResult;
	}

	public String getTitle() {
		String actualTitle = driver.getTitle();
		return actualTitle;
	}

	public String getCurrentUrl() {
		String actualTitle = driver.getCurrentUrl();
		return actualTitle;
	}
	
	public void logOutFunctionality()
	{
		settingIcon.click();
		logoutbutton.click();
	}
	
	
	
}
