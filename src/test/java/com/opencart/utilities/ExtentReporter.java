package com.opencart.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
	
	public static ExtentReports report;
	public static ExtentReports generaterExtentReport(String suiteName) {
		if (report == null) {
            report = new ExtentReports();
            File extentReportFile = new File(System.getProperty("user.dir") + "\\reports\\"+com.opencart.utilities.Randoms.recentExtentReport()+"_" +suiteName+ "_.html");
            ExtentSparkReporter sparkReport = new ExtentSparkReporter(extentReportFile);
            
            sparkReport.config().setTheme(Theme.DARK);
            sparkReport.config().setTimeStampFormat("dd/MM/YYYY hh:mm:ss");

            report.attachReporter(sparkReport);
            Properties Config = new Properties();
            File ConfigPath = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Config.properties");
            try {
                FileInputStream ConfigFile = new FileInputStream(ConfigPath);
                Config.load(ConfigFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
            report.setSystemInfo("Application URL", Config.getProperty("URL"));
            
        }
        return report;
	}
	
}
