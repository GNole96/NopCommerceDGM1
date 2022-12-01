package Automation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class GnEmpliment {
	
	WebDriver driver ;
	
	public static WebDriver openbrowser (String url) {
		
	System.setProperty("webdriver.edge.driver", "D:\\apps\\Selenium\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();  
	
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
	return driver;
}

	
//////////////////////////////////////////////////////////////////////////////////////////////	
	public static void SrnShot (String a) throws IOException {
		
		WebDriver driver = new EdgeDriver();  
		
        File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File ("C:\\Users\\SAICOM\\Desktop\\Testing\\JavaPDF\\"+ a +".png");
		FileHandler.copy(source, Destination);
		
	}
///////////////////////////////////////////////////////////////////////////////////////////////
	
	
	public static void switchFocuse (WebDriver driver,String Title ) {

		
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> a = handle.iterator();
		
		while(a.hasNext())
		{
			String HandleNext = a.next();
			
			driver.switchTo().window(HandleNext);
			String currentTitle = driver.getTitle();
			
			if(currentTitle.equals(Title))
			{
				break;
			}
	}
  }
}



