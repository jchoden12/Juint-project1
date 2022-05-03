package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ListPage;
import util.BrowserFactory;

public class ToggleAllTest {

	WebDriver driver;
	ListPage listPage;

//	Test Data

	String data = "JC";

	@Test
	public void ValidateToggleAll() {

		driver = BrowserFactory.init();

		listPage = PageFactory.initElements(driver, ListPage.class);

		listPage.ValidateALLCheckBoxesAreChecked();

		
	}



}
