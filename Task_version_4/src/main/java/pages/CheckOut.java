package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOut extends PageBase{

	public CheckOut(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="button-account")
	WebElement ContinueBtn ;
	
	public void ClickOnContinueBtn() {
		ContinueBtn.click();
		
	}

}
