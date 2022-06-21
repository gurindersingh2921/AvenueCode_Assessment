package userStories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.ApplicationLogin;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TC001_ClickingOnMyTasksLink {
	
	public static WebDriver driver = null;
	public static void main(String[] args) {
		
		
		
		ApplicationLogin bt = new ApplicationLogin();
		driver = bt.launchBrowser();
		
		//Confirming to see if My Tasks link is available
		CommonUtilities cu = new CommonUtilities();
		cu.clickElement(driver.findElement(By.linkText("My Tasks")), "My Tasks");
		
		//Confirming the welcome message
		String message = driver.findElement(By.xpath("//h1[1]")).getText();
		
		if (message.equalsIgnoreCase("Hey Gurinder, this is your todo list for today:")) {
			System.out.println("Welcome message meets the requirements");
		} else {
			System.out.println("Welcome message is not correct.");
		}
	}
	
}
