package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContinueCheckOut extends PageBase{

	public ContinueCheckOut(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath="//*[@id=\'button-shipping-address\']")
	public WebElement ContinueDeliveryDetails ;
	
	@FindBy(id="button-shipping-method")
	public WebElement ContinueDeliveryMethods ;
	
	@FindBy(name="agree")
	public WebElement AcceptTerms ;

	
	@FindBy(id="button-payment-method")
	public WebElement PaymentMethod ;
	
	
	@FindBy(xpath="//*[@id='button-confirm']")
	public WebElement ConfirmOrder ;
	
	public void ContinueCheckOutAndConfirmOrder() {
		
		
		ContinueDeliveryDetails.click();
		ContinueDeliveryMethods.click();
		AcceptTerms.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PaymentMethod.click();
		
		ConfirmOrder.click();
		
		/*clickButton(ContinueBillingDetails);
		clickButton(ContinueDeliveryDetails);
		clickButton(ContinueDeliveryMethods);
		clickButton(PaymentMethod);
		clickButton(AcceptTerms);
		clickButton(ConfirmOrder);	*/

	}
}
