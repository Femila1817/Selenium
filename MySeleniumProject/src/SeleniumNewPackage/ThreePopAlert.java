package SeleniumNewPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreePopAlert {

	
	//unable to find popup using locator
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver ur = new ChromeDriver();
		
		ur.get("https://mail.rediff.com/cgi-bin/login.cgi");
		ur.findElement(By.name("proceed")).click(); //click on go button
		
		Thread.sleep(5000);
		 //to handle popup we have to switch from main window to popup window
		
		Alert alert = ur.switchTo().alert(); //define alert class
		
		System.out.println(alert.getText()); //get the popup content
		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct alert msg");
		}
			else {
				System.out.println("incorrect alert");
		}
		alert.accept();
		//alert.dismiss(); //if cancel button is there
	}

}
