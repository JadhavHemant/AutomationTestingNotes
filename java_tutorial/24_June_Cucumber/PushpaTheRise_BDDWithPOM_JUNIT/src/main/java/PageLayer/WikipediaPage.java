package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class WikipediaPage extends BaseClass {
	
	public static String WikipageDate;
	
	@FindBy(xpath = "//h3[text()='Pushpa: The Rise']/following-sibling::div/descendant::span[text()='Wikipedia']")
	private WebElement wikilink;

	@FindBy(xpath = "//table[@class='infobox vevent']/tbody/tr/th/div[text()='Release date']/parent::th/following-sibling::td")
	private WebElement wikidate;
	
	public WikipediaPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String userIsOnPushatheRisePage()
	{
		String a= driver.getCurrentUrl();
		return a;
	}

	public void clickOnWikipediaLink() {
		Wait.click(wikilink);
	}

	public void captureTheWikipediaReleaseDate() {
		 WikipageDate= Wait.getText(wikidate);
	}
	

}
