package testAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WholePractice {
	public static void main(String [] args) throws InterruptedException {
		
System.setProperty("webdriver.edge.driver" , "D:\\apps\\Selenium\\msedgedriver.exe");		
	
WebDriver driver = new EdgeDriver();
		
/* driver.get("https://vctcpune.com/");

//     Methods of  navigation class   //

driver.navigate().to("https://vctcpune.com/");  // to get webpage by url
driver.navigate().back();                       //to navigate backword
driver.navigate().forward();                    //to navigate page to forword
driver.navigate().refresh();                    //to refresh the page
		
String URL = driver.getCurrentUrl(); //is the method of that gives the current url in form of string
System.out.println(URL);

String Title =driver.getTitle();
System.out.println(Title);

driver.manage().window().minimize();
driver.manage().window().maximize();


Dimension D = new Dimension(400,500);
driver.manage().window().setSize(D);
 driver.manage().window().fullscreen();
Point A = new Point(500,300);
driver.manage().window().setPosition(A);

driver.quit();
*/
 
//  methods of WebElements  & locators //
 
//Thread.sleep(1000);
//WebElement image = driver.findElement(By.xpath("//input[@type='text']"));
//image.sendKeys("Harmonica"); 
//WebElement byId = driver.findElement(By.id("nav-search-submit-button"));
//byId.click();

//WebElement ByClass = driver.findElement(By.className("nav-cart-icon nav-sprite"));
//ByClass.click();

//WebElement ByCSS = driver.findElement(By.cssSelector("input[type='text']"));
//ByCSS.sendKeys("Harmfull");
//
//WebElement ByXpath = driver.findElement(By.xpath("//input[@type='text']"));
//ByXpath.sendKeys("Gaurav");
 
driver.get("https://vctcpune.com/selenium/practice.html");
driver.manage().window().maximize();
WebElement Rclick = driver.findElement(By.xpath("//input[@value='Radio2']"));
Rclick.click();
boolean A =Rclick.isSelected();
System.out.println(A);
WebElement show = driver.findElement(By.xpath("//input[@value='Show']"));
show.click();
WebElement inputshow = driver.findElement(By.xpath("//input[@id='displayed-text']"));
inputshow.sendKeys("ABCD");
boolean G =inputshow.isDisplayed();
System.out.println(G);

WebElement hide = driver.findElement(By.xpath("//input[@name='show-hide']"));
hide.click();


	}
}
