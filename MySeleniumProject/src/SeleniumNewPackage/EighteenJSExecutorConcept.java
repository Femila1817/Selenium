package SeleniumNewPackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EighteenJSExecutorConcept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		
		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.name("email")).sendKeys("dfemila90@gmail.com");
		driver.findElement(By.name("password")).sendKeys("hfnIT2a013!");
		//driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		
		
		//If i want to highlight the login button ==> how to highlight any specific button --> should use "JavaScript Executor"
		
		WebElement loginBtn = driver.findElement(By.xpath("//div[contains(text(),'Login')]")); //login button
		
		flash(loginBtn, driver);
		drawBorder(loginBtn, driver);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Femila\\Desktop\\Selenium\\element.png"));
		
		//generateAlert
		//generateAlert(driver, "There is an issue with login button on Login Page");
		
		
		//click on any element by js executor
		clickElementByJS(loginBtn, driver);
		
		//refresh a page
		//1.directly through selenium
		
		driver.navigate().refresh();
		
		//2.through javascript
		refreshBrowserbyJS(driver);
		
		//getthe title ogf the page by js
		
		System.out.println(getTitleByJS(driver));
		
		//get inner page text
		System.out.println(getPageInnerTest(driver));
		
		//scrollpagedown
		//ScrollpageDown(driver);
		
		//get forgot password element
		WebElement forgotpwdlink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]"));
		scrollIntoview(forgotpwdlink);
	}
	
		
		private static void scrollIntoview(WebElement forgotpwdlink) {
		// TODO Auto-generated method stub
		
	}


		public static void flash(WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			String bgcolor = element.getCssValue("backgroundColor");
			for(int i=0; i <= 10; i++) {
				changeColor("rgb(0,200,0)", element,driver);

			}
		}
		public static void changeColor(String color, WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
			try {
				Thread.sleep(20);
				}catch(InterruptedException e) {
					
				}
		}
		public static void drawBorder(WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.border='3px solid red'", element);
			
					}
		public static void generateAlert(WebDriver driver, String message) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("alert('"+message+"')");
			
		}
		
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}

	public static void refreshBrowserbyJS(WebDriver driver) {
		
	JavascriptExecutor js = ((JavascriptExecutor) driver);	
		js.executeScript("history.go(0)");
		
	}
	
public static String getTitleByJS(WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);	
	String title = js.executeScript("return document.tile;").toString();
	return title;
}

public static String getPageInnerTest(WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);	
	String pageText = js.executeScript("return document.documentElement.innerText;").toString();
	return pageText;
}

public static void ScrollpageDown(WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
}

public static void scrollIntoview(WebDriver element, WebDriver driver) {
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("argument[0].scrollIntoView(true);", element);
}
}
