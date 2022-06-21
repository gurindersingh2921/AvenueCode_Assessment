package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import userStories.CommonUtilities;

public class ApplicationLogin {
	
	static WebDriver driver = null;
	
	public WebDriver launchBrowser() {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://qa-test.avenuecode.io/");
	
	driver.findElement(By.linkText("Sign In")).click();
	
	CommonUtilities cu = new CommonUtilities();
	cu.enterValueInTextField(driver.findElement(By.id("user_email")), "gurinderpsingh91@gmail.com");
	cu.enterValueInTextField(driver.findElement(By.id("user_password")), "assessmentqa");
	
	driver.findElement(By.name("commit")).click();
	
	
	return driver;
	}
}
