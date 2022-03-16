package com.testng.features;

import org.testng.annotations.Test;

public class Grouping_Concept {

	@Test(groups = "Vegetables")
	public void potato() {

		System.out.println("Potato");
	}
	@Test(groups = "Vegetables")
	public void carrot() {

		System.out.println("Carrot");
	}
	@Test(groups = "Vegetables")
	public void beetroot() {

		System.out.println("Beetroot");
	}
	@Test(groups = "Fruits")
	public void apple() {

		System.out.println("Apple");
	}
	@Test(groups = "Fruits")
	public void orange() {

		System.out.println("Orange");
	}
	@Test(groups = "Furnitures")
	public void fridge() {

		System.out.println("Fridge");
	}
	@Test(groups = "Furnitures")
	public void washingMachine() {

		System.out.println("Washing Machine");
	}
	
	
}
