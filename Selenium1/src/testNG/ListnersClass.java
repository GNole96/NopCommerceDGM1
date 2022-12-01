package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersClass implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test is started " + result.getName());
		
	}
	
	public void onTestEnd(ITestResult result) {
		
		System.out.println("Test is Ended "+result.getName());
		
	}
	
	public void onTestFailure(ITestResult result){
		
		System.out.println("Test is fail "+ result.getName());
		
	}
	
}
