package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class SignUpPage extends BaseClass {

	// create object Repository using Page Object Model with PageFactory

	@FindBy(id = "name")
	private WebElement Fullname;

	@FindBy(id = "dd")
	private WebElement date;

	@FindBy(id = "mm")
	private WebElement month;

	@FindBy(id = "yy")
	private WebElement year;

	@FindBys(@FindBy(xpath = "//label[@class='form-check-label']"))
	private List<WebElement> genderlist;

	@FindBy(id = "mobile")
	private WebElement mobile;

	@FindBy(name = "email")
	private WebElement emailid;

	@FindBy(id = "profilepin")
	private WebElement pin;

	// initilisation object Repository by using
	// PageFactory.initElements(driver,this) in constructor

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	// create associated method for each and every object repository without
	// entering test data

	public void signUpFunctionality(String Fname, String Date, String Month, int Year, String Gender, String Mobile,
			String Emailid, String Pin) {

		Wait.sendKeys(Fullname, Fname);
		HandleDropDown.selectByVisibleText(date, Date);

		HandleDropDown.selectByValue(month, Month);

		HandleDropDown.selectByIndex(year, Year);

		for (WebElement abc : genderlist) {
			String gender = abc.getText();

			if (gender.equalsIgnoreCase(Gender)) {
				Wait.click(abc);

				break;
			}

		}

		Wait.sendKeys(mobile, Mobile);
		Wait.sendKeys(emailid, Emailid);
		Wait.sendKeys(pin, Pin);
	}

}