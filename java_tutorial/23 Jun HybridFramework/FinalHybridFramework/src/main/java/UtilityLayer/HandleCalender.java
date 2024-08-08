package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleCalender extends BaseClass {

	public static void findExpectedMonthAndYear(WebElement monthAndYear, WebElement next, String ExpectedMonthAndYear) {
		while (true) {

			if (Wait.getText(monthAndYear).contains(ExpectedMonthAndYear)) {
				break;
			} else {
				Wait.click(next);
			}
		}

	}

	public static void findExpectedDate(List<WebElement> listDates, String ExpectedDate) {
		for (WebElement date : listDates) {
			if (Wait.getText(date).equalsIgnoreCase(ExpectedDate)) {
				Wait.click(date);
				break;
			}
		}

	}

}
