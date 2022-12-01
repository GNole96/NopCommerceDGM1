package Practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracActionClass {
	
public static void KeyBordAction() {
	
	WebDriver driver = PracOpenBrowser.OpenBrowser("https://www.facebook.com/");
	
	WebElement CreatAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	CreatAcc.click();
	
	Actions act = new Actions(driver);
	WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
	WebElement GenderMale = driver.findElement(By.xpath("//label[text()='Male']"));
	WebElement GenderFemale = driver.findElement(By.xpath("//label[text()='Female']"));
	
	act.sendKeys(firstName, "Madhu");
	act.sendKeys(Keys.TAB);
	
	act.sendKeys("Balkhande");
	act.sendKeys(Keys.TAB);
	act.sendKeys("madhubalkhande19@gmail.com");
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("A");
	act.sendKeys("C");
	act.keyUp(Keys.CONTROL);
	
	act.sendKeys(Keys.TAB);
	act.keyDown(Keys.CONTROL);
	act.sendKeys("V");
	act.keyUp(Keys.CONTROL);
	
	act .sendKeys(Keys.TAB);
	act.sendKeys("Madhu@Kahi_nahi123");

	
	
	WebElement B_date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s =new Select(B_date);
	s.selectByValue("13");
	
	WebElement  B_month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select m = new Select (B_month);
	m.selectByValue("1");

	WebElement B_year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select y = new Select(B_year);
	y.selectByValue("1998");

	act.click(GenderMale);
	act.moveToElement(GenderFemale);
	act.click();
	
	act.build().perform();
	
	
}
public static void main(String[] args) {
	
	KeyBordAction();
}
}
