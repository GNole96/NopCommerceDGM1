package SwagLabTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.SwagLabsOpenBrowser;
import utility.BaseClass;
import utility.Reports;

public class Practice extends BaseClass {
	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	public void ConfigTest() {
		report = Reports.ReportMethod(); 
	}
	
	
	public void OpenBrowser() {
		driver = SwagLabsOpenBrowser.OpenEdgeBrowse();
	}
	
	@Test
	public void SelectClass () {
		
		test = report.createTest("SelectClass");
		
		String SingleWindow = driver.getWindowHandle();
		WebElement SelPrac = driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		SelPrac.click();
		
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> i = handle.iterator();
		
		while(i.hasNext()) {
			
			String M =i.next();
			driver.switchTo().window(M);
			String title = driver.getTitle();
			
			if(title.equals("Practice Page")) {
				WebElement Sel = driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",Sel);
				Select A = new Select(Sel);
				
				A.selectByValue("option2");
				
				driver.switchTo().window(SingleWindow);
				WebElement abt = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
				abt.click();
			}
			
			
		}
		
	}
	@AfterMethod
	public void reportResult(ITestResult result) {
		
		if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());	
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		else
		{
			test.log(Status.SKIP,result.getName());
		}
	
	}
	
	
	
}
