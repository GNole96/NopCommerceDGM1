package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.BaseClass;

public class SwagLabsOpenBrowser extends BaseClass{
	
	
	
	public static WebDriver OpenEdgeBrowse() {
		
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
        //driver.get("https://www.saucedemo.com/");
		//driver.get("https://www.zlti.com/");
		//driver.get("https://mvnrepository.com/");
        driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		return driver;
	}

	
	public static WebDriver OpenChromeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		return driver;
	}
	
	
	public static WebDriver CrossWithBrowser(String BrowserName) {
		
		
		if(BrowserName.equals("Edge")) 
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		else if(BrowserName.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.zlti.com/");
		driver.manage().window().maximize();
		return driver;
	}
	
}
