package UtilityLayer;

import java.io.IOException;

import org.openqa.selenium.WebDriverException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerSetUp extends ExtentReportsSetUp implements ITestListener{

	private static ExtentReports extentReport;
	private static ExtentTest extentTest ;
	@Override
	public void onStart(ITestContext context) {
		extentReport = ExtentReportsSetUp.setUp(context.getSuite().getName());
	}
	@Override
	public void onTestStart(ITestResult result) {
		extentTest = extentReport.createTest("Test Case started name is"+ result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, "Test case Pass name is" +result.getMethod().getMethodName());
		String destinationPath = null;
		try {
			destinationPath = Screenshot.takeScreenshot("PassScreenshot", result.getMethod().getMethodName());
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		extentTest.addScreenCaptureFromPath(destinationPath);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, "Test case Fail name is" +result.getMethod().getMethodName());
		String destinationPath = null;
		try {
			destinationPath = Screenshot.takeScreenshot("FailScreenshot", result.getMethod().getMethodName());
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		extentTest.addScreenCaptureFromPath(destinationPath);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, "Test case Skip name is" +result.getMethod().getMethodName());
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReport.flush();
	}
	

}
