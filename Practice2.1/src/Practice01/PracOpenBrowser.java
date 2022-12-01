package Practice01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PracOpenBrowser {


	public static WebDriver OpenBrowser(String url) {
		
		System.setProperty("webdriver.edge.driver","D:\\apps\\Selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		return driver;
		
		}
}