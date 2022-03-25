package com.base;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public static WebDriver driver=null;
	public static Logger logger=null;


	static {
		logger = Logger.getLogger("test");
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\inputs\\log4j.properties");
	}

	@BeforeClass
	@Parameters("browser")
	public void initlizeDriver(String browser) {
		System.out.println("OPEN BROWSER:: "+browser);
		logger.info("launch URL");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	@AfterClass
	public void closeDriver() {
		logger.info("close browser");
		System.out.println("CLOSE BROWSER:: ");
		driver.close();
	}
}
