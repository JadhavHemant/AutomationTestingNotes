package UtilityLayer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerSetUp implements IRetryAnalyzer {

	int counter = 0;
	int maxcounter = 5;

	@Override
	public boolean retry(ITestResult result) {

		if (counter < maxcounter) {
			counter++;

			return true;
		}

		return false;
	}

}
