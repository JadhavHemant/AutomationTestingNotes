package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class AddTariffplanClass extends BaseClass {

	@FindBy(xpath = "//h3/a[@href='addtariffplans.php']")
	private WebElement addtarifplan;

	@FindBy(xpath = "//input[@name='rental']")
	private WebElement rentaltextbox;

	@FindBy(name = "local_minutes")
	private WebElement localminutestextbox;

	@FindBy(name = "inter_minutes")
	private WebElement internationmin;

	@FindBy(name = "sms_pack")
	private WebElement smspack;

	@FindBy(name = "minutes_charges")
	private WebElement minutecharges;

	@FindBy(xpath = "//input[@id='inter_charges']")
	private WebElement internationalcharges;

	@FindBy(xpath = "//input[@id='sms_charges']")
	private WebElement smscharges;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//li/a[@class='button']")
	private WebElement homebutton;

	public AddTariffplanClass() {
		PageFactory.initElements(driver, this);
	}

	public void monthlyRentalsAndFreeLocalMinutes(String rental, String localmin) {
		Wait.click(addtarifplan);
		Wait.sendKeys(rentaltextbox, rental);
		Wait.sendKeys(localminutestextbox, localmin);
	}

	public void freeInternationalMinutesAndFreeSmsPack(String internationalminutes, String smspackvalue) {
		Wait.sendKeys(internationmin, internationalminutes);
		Wait.sendKeys(smspack, smspackvalue);
	}

	public void freeLocalMinutesChargeAndInternationalAndSmsMinuteCharges(String minutechargesvalue,
			String internationalchargesvalue, String smschargesvalue) {
		Wait.sendKeys(minutecharges, minutechargesvalue);
		Wait.sendKeys(internationalcharges, internationalchargesvalue);
		Wait.sendKeys(smscharges, smschargesvalue);

	}

	public void clickOnSubmitButton() {
		Wait.click(submitbutton);
		Wait.click(homebutton);
	}

}
