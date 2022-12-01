package Automation;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = GnEmpliment.openbrowser("https://www.facebook.com/login/");
		GnEmpliment.SrnShot("SS33");
		GnEmpliment.SrnShot("SS66");

	}

}
