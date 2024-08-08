package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleCalender;
import UtilityLayer.Wait;

public class GoibiboHomePage extends BaseClass{

	@FindBy(xpath="//span[text()='Departure']/following-sibling::p[@class='sc-12foipm-4 czGBLf fswWidgetTitle']")
	private WebElement Departuredate;
	
	@FindBy(xpath="//div[@class='DayPicker-Month']/preceding-sibling::div/child::div[@class='DayPicker-Caption']/child::div")
	private WebElement monthAndYear;
	
	@FindBys(@FindBy(xpath="//div[@class='DayPicker-Month']/preceding-sibling::div/descendant::p[@class='fsw__date']"))
	private List<WebElement> listDates;
	
	@FindBy(xpath="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	private WebElement next;
	
	public GoibiboHomePage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	
	public void searchFlights(String expectedMonthAndYear, String expecteddate) throws InterruptedException
	{
		Wait.click(Departuredate);
		HandleCalender.findExpectedMonthAndYear(monthAndYear, next, expectedMonthAndYear);
		Thread.sleep(4000);
		HandleCalender.findExpectedDate(listDates, expecteddate);
	}
	
	
	
	
}
