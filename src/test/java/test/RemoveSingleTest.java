package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ListPage;
import page.SingleItemPage;
import util.BrowserFactory;

public class RemoveSingleTest {

	WebDriver driver;
//	Test Data
	
String data = "Tesla";

	@Test	
	
	public void ValidateSingleItemRemoved() {

		driver = BrowserFactory.init();
		
		SingleItemPage singlePage = PageFactory.initElements(driver, SingleItemPage.class);
		 
		singlePage.insertListItem(data);
		singlePage.verifyEnteredListItem();
		
//		BrowserFactory.tearDown();

		

	}
	
//	 Validate that a single list item could be removed using the remove button when a single checkbox is selected
	
	
	
	
}
