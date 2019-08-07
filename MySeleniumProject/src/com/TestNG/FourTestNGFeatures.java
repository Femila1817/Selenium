package com.TestNG;

import org.testng.annotations.Test;

public class FourTestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("Loging Test");
		//int i = 9/0; //purposefuly making it fail, bcause 9 cannot be divided by 0
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homepage() {
		System.out.println("Homepage Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchpage() {
		System.out.println("Search page Test");
	}
	@Test(dependsOnMethods="loginTest")
	public void RegPageTest() {
		System.out.println("Registration page Test");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
