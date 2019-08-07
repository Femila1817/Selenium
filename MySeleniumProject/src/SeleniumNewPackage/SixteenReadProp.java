package SeleniumNewPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SixteenReadProp {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		
		FileInputStream fi = new FileInputStream("C:\\Users\\Femila\\eclipse-workspace\\MySeleniumProject\\src\\ebay.properties");
		
		prop.load(fi);
		
//		String fname = prop.getProperty("firstname");
//		String lname = prop.getProperty("lastname");
//		
//		String mail = prop.getProperty("email");
//		String pwd = prop.getProperty("password");
String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get(url);
			 Thread.sleep(1500);
//			 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("" + fname);
//			 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("" +lname);
//			 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("" +mail);
//			 driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("" +pwd);
			 
			 
			 //what is xpath are keep changing.. so we will write the code as, and give the xpath in the config file itself
			 
			 //so if any change happens in the xpath, we can modify in the config file itself
			 
			 driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
			 driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
			 driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
			 driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
			 
			 //we can use this config file for all the data, like xpath, id, name, button id, dropvox name, drop down name  etc
			 
		}else {
			System.out.println("No input");
		}
		
		

	}

}
