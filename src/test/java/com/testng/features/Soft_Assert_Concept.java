package com.testng.features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {

	@Test
	public void demo_Password() {

		String exp = "CXV123";
		
		String act = "CXV1234";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(act, exp);
		
		System.out.println("Verification");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
