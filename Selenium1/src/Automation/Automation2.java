package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = GnEmpliment.openbrowser("https://nxtgenaiacademy.com/alertandpopup/");

	/*
	String s = driver.getCurrentUrl();
	System.out.println(s);
	
	String a = driver.getTitle();
	System.out.println(a);
	
	Dimension D = new Dimension(900,400);
	driver.manage().window().setSize(D);
		
    Point P = new Point(100,900);
	driver.manage().window().setPosition(P);
		
	driver.manage().window().fullscreen();
	
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("Gaurav Nole");
	
	WebElement click = driver.findElement(By.name("btnK"));
	click.click();
	*/
	WebElement arpop = driver.findElement(By.xpath("//button[@onclick='myFunctionTwo()']"));
	arpop.click();
	

		
	}
}