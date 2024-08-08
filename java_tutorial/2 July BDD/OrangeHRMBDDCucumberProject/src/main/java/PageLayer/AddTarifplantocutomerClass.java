package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class AddTarifplantocutomerClass extends BaseClass {

	@FindBy(xpath = "//h3/a[@href='assigntariffplantocustomer.php']")
	private WebElement addtarifplancustomer;

	@FindBy(name = "customer_id")
	private WebElement customerid;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submitbutton;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//li/a[@class='button']")
	private WebElement homebutton;
	
	public AddTarifplantocutomerClass() {
		PageFactory.initElements(driver, this);
	}

	public void enterCustomerId(String custometIDvalue) {
		Wait.click(addtarifplancustomer);
		Wait.sendKeys(customerid, custometIDvalue);

	}

	public void userClickOnSubmitButton() {
		Wait.click(submitbutton);
		Wait.click(submit);
		Wait.click(homebutton);

	}
}
