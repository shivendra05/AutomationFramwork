package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		driver.close();
		System.out.println("BROWSER CLOSED");
	}

	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Jar files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		driver.close();
		System.out.println("BROWSER CLOSED");
	}
}