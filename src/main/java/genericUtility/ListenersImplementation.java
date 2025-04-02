package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener {

	JavaUtility jUtil = new JavaUtility();
	String dateTimeStamp = jUtil.getCalendaretails("dd-MM-YYY hh-mm-ss");

	ExtentReports report;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"->On Test start");
		Reporter.log(methodName+"->On Test start");

		//Create a feild in the generated extent report
		test = report.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"->On Test success");
		Reporter.log(methodName+"->On Test success");

		//Logging the status
		test.log(Status.PASS, methodName+"- executed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"->On Test failure");
		Reporter.log(methodName+"->On Test failure");

		//Logging the status
		test.log(Status.FAIL, methodName+"- test failed");

		//Logging the throwable messages
		test.log(Status.INFO, result.getThrowable());

		//It will take the screenshot of the webpage
		SeleniumUtility sUtil = new SeleniumUtility();
		try {
			String path=sUtil.takeScreenshot(BaseClass.sDriver, dateTimeStamp);
			test.addScreenCaptureFromBase64String(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"->On Test Skipped");
		Reporter.log(methodName+"->On Test Skipped");

		//Logging the status
		test.log(Status.SKIP, methodName+"- test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Suite start");

		//Configuration of the Extent Report
		ExtentSparkReporter reporter = new ExtentSparkReporter(".\\Extent Reports\\report-"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("VTiger Execution Report");
		reporter.config().setReportName("Build 1 VTiger Report");
		reporter.config().setTheme(Theme.STANDARD);

		//Configuration of the Extent Report
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Base OS", "Windows");
		report.setSystemInfo("Base URL", "http://localhost:8888");
		report.setSystemInfo("Base Platform", "Testing-Env");
		report.setSystemInfo("Base browser", "chrome");
		report.setSystemInfo("Reporter", "Nagaraj");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Suite finish");

		//Flushing the report
		report.flush();
	}


}