package UtilityLayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import BaseLayer.BaseClass;

public class DateAndTime extends BaseClass{
	
	public static String captureDates(String name)
	{
		if(name.equalsIgnoreCase("year"))
		{
			return new SimpleDateFormat("yyyy").format(new Date());
		}
		else if(name.equalsIgnoreCase("monthYear"))
		{
			return new SimpleDateFormat("MMyyyy").format(new Date());
		}
		else if(name.equalsIgnoreCase("dateAndTime"))
		{
			return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
		}
		return null;
	}

}
