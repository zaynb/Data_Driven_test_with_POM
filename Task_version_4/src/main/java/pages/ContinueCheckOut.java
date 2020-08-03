package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContinueCheckOut extends PageBase{

	public ContinueCheckOut(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="button-payment-address")
	public WebElement ContinueBillingDetails ;
	
	@FindBy(id="button-shipping-address")
	public WebElement ContinueDeliveryDetails ;
	
	@FindBy(id="button-shipping-method")
	public WebElement ContinueDeliveryMethods ;
	
	@FindBy(id="button-payment-method")
	public WebElement PaymentMethod ;
	
	@FindBy(name="agree")
	public WebElement AcceptTerms ;
	
	@FindBy(id="button-confirm")
	public WebElement ConfirmOrder ;
	
	public void ContinueCheckOutAndConfirmOrder() {
		
		ContinueBillingDetails.click();
		ContinueDeliveryDetails.click();
		/* ContinueDeliveryMethods.click();
		PaymentMethod.click();
		PaymentMethod.click();
		AcceptTerms.click();
		ConfirmOrder.click();*/
		
		/*clickButton(ContinueBillingDetails);
		clickButton(ContinueDeliveryDetails);
		clickButton(ContinueDeliveryMethods);
		clickButton(PaymentMethod);
		clickButton(AcceptTerms);
		clickButton(ConfirmOrder);	*/

	}
}
