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
	
	public void ValidateSingleItemIsRemoved() throws Throwable {

		driver = BrowserFactory.init();
		
		SingleItemPage singlePage = PageFactory.initElements(driver, SingleItemPage.class);
		
		singlePage.insertListItem(data);
		Thread.sleep(2000);
		singlePage.verifySingleItemIsSelected();
		Thread.sleep(2000);
		singlePage.removeSingleItem();
		Thread.sleep(2000);
		singlePage.verifySingleItemRemoved();
		
//		BrowserFactory.tearDown();

	}
	
}
