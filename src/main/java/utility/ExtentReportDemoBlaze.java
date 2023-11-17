package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemoBlaze {
	
	public static ExtentReports getReport() {
		
		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/report.html");
		reporter.config().setReportName("DemoBlaze Reporter");
		reporter.config().setDocumentTitle("DemoBlaze Document Title");
		
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		
		return extent;
	}

}
