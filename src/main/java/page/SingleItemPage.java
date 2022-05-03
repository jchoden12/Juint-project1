package page;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SingleItemPage extends BasePage {

	WebDriver driver;

	String enteredName;
	String todocheckboxes;

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
	List<WebElement> ALL_TODO_LIST_Element;
	@FindBy(how = How.CSS, using = "#todos-content > form > ul > li:nth-last-child(1) > input[type=checkbox")
	WebElement ENTERED_NAME_CHECKBOX_ELEMENT;

//  #todos-content > form > ul > li:nth-child(i)
//	#todos-content > form > ul > li:nth-child(3) > input[type=checkbox]

	public void insertListItem(String data) {

		int generatedNumber = generateRandomNumber(999);
		enteredName = data + generatedNumber;
		ADD_NEW_ITEM_ELEMENT.sendKeys(enteredName);
		ADDBUTTON_ELEMENT.click();
		List<WebElement> alltodoCheckBoxes = ALL_TODO_LIST_Element;

	}

	public void verifySingleItemIsSelected() {

		ENTERED_NAME_CHECKBOX_ELEMENT.click();
		Boolean response = ENTERED_NAME_CHECKBOX_ELEMENT.isSelected();
		if (response == true) {
			System.out.println("Single Item is selected");

		} else {
			System.out.println("item is not selected");
		}
	}

	public void removeSingleItem() {

		REMOVE_BUTTON_ELEMENT.click();

	}

	public void verifySingleItemRemoved() {

		List<WebElement> alltodoCheckBoxes = ALL_TODO_LIST_Element;

		Iterator itr = alltodoCheckBoxes.listIterator();

		while (itr.hasNext()) {
			WebElement list = (WebElement) itr.next();
			todocheckboxes = list.getText();
			System.out.println(todocheckboxes);

		}

		if (todocheckboxes.contains(enteredName)) {
			System.out.println("item Entered is not Removed ");
		} else {
			System.out.println("Single item selected is removed");
		

		}

	}

}
