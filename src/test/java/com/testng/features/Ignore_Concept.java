package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {

	@Test
	public void chicken() {

		System.out.println("Chicken");
	}
	@Test(enabled = false)
	public void mutton() {

		System.out.println("Mutton");
	}
	@Test
	public void shawarma() {

		System.out.println("Shawarma");
	}
	@Test
	public void potato() {

		System.out.println("Potato");
	}
	@Ignore
	@Test
	public void tomato() {

		System.out.println("Tomato");
	}
	
	
	
	
	
	
	
}
