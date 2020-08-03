package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourStorePage extends PageBase{

	public YourStorePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(linkText="Sony VAIO")
	WebElement SonyVAIOLnk ; 
	
	public void ClickOnSonyVAIO() {
		SonyVAIOLnk.click();
		
	}
}
