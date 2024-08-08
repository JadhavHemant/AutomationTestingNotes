package UtilityLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ExtentReportsSetUp extends BaseClass {

	// create static method with 1 String arguments and ExtentReports class return
	// type

	public static ExtentReports setUp(String reportName) {
		ExtentReports extentReports = new ExtentReports();
		String destinationPath = System.getProperty("user.dir") + "//ExtentReports//" + DateAndTime.captureCurrenYear()
				+ "//" + DateAndTime.captureCurrentMonthAndYear() + "//" + reportName
				+ DateAndTime.captureCurrentDateAndTime() + ".html";
		ExtentSparkReporter extentReporter = new ExtentSparkReporter(destinationPath);
		extentReports.attachReporter(extentReporter);
		return extentReports;
	}

}
