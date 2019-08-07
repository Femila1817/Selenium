package SeleniumNewPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OneTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
		WebDriver burl = new ChromeDriver();
		
		burl.get("https://staging.nanoheal.com/Dashboard/");
		System.out.println("Step1");
		
		burl.findElement(By.id("email")).sendKeys("admin@nanoheal.com");
		System.out.println("Step1");
		burl.findElement(By.xpath("//input[@id='password']")).sendKeys("nanoheal@123");
		System.out.println("Step2");
		burl.findElement(By.cssSelector("#loginSubmitId")).click();
		System.out.println("Step3");
		TimeUnit.SECONDS.sleep(45);
		System.out.println("Step4");
		burl.findElement(By.xpath("//span[@id='dropdownMenuButton']")).click();
		System.out.println("Step5");
		burl.findElement(By.xpath("//p[@id='QAStaging']")).click();
		System.out.println("Step6");
		Select s = new Select(burl.findElement(By.xpath("//span[contains(text(),'HFND100114e69daa77-6a8f-4c8d-9c20-03b11a64ad96')]")));
		//s.equals(HFND100114e69daa77-6a8f-4c8d-9c20-03b11a64ad96).
		//burl.findElement(By.xpath("//span[contains(text(),'HFND100114e69daa77-6a8f-4c8d-9c20-03b11a64ad96')]")).click();
		System.out.println("Step7");
		burl.findElement(By.xpath("//div[@id='save_rightMenu']//div[@class='toolTip']")).click();
		System.out.println("Step8");
		burl.findElement(By.xpath("//div[@class='navbar-toggle d-inline']//button[@class='navbar-toggler']")).click();
		System.out.println("Step9");
		burl.findElement(By.xpath("//a[@class='simple-text logo-mini']//img")).click();
		System.out.println("Step10");
		burl.findElement(By.xpath("//p[contains(text(),'Automation')]")).click();
		System.out.println("Step11");
		
		burl.findElement(By.xpath("//span[contains(text(),'Services')]")).click();
		System.out.println("Step12");
		burl.findElement(By.xpath("//div[contains(text(),'Other Configurations')]")).click();
		System.out.println("Step13");
		burl.findElement(By.xpath("//div[contains(text(),\"Dart's List\")]")).click();
		System.out.println("Step14");
		burl.findElement(By.xpath("//div[contains(@class,'content white-content services')]//div[4]//div[1]//div[2]//p[1]//span[1]")).click();
		System.out.println("Step15");
		burl.findElement(By.xpath("//textarea[@id='BrutusinForms#0_9']")).sendKeys("custom Message");
		System.out.println("Step16");
		burl.findElement(By.xpath("//div[@id='configuresideBar']//i[contains(@class,'tim-icons icon-check-2')]")).click();
		System.out.println("Step17");
	}

}
