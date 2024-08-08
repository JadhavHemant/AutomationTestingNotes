package UtilityLayer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListenerSetUp extends ExtentReportsSetUp implements ITestListener {

	private static ExtentReports extentReports;
	private static ExtentTest extentTest;

	@Override
	public void onStart(ITestContext context) {
		extentReports = ExtentReportsSetUp.setUp(context.getSuite().getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		extentTest = extentReports.createTest("Test Case Started name is " + result.getMethod().getMethodName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, "Test Case Pass name is " + result.getMethod().getMethodName());

		String destinationpath = ScreenshotClass.takeScreenshot("PassScreenshot", result.getMethod().getMethodName());
		extentTest.addScreenCaptureFromPath(destinationpath);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, "Test Case Fail name is " + result.getMethod().getMethodName());
		String destinationPath = ScreenshotClass.takeScreenshot("FailScreenshot", result.getMethod().getMethodName());

		extentTest.addScreenCaptureFromPath(destinationPath);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, "Test Case skip name is " + result.getMethod().getMethodName());

	}

	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();
	}

}
