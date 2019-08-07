package com.TestNG; //code taken from previous class

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreeTestNGContinution {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
	}
	
	@Test(priority=1,groups="Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=3,groups="Logo")  //priority is used to define the sequence
	public void googleLogoTest() {
		Boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	}
	@Test(priority=2,groups="Link")
	public void maillinkTest() {
		Boolean b1 = driver.findElement(By.linkText("Mail")).isDisplayed();
	}
	@Test(priority=4,groups="Testgrp")
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=7,groups="Testgrp")
	public void test2() {
		System.out.println("test2");
	}@Test(priority=5,groups="Testgrp")
	public void test3() {
		System.out.println("test3");
	}@Test(priority=6,groups="Testgrp")
	public void test4() {
		System.out.println("test4");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
