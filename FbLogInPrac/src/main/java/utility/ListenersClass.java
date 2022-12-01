 package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("Started Test is :- " + result.getName());
	}
	
	public void onTestEnd(ITestResult result) {
		
		System.out.println("Closed Test is :-" + result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Failed Test is :- "+result.getName());
		try {
			ScreenShotFB.Screenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Skipped Test is :- "+result.getName());
		
	}
	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Successeed Test is :- " + result.getName());
		
		
	}
}
