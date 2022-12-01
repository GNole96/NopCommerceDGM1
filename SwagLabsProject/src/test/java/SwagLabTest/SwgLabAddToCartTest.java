package SwagLabTest;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import pojo.SwagLabsOpenBrowser;
import pom.LogInPOMSwagLabs;
import pom.PLPSwagLabsPOM;
import utility.BaseClass;
import utility.Parametrisation;
import utility.Reports;

@Listeners (utility.Listeners.class)
public class SwgLabAddToCartTest extends BaseClass {

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
	
	@Test (priority = 1)
	public void VerifyAddToCart() throws EncryptedDocumentException, IOException {
		test = Report.createTest("VerifyAddToCart");
		
		LogInPOMSwagLabs Lpom = new LogInPOMSwagLabs (driver);
		Lpom.EnterUsername(Parametrisation.GetSheetData("LogInData", 1, 0));
		Lpom.EnterPassword(Parametrisation.GetSheetData("LogInData", 1, 1));
		Lpom.ClickOnLogInButton();
		PLPSwagLabsPOM PlpPom = new PLPSwagLabsPOM (driver);
		PlpPom.clickOnaddToCart(0);
		Assert.assertTrue(PlpPom.removeButtonIsDisplay(0));
		
	}
	@Test (priority = 2)
	public void veryfyMultipleAddToCart () throws EncryptedDocumentException, IOException {
		test = Report.createTest("veryfyMultipleAddToCart");
		LogInPOMSwagLabs Lpom = new LogInPOMSwagLabs (driver);
		Lpom.EnterUsername(Parametrisation.GetSheetData("LogInData", 1, 0));
		Lpom.EnterPassword(Parametrisation.GetSheetData("LogInData", 1, 1));
		Lpom.ClickOnLogInButton();
		PLPSwagLabsPOM PlpPom = new PLPSwagLabsPOM (driver);
		int addedProduct =PlpPom.getNumberOfAddToCartButton();
		PlpPom.AddMultipleProductToCart();
		Assert.assertEquals(PlpPom.getNumberOFRemoveButton(), addedProduct);
		
		
	}
	
	@Test (priority = 3)
	public void veryfyMultipleProductRemoveFromCart() throws EncryptedDocumentException, IOException {
		test=Report.createTest("veryfyMultipleProductRemoveFromCart");
		LogInPOMSwagLabs Lpom = new LogInPOMSwagLabs (driver);
		Lpom.EnterUsername(Parametrisation.GetSheetData("LogInData", 1, 0));
		Lpom.EnterPassword(Parametrisation.GetSheetData("LogInData", 1, 1));
		Lpom.ClickOnLogInButton();
		PLPSwagLabsPOM PlpPom = new PLPSwagLabsPOM (driver);
		PlpPom.AddMultipleProductToCart();
		int removeButtons = PlpPom.getNumberOFRemoveButton();
		PlpPom.removeMultipleProductFromCart();
		Assert.assertEquals(PlpPom.getNumberOfAddToCartButton(), removeButtons);
		
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
