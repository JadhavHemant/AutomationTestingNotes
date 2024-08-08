package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleCalender;
import UtilityLayer.Wait;

public class RedBusHomePage extends BaseClass{

	
	@FindBy(id="onwardCal")
	private WebElement Departuredate;
	
	@FindBy(xpath="(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]")
	private WebElement monthAndYear;
	
	@FindBys(@FindBy(xpath="//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 dkWAbH' or @class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']"))
	private List<WebElement> listDates;
	
	@FindBy(xpath="(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")
	private WebElement next;
	
	public RedBusHomePage()
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
