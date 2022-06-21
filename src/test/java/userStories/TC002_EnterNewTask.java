package userStories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseClass.ApplicationLogin;

public class TC002_EnterNewTask {

	public static WebDriver driver = null;
	public static void main(String[] args) {
		
		ApplicationLogin bt = new ApplicationLogin();
		driver = bt.launchBrowser();
		
		CommonUtilities cu = new CommonUtilities();
		cu.clickElement(driver.findElement(By.linkText("My Tasks")), "My Tasks");
		
		//Creating a new task by hitting enter
		cu.newTask(driver.findElement(By.id("new_task")), "New Task");
		
		
	}

}
