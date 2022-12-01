package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NewPractice {

	public static void main(String[] args) {
		
		WebDriver driver = GnEmpliment.openbrowser("https://vctcpune.com/selenium/practice.html");
		//For Scroll up and down we use Java Script Executor interface and complete it by using instance od webdriver.
	
		WebElement mouseButton = driver.findElement(By.xpath("//button[@id='mousehover']"));
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", mouseButton);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(500,600)");
	}
	

}
