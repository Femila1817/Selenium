package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TwoGoogleTest {
	
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
	
	@Test(priority=1)
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=3)  //priority is used to define the sequence
	public void googleLogoTest() {
		Boolean b = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	}
	@Test(priority=2)
	public void maillinkTest() {
		Boolean b1 = driver.findElement(By.linkText("Mail")).isDisplayed();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
