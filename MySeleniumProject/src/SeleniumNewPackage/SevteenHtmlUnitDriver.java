package SeleniumNewPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SevteenHtmlUnitDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//HtmlUnitDriver is not a part of Selenium 3. and greater
				// to use this concept, we have to download, htmlunitdriver jar file.
		
		//HtmlUnitDriver --> also called "Ghost Driver" or "Headless Browser"
		//many headlessbrowser availlabe 1. htmlunitdriver - java, phantomJS -- javascript
		
		//2 advantages :
		//1. no browser launching - testing happening behind the scene
		//2. execution of test case is very fast  -- > improves performance
		
		//disadvantage
		//1. no suitable for Actions Class == > mouse movement, drag and drop, doubleclick
 
		
		WebDriver driver = new HtmlUnitDriver(); //is not part of selenium 3.0
		
			
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();

		
		driver.get("https://ui.freecrm.com/");
		
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("Before Login Title : " + driver.getTitle());
		
		
		driver.findElement(By.name("email")).sendKeys("dfemila90@gmail.com");
		driver.findElement(By.name("password")).sendKeys("hfnIT2013!");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		System.out.println("After Login : " + driver.getTitle());
		

	}

}
