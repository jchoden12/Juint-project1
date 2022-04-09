package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListPage extends BasePage {

	WebDriver driver;

	public ListPage(WebDriver driver) {
		driver = this.driver;

	}

	@FindBy(how = How.CSS, using = "input[name = 'data']")
	WebElement ADD_NEW_ITEM_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value = 'Add']")
	WebElement ADDBUTTON_ELEMENT;
	@FindBy(how = How.CSS, using = "input[name='allbox']")
	WebElement TOGGLE_ALL_BUTTON_ELEMENT;
	@FindBy(how = How.CSS, using = "input[name='todo[0]")
	WebElement TODO_LIST_ITEM_ELEMENT;
	@FindBy(how = How.CSS, using = "li[style='font-size: 16px']")
	List<WebElement> ALL_TODO_List_ELEMENT;
	@FindBy(how = How.CSS, using = "input[type='checkbox']")
	WebElement ALL_CHECKBOXES_Element;
	@FindBy(how = How.CSS, using = "input[value='Remove']")
	WebElement REMOVE_BUTTON_ELEMENT;

	public void addNewItem(String data) {
		int generatedNumber = generateRandomNumber(999);
		ADD_NEW_ITEM_ELEMENT.sendKeys(data +  generatedNumber );//// Xpath*[@id="todos-content"]/form/ul/li[1]/input
	}

	public void clickAddButton() {
		ADDBUTTON_ELEMENT.click();

	}

	public void clickToggleAllButton() {
		TOGGLE_ALL_BUTTON_ELEMENT.click();

	}

	public void ValidateALLCheckBoxesAreChecked() {

		TOGGLE_ALL_BUTTON_ELEMENT.click();
		boolean tab = TOGGLE_ALL_BUTTON_ELEMENT.isSelected();
		System.out.println("Toggle All Button is Checked " + " " + tab);

		List<WebElement> allToDoCheckboxes = ALL_TODO_List_ELEMENT;
		System.out.println("Total number todo checkboxes:" + allToDoCheckboxes.size());

		boolean Allcheckboxes = ALL_CHECKBOXES_Element.isSelected();
		System.out.println("all checkboxes are checked" + " " + Allcheckboxes);
		if (Allcheckboxes == true) {
			System.out.println("all checkboxes forList Items are checked");

		}

		if (!Allcheckboxes) {

			System.out.println("All checkboxes are not selected");
			System.out.println(allToDoCheckboxes);

		}

	}

	
		
// select the last check box		
		
//		int checkbox1 = allToDoCheckboxes.size();
// 		for(int i=checkbox1-1;i<checkbox1;i++) {
//		 driver.findElement(By.xpath("(//input[@type='checkbox'])[" + (i+1) + "]")).click();
      //input[@type = 'checkbox1'][" +(1"]

//		}
	}

//	public void removeSingleItem() {
//
//		List<WebElement> allToDoCheckboxes = ALL_TODO_List_ELEMENT;
//		System.out.println("total number of todo checkboxes before removing" + allToDoCheckboxes.size());
//		TODO_LIST_ITEM_ELEMENT.click();
//		REMOVE_BUTTON_ELEMENT.click();
//		System.out.println("total number of checkboxes after removing single item " + "" + allToDoCheckboxes.size());
//
//	}



//public void clickToggleALLButtonandValidate() {
//boolean a=TOGGLE_ALL_Button_ELEMENT.isSelected();
//System.out.println("Is checkbox is selected: "+a);
//TOGGLE_ALL_Button_ELEMENT.click();
//List<WebElement> checkboxes = ALL_TODO_List_ELEMENT;
//System.out.println("Total no of checkboxes " +checkboxes.size());
//
//boolean b=checkbox_Element.isSelected();
//System.out.println("Is checkbox is selected: "+b);
//if(b==true) {
//System.out.println("All check boxes for list items are  CHECKED ON");
//}
//if(!b) {
//	System.out.println("All check boxes are not selected");
//}
//
//System.out.println("print all items on list");
//
//for(int i=0;i<checkboxes.size();i++) {
//	System.out.println(checkboxes.get(i).getAttribute("text()"));
//}//check
//
//}
//
//public void clickSingleElementCheckbox() {
//	List<WebElement> checkboxes = ALL_TODO_List_ELEMENT;
//	System.out.println("Total no of checkboxes before deleting: "+checkboxes.size());
//	int checkb1=checkboxes.size();
//
//}

//input[name='todo[0]']
//input[name='todo[1]']
//input[name='todo[2]']

//input[name='todo[3]'] 

//boolean =driver.findElement(By.cssSelector(beforePath + i + afterPath)).isSelected();

//String beforePath = "input[name='todo[";
//String afterPath = "]']";
//
//
//
//for (int i = 0; i < 5; i++) {
//
//boolean result = driver.findElement(By.cssSelector("beforePath + i + afterPath]")).isSelected();
//
//if (result == true) {
//
//System.out.println("all checkboxes forList Items are checked" + result);
//}

//
//}
