package testNGPractice;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class ListnersTest implements ITestListener{ 

	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Awesome!! Your test is pass and name of test is: "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test execution start ");
			}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	
}
