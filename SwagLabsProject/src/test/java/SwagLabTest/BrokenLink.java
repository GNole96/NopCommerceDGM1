package SwagLabTest;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pojo.SwagLabsOpenBrowser;
import utility.BaseClass;
import utility.Reports;

@Listeners (utility.Listeners.class)

public class BrokenLink extends BaseClass {
	
	ExtentReports report;
	ExtentTest test ;
	
	
	@BeforeTest
	public void testConfig() {
		report = Reports.ReportMethod();
	}
	
	@Parameters ({"i"})
	@BeforeMethod
	public void OpenBrowser (String A) {
		SwagLabsOpenBrowser.CrossWithBrowser(A);
	}
	
	@Test 
	public void FindBrokenLink () {
		
		test = report.createTest("FindBrokenLink");
	
		List<WebElement> anchor = driver.findElements(By.tagName("a"));
		System.out.println(anchor.size());
		
		for(int i = 0 ;i < anchor.size(); i++)
		{
		String url = anchor.get(i).getAttribute("href");
		if(url==null || url.isEmpty()) 
		{
			System.out.println(url + "  This is Invalid Url");
			continue;
		}
		try
		{
			URL u = new URL(url);
			HttpURLConnection huc = (HttpURLConnection)(u.openConnection());	
			huc.setRequestMethod("HEAD");
			huc.connect();
			
			int responceCode = huc.getResponseCode();
			
			if(responceCode >=400) 
			{
				System.out.println(url +" URL is Broken link");
			}
			else
			{
				System.out.println(url +" URL is Valid Link");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(url +" :- Exception link");
		}	
		}	
	}
	
	@Test  (enabled = false)
	public void B_LinkOfMvnReposetory() {
		
		
		List <WebElement> anchor = driver.findElements(By.tagName("a"));
		System.out.println(anchor.size());
		
		for(int i =0;i<anchor.size();i++) 
		{
			String url = anchor.get(i).getAttribute("href");
			if (url == null || url.isEmpty())
			{
				System.out.println(url + " :- Invalid Links");
				continue;
			}
			try 
			{
				URL u = new URL(url);
				HttpURLConnection huc = (HttpURLConnection)(u.openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				int responceCode= huc.getResponseCode();
				if(responceCode>=400) 
				{
					System.out.println(url + " :- link is broken");
				}
				else
				{
					System.out.println(url + " :- link is valid");
				}
				
			}
				
			
		catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();	
		}
	}
	}

	@AfterMethod
	public void TestResults (ITestResult result) {
		
		if(result.getStatus()==ITestResult.SUCCESS) 
		{
			test.log(Status.PASS,result.getName());
		}
		else if (result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		else
		{
			test.log(Status.SKIP, result.getName());
		}	
	}
	
	@AfterTest
	public void DataClear() {
		report.flush();
	}
	
}


