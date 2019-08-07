package SeleniumNewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NineXpath {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.half.ebay.com");
		
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");
		//xpath starts wit //, folld by tag, []. inside [], @ then param name = 'param value'
		
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Java");
		
		
		
		driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("Java");

		//contains used to handle dynamic id, ies, id = test_123, test_456, in w/c the no changes on each refresh
		
		//another method to handle dynamic id if it has certain pattern
		
		///driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("java");
		
		// if = test_test_789_test -come weired id
		//id = 1234_test_t changes as, 23454_test_t ; 1545_test_t //here pattern is constant,but nunber changes
		//can use contains or,
		
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("java");
		
		//how to write xpath for specially for "LINK"
		//all link are represented by <a> </a>
		
		driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();
		
		
	}

}
