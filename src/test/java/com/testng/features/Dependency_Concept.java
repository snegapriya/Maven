package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_Concept {

	@Test
	public void tenth() {

		System.out.println("Tenth");
	}
	
	@Test(dependsOnMethods = "tenth")
	public void twelth() {

		System.out.println("Twelth");
	}
	
	@Test(dependsOnMethods = "twelth")
	public void college() {

		System.out.println("College");
	}
	
	
	
	
	
	
	
	
	
	
}
