package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
	
	public static void screenShot (String Name) throws IOException {
		
		WebDriver driver = new EdgeDriver();
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File ("C:\\Users\\SAICOM\\eclipse-workspace\\Automation-Ecommerce\\ScreenShot\\"+ Name+".png");
		FileHandler.copy(source, Destination);
		
	}
}
