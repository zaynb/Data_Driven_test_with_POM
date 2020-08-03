package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddingCartPage extends PageBase {

	public AddingCartPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name="quantity")
	WebElement quantityTxtBox ;
	
	@FindBy(id="button-cart")
	WebElement AddCartBtn ;
	
	@FindBy(xpath="//*[@id='cart']/button")
	WebElement ShoppingCartBtn ;
	
	@FindBy(xpath="//*[@id='cart']/ul/li[2]/div/p/a[1]/strong")
	WebElement ViewCartBtn ;
	
	public void clearQuantityField() {
		quantityTxtBox.clear();
		
	}
	
	public void AddingQuantity() {
		quantityTxtBox.sendKeys("2");
		
	}
	
	public void ClickOnAddCartBtn() {
		AddCartBtn.click();
		
	}
	
	public void ClickOnShopingCartBtn() {
		ShoppingCartBtn.click();
		
	}
	
	public void ViewCartBtn() {
		ViewCartBtn.click();
		
	}


}
