package SeleniumNewPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EightImplicitWaitConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		
		
		
			driver.get("http://www.half.ebay.com"); //heavy site
			
			//Thread.sleep(2000);   -->> static wait --> wait till timeout if the page is loaded compl in btwn the sleep time
			
			//below 2 are global wait or dynamic
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //giving max 40 sec to completely load the page
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //giving time for the all elements to load completely if anything is not loaded after the page is loaded completely
			
			//once page is load, it goes other function, instead of waiting thr till timeout
			
			
	
	}

}
