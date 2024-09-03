package com.opencart.utilities;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.opencart.testbase.BasePage;


public class MyListeners implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Execution of project tests started");
		String suiteName = context.getSuite().getName();
		BasePage.extentListeners = ExtentReporter.generaterExtentReport(suiteName);
		
		// Get the browser name parameter and set it in the Extent Report
        String browserName = context.getCurrentXmlTest().getParameter("browser");
        String os = context.getCurrentXmlTest().getParameter("os");
        if ((browserName != null) && (os != null)) {
            BasePage.extentListeners.setSystemInfo("Browser & Operating system",os+" "+ browserName);
        }
        
	}

	@Override
	public void onTestStart(ITestResult result) {
		String testName = result.getName();
		BasePage.test = BasePage.extentListeners.createTest(testName);
		BasePage.test.log(Status.INFO, testName + " = Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName = result.getName();
		BasePage.test.log(Status.PASS, testName + " = Sucessfull");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + " failed");
		if (BasePage.driver != null) {
			File srcScreenShot = ((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.FILE);
			String destinationScreenShotPath = System.getProperty("user.dir") + "\\ScreenShots\\" + testName + ".png";

			try {
				FileHandler.copy(srcScreenShot, new File(destinationScreenShotPath));
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("A screenshot has been captured");
			BasePage.test.addScreenCaptureFromPath(destinationScreenShotPath);
		} else {
			System.out.println("Driver is null, screenshot cannot be taken");
		}

		BasePage.test.log(Status.INFO, result.getThrowable());
		BasePage.test.log(Status.FAIL, testName + " = got failed");
		System.out.println();
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName = result.getName();
		BasePage.test.log(Status.INFO, testName + " = got skipped");
		BasePage.test.log(Status.SKIP, result.getThrowable());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All the test executing has finished");
		BasePage.extentListeners.flush();
	}
}