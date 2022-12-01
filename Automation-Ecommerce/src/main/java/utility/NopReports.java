package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class NopReports {
	
	public static ExtentReports Reports () {
	
		ExtentSparkReporter emailableHtml = new ExtentSparkReporter("SwgLabreport.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(emailableHtml);
		report.setSystemInfo("Created By", "Gaurav");
		report.setSystemInfo("Assigned By", "Subhod Sir");
		return report;
		
	}

}
