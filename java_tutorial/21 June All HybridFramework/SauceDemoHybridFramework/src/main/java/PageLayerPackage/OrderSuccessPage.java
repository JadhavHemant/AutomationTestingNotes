package PageLayerPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class OrderSuccessPage extends BaseClass {

	@FindBy(xpath = "//h2[text()='Thank you for your order!']")
	private WebElement successmessgae;

	@FindBy(xpath = "//button[text()='Back Home']")
	private WebElement backhomebutton;

	@FindBy(xpath = "//button[text()='Open Menu']")
	private WebElement menu;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;

	public OrderSuccessPage() {
		PageFactory.initElements(driver, this);
	}

	public String successMessageFunctionality() {

		String a = successmessgae.getText();

		return a;

	}

	public void logoutfunctionality() {
		Wait.click(backhomebutton);

		Wait.click(menu);

		Wait.click(logout);

	}

}
