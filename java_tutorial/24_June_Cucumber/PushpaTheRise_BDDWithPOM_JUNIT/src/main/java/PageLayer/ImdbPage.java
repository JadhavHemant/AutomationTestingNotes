package PageLayer;

import java.util.Arrays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class ImdbPage extends BaseClass {

	public String ImdbDate; 
	
	@FindBy(xpath = "//h3[@class='LC20lb MBeuO DKV0Md' and text()='Pushpa: The Rise - Part 1 (2021)']")
	private WebElement imdblink;

	@FindBy(xpath = "//section[@data-testid='Details']/child::div[@class='sc-f65f65be-0 bBlII']/descendant::a[text()='Release date']/following-sibling::div/descendant::a[text()='December 17, 2021 (United States)']")
	private WebElement imdbdate;
	
	public ImdbPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickOnIMDBLink() {
		Wait.click(imdblink);
	}
	

	public void captureTheIMDBReleaseDate() {
		 
		String ImdbDate= Wait.getText(imdbdate);
		 System.out.println(ImdbDate);
		
	}
	
	public boolean compareWikiAndImdbDate()
	{
		

		String replace = ImdbDate.replaceAll("\\s*\\(.*?\\)", "").trim();
		String finalimdbdate=replace.replaceAll(",","");
		
		char[] f=finalimdbdate.toCharArray();
		char[] g=WikipediaPage.WikipageDate.toCharArray();
		
		Arrays.sort(f);
		Arrays.sort(g);
		
		if(Arrays.equals(f,g))
		{
			return true;
		}
		else
		{
			return false;
		}
			

	}}






