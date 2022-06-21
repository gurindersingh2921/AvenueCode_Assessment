package userStories;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CommonUtilities {
	
	/***
	 * @author Gurinder
	 * @Description This method is used to log into the application
	 * @param ele
	 * @param valuToEnter
	 */
	public void enterValueInTextField(WebElement ele, String valuToEnter) {
		ele.sendKeys(valuToEnter);
	}
	
	/***
	 * @author Gurinder
	 * @Description This method is used to click on My Tasks link.
	 * @param ele
	 * @param eleName
	 */
	public void clickElement(WebElement ele, String eleName) {
		if (ele.isDisplayed() ==true && ele.isEnabled() == true) {
			System.out.println(eleName + " - Element name is enabled and can be clicked.");
		} else {
			System.out.println(eleName + " - Element is not enabled");
		}
		ele.click();
	}
	
	/***
	 * @Description Entering new task by hitting enter
	 * @param ele
	 * @param taskName
	 */
	public void newTask(WebElement ele, String taskName) {
		ele.sendKeys(taskName);
		ele.sendKeys(Keys.ENTER);
	}
	
	/***
	 * @Description Entering new task by clicking create task button
	 * @param ele
	 * @param taskName
	 */
	public void newTaskWithAddTaskButton(WebElement ele, String taskName) {
		ele.sendKeys(taskName);
	}
	
	/***
	 * @Description Creating new task with a minimum of 3 characters
	 * @param ele
	 * @param nameTask
	 */
	public void newTaskThreeCharMin(WebElement ele, String nameTask) {
		ele.sendKeys(nameTask);
	}
	
	/***
	 * @Description This method is used to verify if created subtask is appended at the bottom part of modal dialog
	 * @param ele
	 * @param eleName
	 */
	public void subTaskVerification(WebElement ele, String eleName) {
		if (ele.isDisplayed() ==true) {
			System.out.println(eleName + " - is added.");
		} else {
			System.out.println(eleName + " - is not added");
		}
	}
	
}
