package PageLayerPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class AddToCartPage extends BaseClass {

	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement filter;

	@FindBy(xpath = "//option[text()='Price (low to high)']")
	private WebElement lowtohign;

	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-onesie']")
	private WebElement Onesie;

	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-bike-light']")
	private WebElement bikelight;

	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement tshirt;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement addtocart;

	@FindBy(xpath = "//button[@name='checkout']")
	private WebElement checkout;

	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}

	public void addtocartfunctionality() {
		Wait.click(filter);
		Wait.click(lowtohign);
		Wait.click(Onesie);
		Wait.click(bikelight);
		Wait.click(tshirt);
		Wait.click(addtocart);
		Wait.click(checkout);

	}

}
