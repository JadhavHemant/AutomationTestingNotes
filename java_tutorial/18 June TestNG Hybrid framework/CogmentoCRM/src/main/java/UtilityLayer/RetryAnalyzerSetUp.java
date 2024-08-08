package UtilityLayer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerSetUp implements IRetryAnalyzer {

	// override the retry() method
	int counter = 0;
	int maxCounter = 5;

	@Override
	public boolean retry(ITestResult result) {

		if (counter < maxCounter) {
			counter++;
			return true;
		}

		return false;
	}

}
