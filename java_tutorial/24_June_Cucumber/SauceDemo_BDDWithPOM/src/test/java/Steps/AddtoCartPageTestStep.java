package Steps;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.AddtoCartPage;
import UtilityLayer.Wait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtoCartPageTestStep extends BaseClass {
	AddtoCartPage cart;

	@Given("user is on home page")
	public void user_is_on_home_page() {
		Assert.assertEquals(driver.getCurrentUrl().contains("sauce"), true);

	}

	@When("user sort product high to low price")
	public void user_sort_product_high_to_low_price() {

		cart = new AddtoCartPage();
		cart.sortProductFromHighToLowPrice();

	}

	@When("user add first {int} products to cart")
	public void user_add_first_products_to_cart(Integer products) {
		cart.userAddFirstThreeProductsToCart(products);

	}

	@Then("user click on add to cart")
	public void user_click_on_add_to_cart() {
		cart.userClickOnAddToCart();

	}

	@Then("user checkout")
	public void user_checkout() {
		cart.userCheckout();

	}

}
