package testngrevision;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends BaseA implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
}
	@Override
	public void onTestSuccess(ITestResult result) {
}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed test");
		failed(result);
		
	}
	@Override
	public void onTestSkipped(ITestResult result) {
	}
	}