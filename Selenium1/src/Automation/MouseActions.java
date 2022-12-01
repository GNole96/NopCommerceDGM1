package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		   /*
	    https://www.globalsqa.com/demo-site/draganddrop/
	    http://demo.guru99.com/test/simple_context_menu.html
	    https://demoqa.com/text-box
		*/
		WebDriver driver =GnEmpliment.openbrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement iframe = driver.findElement(By.xpath("(//iframe[@height='500'])[1]"));
		driver.switchTo().frame(iframe);
		for(int z=0;z<=2;z++) {
		List<WebElement> source = driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
		WebElement paste = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions act = new Actions(driver);
		for(int i=0;i<source.size();i++){	
			WebElement image = source.get(i);
			act.dragAndDrop(image, paste);
			act.perform();	
		}
		
		List<WebElement> recycle = driver.findElements(By.xpath("//a[@class='ui-icon ui-icon-refresh']"));
		for(int a =0; a< recycle.size() ; a++) {
		
		WebElement d =recycle.get(a);
		d.click();
	
	}
	}	
	}
}
