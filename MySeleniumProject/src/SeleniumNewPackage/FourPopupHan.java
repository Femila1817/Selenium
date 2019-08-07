package SeleniumNewPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourPopupHan {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver upurl = new ChromeDriver();
		
		// For Browse Popup -- file upload
		
		upurl.get("https://html.com/input-type-file/");
		
		
		//dont use click, use sendkey and provide the file path -> the file will be automatically uploaded
		upurl.findElement(By.id("fileupload")).sendKeys("E:\\Study\\apache-jmeter-5.0\\apache-jmeter-5.0\\bin\\jmeter.log");
	}

}
