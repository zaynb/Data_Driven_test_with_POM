package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContineAfterConfirmOrder extends PageBase{
	
	public ContineAfterConfirmOrder(WebDriver driver) {
		super(driver);

}
	@FindBy(linkText="Continue")
	public WebElement Continuebtn ; 



public void clickoncontinuebutton() {
	
	clickButton(Continuebtn);
}

}


