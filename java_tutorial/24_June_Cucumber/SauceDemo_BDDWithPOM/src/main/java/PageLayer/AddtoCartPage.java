package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class AddtoCartPage extends BaseClass {

	@FindBy(xpath = "//select[@class='product_sort_container']")
	private WebElement filter;

	@FindBy(xpath = "//option[text()='Price (high to low)']")
	private WebElement hightolow;

	@FindBys(@FindBy(xpath = "//div[@class='inventory_item_label']/following-sibling::div/child::button"))
	private List<WebElement> productlist;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement addtocart;

	@FindBy(xpath = "//button[@name='checkout']")
	private WebElement checkout;

	public AddtoCartPage() {
		PageFactory.initElements(driver, this);
	}

	public void sortProductFromHighToLowPrice() {
		Wait.click(filter);
		Wait.click(hightolow);

	}

	public void userAddFirstThreeProductsToCart(int productcount) {
		int counter = 0;
		int maxCounter = productcount;
		for (WebElement plist : productlist) {
			if (counter < maxCounter) {

				Wait.click(plist);
				counter++;
			}
		}
	}

	public void userClickOnAddToCart() {
		Wait.click(addtocart);

	}

	public void userCheckout() {
		Wait.click(checkout);
	}
}
