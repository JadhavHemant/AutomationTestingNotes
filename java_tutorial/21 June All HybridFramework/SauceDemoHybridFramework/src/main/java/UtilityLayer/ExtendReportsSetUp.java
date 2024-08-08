package UtilityLayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportsSetUp {
	protected static ExtentReports extendreports;
	protected static ExtentSparkReporter extendsparkreporter;

	public static ExtentReports setUp(String reportname) {
		String destinationpath = System.getProperty("user.dir") + "\\ExtendReports\\" + DateAndTime.captureCurrentYear()
				+ "\\" + DateAndTime.captureCurrentMonthAndYear() + "\\" + reportname
				+ DateAndTime.captureCurrentDateAndTime() + ".html";
		extendreports = new ExtentReports();
		extendsparkreporter = new ExtentSparkReporter(destinationpath);
		extendreports.attachReporter(extendsparkreporter);

		return extendreports;

	}

}
