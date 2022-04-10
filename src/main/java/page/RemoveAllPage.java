package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllPage extends BasePage{
	
	WebDriver driver;

	public RemoveAllPage(WebDriver driver) {
		driver = this.driver;

	}

	@FindBy(how = How.CSS, using = "input[name='allbox']")
	WebElement TOGGLE_ALL_CHECKBOX_ELEMENT;
	@FindBy(how = How.XPATH,using = "/html/body/div[3]/text()[1]")
	WebElement TOGGLE_ALL_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement REMOVE_BUTTON_ELEMENT;
	@FindBy(how = How.CSS, using = "ul[style='list-style-type: none; padding-left:0']")
	WebElement TODO_LIST_ITEM_ELEMENT;
	@FindBy(how = How.CSS, using = "input[type='checkbox']")
	WebElement ALL_CHECKBOXES_Element;

//  #todos-content > form > ul > li:nth-child(i)
//	#todos-content > form > ul > li:nth-child(3) > input[type=checkbox]

	String beforePath = "#todos-content > form > ul > li:nth-child(";
	String afterPath = ")";
	String checkboxBeforePath = "#todos-content > form > ul > li:nth-child(";
	String checkboxAfterPath = ") > input[type=checkbox]";

	public void verifyToggleAllIsSelected () {
		TOGGLE_ALL_CHECKBOX_ELEMENT.click();
		boolean result = TOGGLE_ALL_CHECKBOX_ELEMENT.isSelected();
		if(result == true) {
			System.out.println("toggle all element is selected" + " " + result);
		}
		
	}
	
	public void removeAllListItems() {
		REMOVE_BUTTON_ELEMENT.click();
	
	}
	
	public void verifyAllListItemIsRemoved() {
		if(TODO_LIST_ITEM_ELEMENT.getText().isEmpty()) {
			System.out.println("All list items are removed");
		}
	}
	

}
