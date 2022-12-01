package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PopAct {
	public static void main(String[] args) throws InterruptedException {
	
		//Popup      https://demo.guru99.com/test/simple_context_menu.html
		
		WebDriver driver = GnEmpliment.openbrowser("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement gg = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions a = new Actions(driver);
		a.doubleClick(gg);
		a.perform();
		
		Alert s = driver.switchTo().alert();
		Thread.sleep(2000);
		s.accept();
		/*
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		a.contextClick(rightclick);
		*/
		WebElement bodyrightclick = driver.findElement(By.id("authentication"));
		a.contextClick(bodyrightclick);
		
		
		
	}
}
