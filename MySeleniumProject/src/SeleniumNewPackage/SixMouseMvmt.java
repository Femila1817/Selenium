package SeleniumNewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SixMouseMvmt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver mm = new ChromeDriver();
		
		
		mm.manage().window().maximize(); //to maximize the chrome window
		
		mm.manage().deleteAllCookies(); //to delete all cookies..
		
		mm.get("https://www.spicejet.com/"); 
		
		Thread.sleep(5000);
		
		//for clicking an options that come on mouseover
		
	Actions mover = new Actions(mm); 
	
	mover.moveToElement(mm.findElement(By.xpath("//li[@id='header-addons']//a[@id='highlight-addons']"))).build().perform();
	//just move the mouse to the specific element
	
	Thread.sleep(3000);
	mm.findElement(By.xpath("//a[contains(text(),'Seat + Meal Combo')]")).click();
		
		
	}

}
