package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;
import io.cucumber.java.en.Then;

public class PaybillingClass extends BaseClass {

	@FindBy(xpath = "//h3/a[@href='billing.php']")
	private WebElement paybilling;

	@FindBy(name = "customer_id")
	private WebElement customerid;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitbutton;

	public PaybillingClass() {
		PageFactory.initElements(driver, this);
	}

	public void userEntersCustomerId(String customeridvalue) {
		Wait.click(paybilling);
		Wait.sendKeys(customerid, customeridvalue);
	}

	@Then("user clicks on Submit button")
	public void userClicksOnSubmitButton() {
		Wait.click(submitbutton);

	}

}
