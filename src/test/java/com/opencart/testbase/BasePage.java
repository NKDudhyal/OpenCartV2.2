package com.opencart.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.opencart.pages.LandingPage_POM;
import com.opencart.pages.RegisterPage_POM;
import com.opencart.pages.SuccessPage_POM;

public class BasePage {

	public static WebDriver driver;
	public Logger logger;
	public LandingPage_POM landingpage;
	public RegisterPage_POM registerpage;
	public SuccessPage_POM successPage;
	public static ExtentReports extentListeners;
    public static ExtentTest test;
	
	public Properties Config;

	/*
	@BeforeMethod
	public void sinle_Testcase() {
		setup();
	}
	*/

	@Parameters({ "os", "browser" })
	@BeforeMethod(groups = {"Sanity","Regression","Master"})
	public void sinle_Testcase(String os, String browser) throws MalformedURLException {
		setup(os, browser);
	}

	@AfterMethod(groups = {"Sanity","Regression","Master"})
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

	public void setup() {
		loadProperties();
		logger = LogManager.getLogger(this.getClass());
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(Config.getProperty("URL"));
		landingpage = new LandingPage_POM(driver);
		registerpage = new RegisterPage_POM(driver);
		successPage = new SuccessPage_POM(driver);
	}

	@SuppressWarnings("deprecation")
	public void setup(String os, String browser) throws MalformedURLException {
		loadProperties();
		logger = LogManager.getLogger(this.getClass());
		
		
		if(Config.getProperty("Execution_env").equalsIgnoreCase("remote")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			//os
			if(os.equalsIgnoreCase("windows")){
				capabilities.setPlatform(Platform.WIN11);
			} else if(os.equalsIgnoreCase("mac")) {
				capabilities.setPlatform(Platform.MAC);
			} else {
				System.out.println("No matching os");
				return;
			}
			
			//browser
			if (browser.equalsIgnoreCase("chrome")) {
				capabilities.setBrowserName("chrome");
			} else if(browser.equalsIgnoreCase("edge")) {
				capabilities.setBrowserName("MicrosoftEdge");
			} else if(browser.equalsIgnoreCase("firefox")) {
				capabilities.setBrowserName("firefox");
			} else {
				System.out.println("No matching browser");
			}
			
			driver = new RemoteWebDriver(new URL("http://192.168.1.2:4444/wd/hub"),capabilities);
			
		}
		
		if(Config.getProperty("Execution_env").equalsIgnoreCase("local")) {
			if (browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else {
				System.out.println("====== Please provide the browser name in xml file. ====== ");
			}
		}
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get(Config.getProperty("URL"));
		landingpage = new LandingPage_POM(driver);
		registerpage = new RegisterPage_POM(driver);
		successPage = new SuccessPage_POM(driver);
	}

	public void loadProperties() {
		Config = new Properties();
		File ConfigPath = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Config.properties");
		try {
			FileInputStream ConfigFile = new FileInputStream(ConfigPath);
			Config.load(ConfigFile);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
