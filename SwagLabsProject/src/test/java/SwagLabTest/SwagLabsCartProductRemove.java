package SwagLabTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.SwagLabsOpenBrowser;
import pom.LogInPOMSwagLabs;
import pom.MyCartSwagLabsPOM;
import pom.PLPSwagLabsPOM;
import utility.BaseClass;
import utility.Parametrisation;
import utility.Reports;

public class SwagLabsCartProductRemove extends BaseClass {
	
	ExtentReports Report;
	ExtentTest test;
	
	@BeforeTest
	public void ConfigureReport() {
		Report = Reports.ReportMethod();
	}
	
	@BeforeMethod
	public void OpenBrowser() {
		
		driver = SwagLabsOpenBrowser.OpenEdgeBrowse();
	}

	public void removeProductFromCart() throws EncryptedDocumentException, IOException {
		
		test=Report.createTest("veryfyMultipleProductRemoveFromCart");
		LogInPOMSwagLabs Lpom = new LogInPOMSwagLabs (driver);
		Lpom.EnterUsername(Parametrisation.GetSheetData("LogInData", 1, 0));
		Lpom.EnterPassword(Parametrisation.GetSheetData("LogInData", 1, 1));
		Lpom.ClickOnLogInButton();
		PLPSwagLabsPOM PlpPom = new PLPSwagLabsPOM (driver);
		PlpPom.AddMultipleProductToCart();
		PlpPom.clickOnCartLogo();
		MyCartSwagLabsPOM rmv =new MyCartSwagLabsPOM (driver);
		rmv.removeMultipleProductFromCart();
	}
	
	
	
	
	@AfterMethod
	public void resultStatus(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) 
		{
			test.log(Status.PASS, result.getName());
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
	public void ClearTestData() {
		Report.flush();
	}
	

}
