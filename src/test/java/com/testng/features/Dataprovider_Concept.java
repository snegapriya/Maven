package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {

	@Test(dataProvider = "inputData")
	public void credentials(String username,String password) {

		System.out.println("Username is :"+username);
		
		System.out.println("Password is :"+password);
		
	}
	
	@DataProvider
	public Object[][] inputData() {

		return new Object[][] {
			
			{"Javid" , "ry5676"},
			{"Saravanakumar" , "fyyu633"},
			{"Ganesh" , "cjio34"},
			{"Ranjith" , "jase45"}
		};
		
	}
	
	
	
	
	
	
	
	
	
	
}
