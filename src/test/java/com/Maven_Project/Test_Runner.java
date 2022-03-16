package com.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.helper.File_Reader_Manager;
import com.pomclass.Home_Page;
import com.pomclass.Login_Page;
import com.sdp.Page_Object_Manager;

public class Test_Runner extends BaseClass {

	public static WebDriver driver = browserLaunch("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		
		launchUrl(url);

		clickOnElement(pom.getInstanceHome().getSignin());

		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getEmail();
		
		inputValues(pom.getInstanceLogin().getEmail(),email);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();

		inputValues(pom.getInstanceLogin().getPassword(), password);

		clickOnElement(pom.getInstanceLogin().getSignin());

	}
}
