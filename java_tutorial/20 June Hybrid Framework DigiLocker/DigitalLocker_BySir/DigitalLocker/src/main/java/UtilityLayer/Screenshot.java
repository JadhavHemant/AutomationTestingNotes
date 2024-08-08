package UtilityLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class Screenshot extends BaseClass {
	
	//creating static takesScreenshot method with String ReturnType and two String arguments or parameter
	
	public static String takesScreenshot(String foldername, String screenshotname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		
		String destinationpath=System.getProperty("user.dir")+"//"+foldername+"//"+DateAndTime.captureCurrentYear()+"//"+DateAndTime.captureCurrentMonthAndYear()+"//"+
				screenshotname+DateAndTime.captureCurrentDateAndTime()+".png";
		
		FileUtils.copyFile(src, new File(destinationpath));
		
		return destinationpath;
	}
	
	
	}


