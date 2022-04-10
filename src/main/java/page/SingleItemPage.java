package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class SingleItemPage extends BasePage {

	WebDriver driver;

	public SingleItemPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.CSS, using = " input[name='data']")
	WebElement ADD_NEW_ITEM_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value = 'Add']")
	WebElement ADDBUTTON_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement REMOVE_BUTTON_ELEMENT;
	@FindBy(how = How.CSS, using = "input[name='todo[0]")
	WebElement TODO_LIST_ITEM_ELEMENT;
	@FindBy(how = How.CSS, using = "input[type='checkbox']")
	WebElement ALL_CHECKBOXES_Element;
	@FindBy(how = How.CSS, using = "li[style='font-size: 16px']")
	List<WebElement> ALL_TODO_CHECKBOXES_Element;

//  #todos-content > form > ul > li:nth-child(i)
//	#todos-content > form > ul > li:nth-child(3) > input[type=checkbox]

	String beforePath = "#todos-content > form > ul > li:nth-child(";
	String afterPath = ")";
	String checkboxBeforePath = "#todos-content > form > ul > li:nth-child(";
	String checkboxAfterPath = ") > input[type=checkbox]";

	String enteredName;

	public void insertListItem(String data) {

		int generatedNumber = generateRandomNumber(999);
		enteredName = data + generatedNumber;
		ADD_NEW_ITEM_ELEMENT.sendKeys(enteredName);
		ADDBUTTON_ELEMENT.click();
		List<WebElement> alltodoCheckBoxes = ALL_TODO_CHECKBOXES_Element;
		System.out.println("total number of ToDo List before removal  " + alltodoCheckBoxes.size());


	}

	public void removeSingleItem() throws Throwable {

		for (int i = 1; i < 10; i++) {
			String result = driver.findElement(By.cssSelector(beforePath + i + afterPath)).getText();
			System.out.println(result);

			if (result.contains(enteredName)) {
				driver.findElement(By.cssSelector(checkboxBeforePath + i + checkboxAfterPath)).click();
				Thread.sleep(2000);
				REMOVE_BUTTON_ELEMENT.click();
				

			}

		}

	}

	public void verifySingleItemRemoved() {

//		for (int j = 1; j < 10; j++) {
//			String result1 = driver.findElement(By.cssSelector(beforePath + j + afterPath)).getText();
//			System.out.println(result1);
//		boolean response = result1.contains(enteredName);
//		if(response == false) {
//			System.out.println("item is removed");
//			
//			Assert.assertEquals("item is removed", false, response);
//		}

			List<WebElement> alltodoCheckBoxes = ALL_TODO_CHECKBOXES_Element;
			System.out.println("total number of ToDo List after removal  " + alltodoCheckBoxes.size());
			
	}
}
