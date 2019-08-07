package SeleniumNewPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MyThirdProgram {
	  public static void main(String[] args) {
		  	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\Chromedriver.exe");  
		  	WebDriver driver = new ChromeDriver();
	        driver.get("http://demo.guru99.com/selenium/deprecated.html");
	        driver.switchTo().frame("classFrame");
	        driver.findElement(By.linkText("Deprecated")).click();
	        driver.close(); 
	    }
}
