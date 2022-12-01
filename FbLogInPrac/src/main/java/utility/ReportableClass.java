package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportableClass {
	
	public static ExtentReports Report () {
		
		ExtentSparkReporter reportHtml =new ExtentSparkReporter("extentReport.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(reportHtml);
		report.setSystemInfo("Created By", "Gaurav");
		report.setSystemInfo("Assigned By","Madhuri");
		return report;
		 
	}

} 
