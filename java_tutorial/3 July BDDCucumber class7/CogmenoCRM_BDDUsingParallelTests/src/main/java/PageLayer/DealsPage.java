package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class DealsPage extends BaseClass {
	
	@FindBy(xpath="//a[@href='/deals']")
	private WebElement dealslink;
	
	@FindBy(xpath="//a[@href='/deals/new']")
	private WebElement createNew;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement title;
	
	@FindBy(xpath="//input[@class='calendarField']")
	private WebElement closeDate;
	
	@FindBy(xpath="//div[@class='react-datepicker__header react-datepicker__header--has-time-select']/child::div[@class='react-datepicker__current-month']")
	private WebElement currentMonthAndYear;
	
	@FindBy(xpath="//button[@aria-label='Next Month']")
	private WebElement next;
	
	@FindBys(@FindBy(xpath="//div[@class='react-datepicker__month']/child::div/child::div"))
	private List<WebElement> datelist;
	
	@FindBys(@FindBy(xpath="//ul[@class='react-datepicker__time-list']/child::li"))
	private List<WebElement> timelist;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement description;
	
	@FindBy(xpath="//input[@name='probability']")
	private WebElement probability;
	
	@FindBy(xpath="//label[text()='Stage']/following-sibling::div")
	private WebElement stage;
	
	@FindBys(@FindBy(xpath="//div[@class='visible menu transition']/child::div"))
	private List<WebElement> stagelist;
	
	@FindBy(xpath="//label[text()='Type']/following-sibling::div")
	private WebElement type;
	
	@FindBys(@FindBy(xpath="//div[@class='visible menu transition']/child::div"))
	private List<WebElement> typelist;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement savebutton;
	
	@FindBy(xpath="//i[@class='trash icon']")
	private WebElement delete;
	
	@FindBy(xpath="//button[text()='Delete']")
	private WebElement delete1;
	
	public DealsPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
//	Given user verify user on deals page
//    When user click on create new deal
//    And user enter title, close date, description, probabilitlity, select stage and type
//    Then user click on savedeals button
//    And user delete deals
	public String verifyUser()
	{
		Wait.click(dealslink);
		String dealsUrl = getDriver().getCurrentUrl();
		return dealsUrl;
	}
	
	public void ClickOncreateNewDeal()
	{
		Wait.click(createNew);
	}
	public void validateDealsDetails(String Title, String MonthAndYear, String ExpectedDate, String ExpectedTime, String Desc, String Prob, String Stage, String Type)
	{
		Wait.sendKeys(title, Title);
		Wait.click(closeDate);
		
		while(true)
		{
			String currentmonthAndYear = currentMonthAndYear.getText();
			if(currentmonthAndYear.equalsIgnoreCase(MonthAndYear))
			{
				for(WebElement abc: datelist)
				{
					String date1 =abc.getText();
					if(date1.equalsIgnoreCase(ExpectedDate))
					{
						abc.click();
						break;
					}
				}break;
			}
			else
			{
				Wait.click(next);
			}
		}
		
		for(WebElement abc1: timelist)
		{
			String time1 = abc1.getText();
			if(time1.equalsIgnoreCase(ExpectedTime))
			{
				abc1.click();
				break;
			}
		}
		
		Wait.sendKeys(description, Desc);
		Wait.sendKeys(probability, Prob);
		Wait.click(stage);
		HandleDropDown.selectDropDown(stagelist, Stage);
		Wait.click(type);
		HandleDropDown.selectDropDown(typelist, Type);
	}
	
	public void clickOnSave()
	{
		Wait.click(savebutton);
	}
	
	public void deleteDeal()
	{
		Wait.click(delete);
		Wait.click(delete1);
	}
	

}
