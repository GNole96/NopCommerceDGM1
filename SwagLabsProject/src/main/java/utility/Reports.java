package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	public static  ExtentReports ReportMethod() {
		
		ExtentSparkReporter HtmlReport = new ExtentSparkReporter("SwgLabReport.html");
		ExtentReports Report = new ExtentReports();
		Report.attachReporter(HtmlReport);
		Report.setSystemInfo("Created By", "Gaurav Nole");
		Report.setSystemInfo("Assigned By", "Subhod Sir");
		return Report;
	}

}
