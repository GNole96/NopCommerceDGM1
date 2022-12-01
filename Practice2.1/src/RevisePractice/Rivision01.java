package RevisePractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Rivision01 {
	
	public static void parametrisation() throws EncryptedDocumentException, IOException {
		
		FileInputStream file =new  FileInputStream("\"C:\\Users\\SAICOM\\Desktop\\Book11.xlsx\"");
		String value =WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(value);
	
	}
	
	public static void ScreenShot(WebDriver driver) throws IOException {
		
		File Sorce =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\SAICOM\\Desktop\\us01");
		FileHandler.copy(Sorce, Destination);
		
	}}
	
/*	public static void Report () {
		
		ExtentSparkReporter html = new ExtentSparkReporter("emailReport.html");
		ExtentReport report = new ExtentReport();
		report.attachReports(html);
		report.setSystemProperty("Assigned By","Gaurav Nole");
	}
*/
	

/*	public void listenersClass () extends ITestListeners{
		
		public void onTestStart(ITestResult result){
		syso
		}
		
}
*/