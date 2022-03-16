package com.runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Project.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", 
                  glue = "com.stepdefinition")
public class Test_Runner {

	public static WebDriver driver;//null
	
	@BeforeClass
	public static void set_Up() {

        driver = BaseClass.browserLaunch("chrome");
	}
	@AfterClass
	public static void tear_Down() {

		driver.close();
	}
	
	
	
	
	
	
	
	
}
