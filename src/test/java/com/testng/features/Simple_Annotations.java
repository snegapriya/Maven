package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	public void propertySetting() {
 
		System.out.println("Property Setting");
	}
	
	@BeforeTest
	public void browser() {

		System.out.println("Browser launch");
	}
	
	@BeforeClass
	public void url() {

		System.out.println("Url launch");
	}
	@BeforeMethod
	public void signin() {

		System.out.println("Signin");
	}
	
	@Test(priority = -1)
	public void women() {

		System.out.println("Women");
	}
	@Test(priority = 0)
	public void men() {

		System.out.println("Men");
	}
	@Test(priority = 1 , invocationCount = 3)
	public void kids() {

		System.out.println("Kids");
	}
	@AfterMethod
	public void signout() {

		System.out.println("Signout");
	}
	@AfterClass
	public void homePage() {

		System.out.println("Home Page");
	}
	
	@AfterTest
	public void deleteCookies() {

		System.out.println("Delete cookies");
	}
	
	@AfterSuite
	public void closeBrowser() {

		System.out.println("Close Browser");
	}
	
	
	
	
	
	
	
}
