package com.Maven_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver; // null driver
	
	// browser launch
	public static WebDriver browserLaunch(String name) {

		if (name.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
		    driver = new ChromeDriver();
			
			driver.manage().window().maximize();

		}
		else if (name.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
		}

		return driver;
	}
	
	//get
	
	public static void launchUrl(String url) {

		driver.get(url);
	}
	
	//close
	
	public static void closeBrowser() {

		driver.close();
	}
	
	//quit
	
	public static void quitBrowser() {

		driver.quit();
	}
	
	//sendkeys
	
	public static void inputValues(WebElement element , String input) {

		element.sendKeys(input);
	}
	
	//click
	
	public static void clickOnElement(WebElement element) {

		element.click();
	}
	
	
	
	
	
	
	
	
	

}
