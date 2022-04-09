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
		driver = this.driver;
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

//#todos-content > form > ul > li:nth-child(i)

	

	String enteredName;

	public void insertListItem(String data) {

		int generatedNumber = generateRandomNumber(999);
		enteredName = data + generatedNumber;
		ADD_NEW_ITEM_ELEMENT.sendKeys(enteredName);
		ADDBUTTON_ELEMENT.click();

	}
	
	String beforePath = "#todos-content > form > ul > li:nth-child(";
	String afterPath = ")";

	public void verifyEnteredListItem() {

		for(int i = 1; i < 4; i++) {
			String result = driver.findElement(By.cssSelector(beforePath + i + afterPath)).getText();
			System.out.println(result);

//				Assert.assertEquals(enteredName, result,"does not exist");
//				if(result.contains(enteredName)) {
//					driver.findElement(By.cssSelector(beforePath + i + afterPath)).click();

		}
			

//		}

	 }
	
	public void verifySingleItemsIsSelected() {
		 
		boolean result1 = ALL_CHECKBOXES_Element.isSelected();
		if (result1 == true) {
			System.out.println("single item is selected" + " " + result1);
			
			REMOVE_BUTTON_ELEMENT.click();
			
		}
	}


}
