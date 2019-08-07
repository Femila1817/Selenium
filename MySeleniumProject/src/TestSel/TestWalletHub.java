package TestSel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class TestWalletHub {

	static WebDriver driver;
//static Properties prop;

	public static void main(String[] args) throws InterruptedException, IOException {
		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"C:\\Users\\Femila\\eclipse-workspace\\MySeleniumProject\\src\\config.properties");

		prop.load(ip);

		String browser = prop.getProperty("browser");
		System.out.println(browser);
		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\WebDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\WebDriver\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\WebDriver\\iexploredriver.exe");
			driver = new InternetExplorerDriver();
		}
		//login page
		String url = prop.getProperty("Test_URL");
		String loginTab = prop.getProperty("login_Tab");
		String userNameXP = prop.getProperty("userName_XP");
		String userName = prop.getProperty("User_Name");
		String passwordXP = prop.getProperty("password_XP");
		String password = prop.getProperty("Password");
		String loginBtn = prop.getProperty("login_Btn");
		
		//Navigation url
		String NavUrl = prop.getProperty("Nav_URL");

		//Confirm navigation page and hover and click on stars
		String navPageConfirm = prop.getProperty("navPage_Confirm");
		String thirdStar = prop.getProperty("third_Star");
		String fiveStar = prop.getProperty("five_Star");

		//Confirm review page and write review
		String submitBtnCheck = prop.getProperty("SubmitBtn_Check");
		String selectOption = prop.getProperty("Select_Option");
		String selectCategory = prop.getProperty("Select_Category");
		String writeReview = prop.getProperty("Write_Review");
		String clickSubmit = prop.getProperty("Click_Submit");
		String checkReviewSubmit = prop.getProperty("Your_Review");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get(url);

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath(loginTab)).click();
		driver.findElement(By.xpath(userNameXP)).sendKeys(userName);
		driver.findElement(By.xpath(passwordXP)).sendKeys(password);
		driver.findElement(By.xpath(loginBtn)).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to(NavUrl);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement st = driver.findElement(By.xpath(navPageConfirm));
		WebElement finalpage = driver.findElement(By.xpath(checkReviewSubmit));
		
		
		if (driver.findElements(By.xpath(navPageConfirm)).size()>0) {
			Actions act = new Actions(driver);
			WebElement thirdstar = driver.findElement(By.xpath(thirdStar));
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			act.moveToElement(thirdstar).build().perform();
			if (thirdstar.isEnabled()) {
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.xpath(fiveStar)).click();
				WebElement btn = driver.findElement(By.xpath(submitBtnCheck));
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.xpath(selectOption)).click();
				driver.findElement(By.xpath(selectCategory)).click();
				driver.findElement(By.xpath(writeReview)).sendKeys(
						"This is a sample text, if you come across such kind of text, please ignore it. Hope this does not disturb you, in any ways..........");
				driver.findElement(By.xpath(clickSubmit)).click();
				driver.navigate().to(NavUrl);
				Asserts.check(finalpage.isDisplayed(), "Review Submitted");
				driver.close();
			} else {
				System.out.println("Stars are not lighten up");
			}

		}else {
			System.out.println("Page not found");
		}
	}

}
