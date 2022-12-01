package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenLinks {
	
	@Test
	public void FindBrokenLink () {
		
	WebDriver driver = GnEmpliment.openbrowser("https://www.zlti.com/");
		
		List<WebElement> anchor = driver.findElements(By.tagName("a"));
		
		System.out.println(anchor);
		
	}

}
