package UtilityLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentReportsSetUp extends BaseClass{
	
	public static ExtentReports setUp(String reportName)
	{
		ExtentReports extentReport = new ExtentReports();
		
		String destinationPath = System.getProperty("user.dir")+"//ExtentReports//"+DateAndTime.captureDates("year")+"//"
		+DateAndTime.captureDates("monthYear")+"//"+reportName+DateAndTime.captureDates("dateAndTime")+".html";
		
		ExtentSparkReporter extentReporter = new ExtentSparkReporter(destinationPath);
		
		extentReport.attachReporter(extentReporter);
		
		return extentReport;
	}

}
