package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Maven_Project.BaseClass;
import com.runnerclass.Test_Runner;
import com.sdp.Page_Object_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Step_Definition extends BaseClass{

	
	public static WebDriver driver = Test_Runner.driver;
	
	public static Page_Object_Manager p = new Page_Object_Manager(driver);
	
	@Before
	public void before_Hooks(Scenario s) {

		String name = s.getName();
		System.out.println("Scenario name is :"+name);
	}
	
	@After
	public void after_Hooks(Scenario s) {

		String status = s.getStatus();
		System.out.println("Status :"+status);
		
		if (s.isFailed()) {
			
	         //screenshot method
		}
	}
	
	
	
	
}
