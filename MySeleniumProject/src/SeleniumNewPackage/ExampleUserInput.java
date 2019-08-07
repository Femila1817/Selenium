package SeleniumNewPackage;

import java.util.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExampleUserInput {

	static Scanner sd = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
				
		driver.get("https://facebook.com");
		Thread.sleep(1500);
		
		
		//String username = JOptionPane.showInputDialog("Enter the username : ");
		String username = "mijainscribe@gmail.com";
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		String password = "hfnIT2013";
		//String password = JOptionPane.showInputDialog("Enter the password : "); 
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);;
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.getTitle());
		
		
	}

}

