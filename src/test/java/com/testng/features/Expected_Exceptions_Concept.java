package com.testng.features;

import org.testng.annotations.Test;

public class Expected_Exceptions_Concept {

	@Test(expectedExceptions = ArithmeticException.class)
	public void demo() {

		int age = 25;
		
		System.out.println(age/0);
	}
	
	
	
	
	
	
	
	
	
	
	
}
