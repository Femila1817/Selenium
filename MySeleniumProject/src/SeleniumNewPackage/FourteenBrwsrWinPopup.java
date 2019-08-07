package SeleniumNewPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourteenBrwsrWinPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
				
		driver.get("http://popuptest.com/goodpopups.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();
		Thread.sleep(3000);
		//to handle browser windows, we have to use, windows handler
		
		Set<String> winhand = driver.getWindowHandles(); //winhandles -> bcos 2 window r there, 1 parent , 2-child
				//set - values are not stored based on index values > to get values, we have to use iterator
				
			Iterator<String> it = winhand.iterator();
			
			String parentwindow = it.next();
			System.out.println("Parent windows ID : " + parentwindow);
			
			String Childwindowid = it.next();
			System.out.println("The child window id is : " + Childwindowid);
			
			driver.switchTo().window(Childwindowid);
			Thread.sleep(3000);
			
			System.out.println("The child window popup title : " + driver.getTitle() );
			
			driver.close();
			
			Thread.sleep(3000);
			driver.switchTo().window(parentwindow);
			System.out.println("The parent window title" + driver.getTitle());
		
	}

}
