package PageLayer;

import java.util.Arrays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class GoogleSearchPage extends BaseClass {

	@FindBy(name = "q")
	private WebElement googlesearch;

	@FindBy(xpath = "//li[@class='sbct PZPZlf sbre']")
	private WebElement filmsearch;

	
	

	public GoogleSearchPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterPushaTheRiseInGoogle(String Film) {
		Wait.sendKeys(googlesearch, Film);
	}

	public void clickOnSearch() {
		Wait.click(filmsearch);
	}

}
