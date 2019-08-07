package SeleniumNewPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwoSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver testurl = new ChromeDriver();
		
		testurl.get("https://www.ebay.com/sch/ebayadvsearch");
		
		//to select dropdown
		Select select = new Select(testurl.findElement(By.id("e1-1")));
		select.selectByVisibleText("Baby");
		
	}

}
