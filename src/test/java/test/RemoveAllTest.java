package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveAllPage;
import util.BrowserFactory;

public class RemoveAllTest {
	
	WebDriver driver;
	
	@Test
	public void ValidateAllListItemIsRemovedUsingToggleAllbutton() {
		driver = BrowserFactory.init();
		
		RemoveAllPage removeAllPage = PageFactory.initElements(driver,RemoveAllPage.class);	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		removeAllPage.verifyToggleAllIsSelected();
		
		removeAllPage.removeAllListItems();
		removeAllPage.verifyAllListItemIsRemoved();
	}
		

}
