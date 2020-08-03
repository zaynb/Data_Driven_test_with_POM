package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends PageBase{

	public ShoppingCart(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id='content']/form/div/table/tbody/tr/td[2]")
	public WebElement PdNameTobeAsserted ;

	@FindBy(xpath="//*[@id='content']/form/div/table/tbody/tr/td[3]")
	public WebElement ModelTobeAsserted ;


	@FindBy(xpath="//input[@type='text']")
	List<WebElement> QuantityTobeAsserted ;

	@FindBy(xpath="//*[@id='content']/form/div/table/tbody/tr/td[5]")
	public WebElement UnitPriceTobeAsserted ;

	@FindBy(xpath="//*[@id='content']/form/div/table/tbody/tr/td[6]")
	public WebElement TotalPriceTobeAsserteds ;

	@FindBy(xpath="//*[@id='cart']/ul/li[2]/div/p/a[1]/strong")
	public WebElement ViewCartButton ;

	@FindBy(linkText="Checkout")
	public WebElement checkoutBtn ;

	public void ClickviewCarttBtn() {
		// ViewCartButton.click();
		clickButton(ViewCartButton);

	}

	public void ClickOncheckoutBtn() {
		//checkoutBtn.click();
		clickButton(checkoutBtn);

	}
	public String QuantityTobeAsserted() {


		return QuantityTobeAsserted.get(1).getAttribute("value");

	}


}
