package testPack;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (utility.Listeners.class)
public class SampleTest {
	
	
	@Test
	public void test01() {
		System.out.println("this is test 1 method");
	}
	
	@Test (timeOut = 2000)
	public void test02() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("this is test 2 method");
	}
	

}
