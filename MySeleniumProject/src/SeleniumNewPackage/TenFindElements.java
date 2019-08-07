package SeleniumNewPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TenFindElements { //Elements --s not just element

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.half.ebay.com");
		
		//target1 -> get the count of links in th page 
		//target2 = > get the text of all link in the page
		
		List <WebElement> linklist = driver.findElements(By.tagName("a")); //all links are represented by a //when you hover findElements, get to know the list, so add it
		System.out.println(linklist.size()); //target2
		
		for(int i = 0; i < linklist.size() ; i++) {
			System.out.println(linklist.get(i).getText());
		}
	}

}
