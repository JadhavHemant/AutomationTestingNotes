package UtilityLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import BaseLayer.BaseClass;

public class DateAndTime extends BaseClass {

	// step 1: create static method to capture the current year
	public static String captureCurrenYear() {
		return new SimpleDateFormat("yyyy").format(new Date());
	}

	// step 2: create static method to capture the current month and year

	public static String captureCurrentMonthAndYear() {
		return new SimpleDateFormat("MMyyyy").format(new Date());
	}
	// step 3: create static method to capture the current date and time
	public static String captureCurrentDateAndTime() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	}
	
}
