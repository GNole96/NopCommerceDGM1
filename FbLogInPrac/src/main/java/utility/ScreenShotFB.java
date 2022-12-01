package utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotFB extends BaseClassFB {
	
	public static void Screenshot(String Name)  throws IOException {
    
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File destination=new File("C:\\Users\\SAICOM\\eclipse-workspace\\FbLogInPrac\\ScreenshotFB\\"+Name+".png");
	FileHandler.copy(source, destination);
	
	}
}
