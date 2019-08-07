package SeleniumNewPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThirteenExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver, 20); //explicit wait, which waits for certain ajax elements to load
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//explicit wait can be used for any specific element
		
	//	clickOn(driver, driver.findElement(By.xpath("//input[@id='u_0_a']")), 20);
		

	//}
	//public static void clickOn(WebDriver driver, WebElement Locator, int timeout) {
	//	new WebdriverWait(driver, timeout).ignoring
	}

}
