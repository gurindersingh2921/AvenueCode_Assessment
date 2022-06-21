package userStories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseClass.ApplicationLogin;

public class TC004_ButtonLabel {
	
	public static WebDriver driver = null;
	public static void main(String[] args) {
		
		ApplicationLogin bt = new ApplicationLogin();
		driver = bt.launchBrowser();
		
		CommonUtilities cu = new CommonUtilities();
		cu.clickElement(driver.findElement(By.linkText("My Tasks")), "My Tasks");
		
		String btnLabel = driver.findElement(By.xpath("//tbody/tr[3]/td[4]/button[1]")).getText();
		if (btnLabel.contains("Manage Subtasks")) {
			System.out.println(btnLabel + " is present.");
		} else {
			System.out.println(btnLabel + " is missing.");
		}
		
		//Clicking on Manage Subtasks button
		driver.findElement(By.xpath("//tbody/tr[3]/td[4]/button[1]")).click();
		
		//Verifying read only task id and desciption
		String taskID = driver.findElement(By.xpath("//h3[normalize-space()='Editing Task 3712']")).getAttribute("Editing Task 3712");
		
		//Entering new subtask description and due date
		driver.findElement(By.id("new_sub_task")).sendKeys("Subtask 1");
		driver.findElement(By.name("due_date")).clear();
		driver.findElement(By.name("due_date")).sendKeys("2/8/2022");
		
		
		//Click on Add button to add subtask
		driver.findElement(By.id("add-subtask")).click();
		
		//Verifying if Added subtask is appended on the bottom part of modal dialog 
		cu.subTaskVerification(driver.findElement(By.linkText("Subtask 1")), "Subtask 1");
		
		driver.close();
	}

}
