package userStories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseClass.ApplicationLogin;

public class TC003_CreateNewTaskByClickingAddTaskButton {

	public static WebDriver driver = null;
	public static void main(String[] args) {
		
		ApplicationLogin bt = new ApplicationLogin();
		driver = bt.launchBrowser();
		
		CommonUtilities cu = new CommonUtilities();
		cu.clickElement(driver.findElement(By.linkText("My Tasks")), "My Tasks");
		
		cu.newTaskWithAddTaskButton(driver.findElement(By.id("new_task")), "New Task 2");
		driver.findElement(By.xpath("//span[@class='input-group-addon glyphicon glyphicon-plus']")).click();
		
		//Checking if task is created and visible in todo list
		String taskName = driver.findElement(By.linkText("New Task 2")).getText();
		if (taskName.equalsIgnoreCase("New Task 2")) {
			System.out.println("Passed - Created task '" + taskName + "' appends in the todo list.");
		} else {
			System.out.println("Failed - Created task '" + taskName + "' is not shown in todo list");
		}
		
		driver.close();
	}

}
