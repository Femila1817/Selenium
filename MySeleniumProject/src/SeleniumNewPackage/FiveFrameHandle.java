package SeleniumNewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiveFrameHandle {

	public static void main(String[] args) throws InterruptedException {
		//Frame is also an webelemet
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver frameurl = new ChromeDriver();
		
		frameurl.get("https://staging.nanoheal.com/Dashboard");
		frameurl.findElement(By.id("email")).sendKeys("admin@nanoheal.com");
		frameurl.findElement(By.name("password")).sendKeys("nanoheal@123");
		frameurl.findElement(By.xpath("//button[@id='loginSubmitId']")).click();
		
		//frameurl.findElement(By.xpath("//div[@class='navbar-toggle d-inline']//button[@class='navbar-toggler']")).click();
		
		Thread.sleep(3000);
		
		frameurl.switchTo().frame("Iframe");
		
		frameurl.findElement(By.xpath("//p[contains(text(),'Automation')]")).click();
		
		
				

	}

}
