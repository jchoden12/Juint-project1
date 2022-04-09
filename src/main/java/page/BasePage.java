package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	
	public int generateRandomNumber(int boundary) {
		
		Random rand = new Random();
		
		int generateNumber = rand.nextInt(boundary);
		
		return generateNumber;
		
	}
	
	public void waitForElement(WebDriver driver, int waitTime, WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
				
		wait.until(ExpectedConditions.visibilityOf(element));
			
		
	}
	
	public void selectFromDropDown(WebElement element, String visibleText) {
		
		Select sel = new Select(element);
		
		sel.selectByVisibleText(visibleText);
		
		
	}
	
	
	
	
	

}
