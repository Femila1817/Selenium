package SeleniumNewPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FifteenReadPropFile {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
//to read the property file we need to use the class properties
		Properties prop = new Properties();
		//FileInputStream - create a inputstream b/w file and java class - basically a connection
		FileInputStream ip = new FileInputStream("C:\\Users\\Femila\\eclipse-workspace\\MySeleniumProject\\src\\config.properties");
		
		//after connection we have to load the file
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name")); //the property key should be the exact same mentioned in the file & case sensitive
		System.out.println(prop.getProperty("age"));
		String url = prop.getProperty("URL");
		
		System.out.println(url);
		
		String bname = prop.getProperty("browser");
		System.out.println(bname);
		
		if (bname.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get(url);

		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		}else if(bname.equals("firefox")){
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\geckodriver.exe");
			 driver = new FirefoxDriver();
			 
			
		}else {
			System.out.println("No browser is specified");
		}
	}

}
