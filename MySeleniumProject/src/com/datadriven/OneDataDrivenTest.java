package com.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Excel.utility.Xls_Reader;

public class OneDataDrivenTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:reg.ebay.com/reg/PartialReg");
//		
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("test");
//		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("test");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@nanohea.com");
//		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("hfnIT2013");
//		
//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[contains(text(),'create')]")).click();
		
		Xls_Reader reader= new Xls_Reader("E:\\Datadriven\\ebay.xlsx");
		String firstname = reader.getCellData("RegTestData", "firstname", 2);
		System.out.println(firstname);

	}

}
