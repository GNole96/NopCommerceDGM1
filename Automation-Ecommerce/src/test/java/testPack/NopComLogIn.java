package testPack;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pojo.Browsers;
import pom.NopComLogInPoM;
import utility.BaseClass;

@Listeners (utility.Listeners.class)
public class NopComLogIn extends BaseClass {
	
	
	@BeforeMethod
	public void OpenEdge() {
		driver = Browsers.OpenEdgeBrowser();
	}
	
	@Test
	public void LogInNopCom() {
		
		NopComLogInPoM z =new NopComLogInPoM (driver);
		z.InputEmail("Gau@123");
		z.InputPassword("123456");
		z.ClickOnLogInButton();
	}

}
