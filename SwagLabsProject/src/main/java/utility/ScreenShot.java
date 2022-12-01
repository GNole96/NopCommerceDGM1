package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot extends BaseClass{
	
	public static void SrnShot(String Name) throws IOException  {
		
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Destination = new File("C:\\Users\\SAICOM\\eclipse-workspace\\SwagLabsProject\\SwagLabsScreenShots\\"+Name+".png");
	FileHandler.copy(source, Destination);
	
	}	
}
