package TestSel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class TestFacebook {
	
		static WebDriver driver;
		//static Properties prop;

			public static void main(String[] args) throws InterruptedException, IOException {
				Properties prop = new Properties();

				FileInputStream ip = new FileInputStream(
						"C:\\Users\\Femila\\eclipse-workspace\\MySeleniumProject\\src\\config.properties");

				prop.load(ip);

				String browser = prop.getProperty("Fb_browser");
				System.out.println(browser);
				if (browser.equals("chrome")) {

					System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\WebDriver\\chromedriver.exe");
					//Create prefs map to store all preferences 
					Map<String, Object> prefs = new HashMap<String, Object>();

					
					prefs.put("profile.default_content_setting_values.notifications", 2);

					
					ChromeOptions options = new ChromeOptions();
					options.setExperimentalOption("prefs", prefs);

					
					driver = new ChromeDriver(options);
				} else if (browser.equals("firefox")) {
					System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\WebDriver\\geckodriver.exe");
					driver = new FirefoxDriver();

				} else if (browser.equals("ie")) {
					System.setProperty("webdriver.ie.driver", "C:\\Selenium\\WebDriver\\iexploredriver.exe");
					driver = new InternetExplorerDriver();
				}
				String url = prop.getProperty("Fb_Url");
				System.out.println(url);
				String userNameXP = prop.getProperty("Fb_Uname_XP");
				//String username = prop.getProperty("Fb_Uname");
				String username = JOptionPane.showInputDialog("Enter the username : ");
				String passwordXP = prop.getProperty("Fb_Pass_XP");
				String password = JOptionPane.showInputDialog("Enter the username : ");
				//String password = prop.getProperty("Fb_pass");
				String login = prop.getProperty("Fb_login");
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				driver.get(url);
				
				driver.findElement(By.xpath(userNameXP)).sendKeys(username);
				driver.findElement(By.xpath(passwordXP)).sendKeys(password);
		
				driver.findElement(By.xpath(login)).click();
			
				Thread.sleep(3000);

			
				WebElement TextArea = driver.findElement(By.name("xhpc_message"));
				Thread.sleep(2000);
				TextArea.click();
				TextArea.sendKeys("Hello World");


				driver.findElement(By.xpath("//button/span[.=\"Share\"]")).click();
System.out.println("Completed");
driver.close();
			}}
		
		
		
