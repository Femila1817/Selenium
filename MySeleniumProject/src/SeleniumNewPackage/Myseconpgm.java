package SeleniumNewPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myseconpgm {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\WebDriver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        String baseUrl = "http://development.nanoheal.com/Dashboard";
        String name = "";
        
        driver.get(baseUrl);
        //name = driver.findElement(By.linkText("Create Account")).click();
        System.out.println(name);
        //driver.close();
        System.exit(0);
}
}