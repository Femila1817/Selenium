package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OneTestNGBasics {  //each and every annotation should be associated with one method
	/*
	 * Setup system property for chrome
		launch chrome browser 
		Login
		Enter URL : 
		Google Title Test
		Login to app and logout from app
		Close Browser
		Deleting all Cookies
	 * 
	 * 
	 */
	/*
	 * @BeforeSuite - Setup system property for chrome   --Prefrence 1
		@BeforeTest - launch chrome browser  -- 2
		@BeforeClass - Login --3
		@BeforeMethod - Enter URL : --4 
		@Test - Google Logo Test
		@AfterMethod - Login to app and logout from app   //5
		@BeforeMethod - Enter URL : 
		@Test - Google Title Test
		@AfterMethod - Login to app and logout from app  
		@BeforeMethod - Enter URL : 
		@Test - search Test
		@AfterMethod - Login to app and logout from app  //6
		@AfterClass - Close Browser //7
		@AfterTest - Deleting all Cookies //8
	 */
	@BeforeSuite
	public void setup() {  //starting with @Before --> preconditions
		System.out.println("@BeforeSuite - Setup system property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("@BeforeTest - launch chrome browser ");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("@BeforeClass - Login");
	}
	
	@BeforeMethod
	public void Enter_URL() {
		System.out.println("@BeforeMethod - Enter URL : ");
	}
	
	@Test
	public void googleTitleTest() {    //Testcase -- starting with @Test //so far we have only one test case, what if we need to write more than one
		System.out.println("@Test - Google Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("@Test - search Test");
	}
	@Test
	public void GoogleLogoTest() {
		System.out.println("@Test - Google Logo Test");
	}
		/* 
		* Every testcase will follow the below sequence
		* 1.@BeforeMethod
		* 2.@Test                 //test1
		* 3.@AfterMethod
		* 4.@BeforeMethod
		* 5.@Test
		* 6.AfterMEthod  //test2 or any test, test will be picked randomly but the method execution pair will be same
		*
		*/
	
	@AfterMethod   //after testcase done -- > starting with @After  -> post condition
	public void logout() {
		System.out.println("@AfterMethod - Login to app and logout from app");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass - Close Browser");
	}
	
	@AfterTest
	public void delAllCookies() {
		System.out.println("@AfterTest - Deleting all Cookies");
	}
	@AfterSuite
	public void genTestReport() {
		System.out.println("@AfterSuite - Generate Test Report");
	}
	
	
}
