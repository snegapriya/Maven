package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Concept {

	@Test
	public void demo_Username() {

		String exp = "Adidas";
		
		String act = "adidas";
		
        Assert.assertNotEquals(act, exp);			
		
        System.out.println("Validation");
	}
	
	
	
	
	
	
	
	
	
	
}
