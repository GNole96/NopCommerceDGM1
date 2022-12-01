package testAuto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Automation.GnEmpliment;



public class TableHandle {
	

	@Test
public void FindMaxFromTableColumn() {
		
WebDriver driver = GnEmpliment.openbrowser("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> TableRowData = driver.findElements(By.xpath("(//table)[2]//tbody//tr//td[4]"));
     
		double max = 0;  //for comparing from minimum value 
		
		for (int i = 0;i<TableRowData.size();i++) {
			
			WebElement title = TableRowData.get(i);    //get a Webelement from list of   i'th  index
			String B = title.getText();                // get text of i'th index Webelement as a string 
			double titlevalue = Double.parseDouble(B); // convert the numeric string value in to number.
			
			if(titlevalue>max){ 
				
				max=titlevalue;
			}	
		}
		
		System.out.println("Maxumum value from current prise column is :- "+ max);	
		}
	
	@Test (priority = 1)
public void FindMinFromTableColumn() {
	
WebDriver driver = GnEmpliment.openbrowser("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> TableRowData = driver.findElements(By.xpath("(//table)[2]//tbody//tr//td[4]"));
     
		double min = 2000;  //2000 considered as maximum value 
		                    //for comparing with maximim value for getting minimum value
		
		for (int i = 0;i<TableRowData.size();i++) {
			
			WebElement title = TableRowData.get(i);    //get a Webelement from list of   i'th  index
			String B = title.getText();                // get text of i'th index Webelement as a string 
			double titlevalue = Double.parseDouble(B); // convert the numeric string value in to number.
			
			if(titlevalue<min){ 
				
				min=titlevalue;	
			}
		}
		
		System.out.println("Minimum value from current prise column is :- "+ min);
		
		}
	
	@Test (priority = 2)
public  void FindMaxAndMinFromTableColumn() {
		
WebDriver driver = GnEmpliment.openbrowser("https://demo.guru99.com/test/web-table-element.php");
	
	List<WebElement> TableRowData = driver.findElements(By.xpath("(//table)[2]//tbody//tr//td[4]"));
    List<WebElement> ComanyName = driver.findElements(By.xpath("(//table)[2]//tbody//tr//td[1]"));
	double max = 0;  //for comparing from minimum value 
	double StoreMin = 0;
	String CN = "";
	String CN1 = "";
	
for (int i = 0;i<TableRowData.size();i++) {
	WebElement title0 = TableRowData.get(i);    //get a Webelement from list of   i'th  index
	WebElement Cname = ComanyName.get(i);
	String A = title0.getText();  
	double titlevalue0 = Double.parseDouble(A);
	
	if(titlevalue0>max){ 	
		max=titlevalue0;
		CN = Cname.getText();
	}
	StoreMin = max ;
    }

    for (int j = 0;j<TableRowData.size();j++) {
	WebElement title = TableRowData.get(j);
	WebElement Cname1 = ComanyName.get(j);
	String B = title.getText();
    double titlevalue = Double.parseDouble(B); // convert the numeric string value in to number.
	  if(titlevalue<StoreMin){ 	
		  StoreMin=titlevalue;
		  CN1=Cname1.getText();
		}
}
System.out.println("Maxumum value having company name is :- "+ CN);
System.out.println("Maxumum value from current prise column is :- "+ max);
System.out.println("Minimum value having company name is :- "+ CN1);
 System.out.println("Minmum value from current prise column is :- "+ StoreMin);
}	
	
@AfterMethod
public void close1(WebDriver driver) {
	driver.close();
}
}
