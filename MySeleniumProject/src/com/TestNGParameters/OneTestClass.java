package com.TestNGParameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class OneTestClass {
	
	WebDriver driver;
	@Test
	@Parameters({"env","browser","url","emailid"}) 
	public void gmailLoginTest(String env, String browser, String url, String emailid) {
		
		if(browser.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		}
		else {
			System.out.println("Do Nothing");
		}
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mijainscribe@gmail.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailid);
		
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hfnIT2013");
		
		driver.findElement(By.xpath("//input[@id='u_0_a']")).click();
		
	
	}

}
