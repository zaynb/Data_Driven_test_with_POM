package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcellReader;
import pages.AddingCartPage;
import pages.CheckOut;
import pages.ContineAfterConfirmOrder;
import pages.ContinueCheckOut;
import pages.HomePage;
import pages.PageBase;
import pages.ShoppingCart;
import pages.UserRegistrationPage;
import pages.YourStorePage;

public class UserRegistrationTestWithDDTAndExcel extends TestBase{

	PageBase pagebaseobj;
	HomePage homeobject;
	YourStorePage storobject;
	AddingCartPage addcartObject;
	ShoppingCart checkProductDetails ;
	CheckOut Checkoutobject;
	UserRegistrationPage userRegisterObj;
	ContinueCheckOut ContinueCheckOutobj;
	ContineAfterConfirmOrder ContineAfterConfirmOrderobj;

	@Test (priority=1)
	public void AssertTheProductValue() 
	{
		//	WebDriverWait wait = new WebDriverWait(driver,30);
		String productName = "Sony VAIO";
		String ModelName = "Product 19";
		String UnitPrice = "$1,202.00";
		String TotalPrice = "$2,404.00";


		homeobject = new HomePage (driver);
		//wait.until(ExpectedConditions.visibilityOf(homeobject.DesktopLnk));

		homeobject.ClickOnDesktopFromMenueBar();
		homeobject.ClickOnShowwAllDesktop();

		JavascriptExecutor Scrool = (JavascriptExecutor) driver;
		Scrool.executeScript("window.scrollBy(0,300)", "");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		storobject = new YourStorePage (driver);
		storobject.ClickOnSonyVAIO();

		addcartObject = new AddingCartPage (driver);
		addcartObject.clearQuantityField();
		addcartObject.AddingQuantity();
		addcartObject.ClickOnAddCartBtn();
		addcartObject.ClickOnShopingCartBtn();

		checkProductDetails = new ShoppingCart (driver);
		checkProductDetails.ClickviewCarttBtn();
		Assert.assertTrue(checkProductDetails.PdNameTobeAsserted.getText().contains(productName));
		Assert.assertTrue(checkProductDetails.ModelTobeAsserted.getText().contains(ModelName));
		Assert.assertEquals(checkProductDetails.QuantityTobeAsserted(), "2");
		Assert.assertTrue(checkProductDetails.UnitPriceTobeAsserted.getText().contains(UnitPrice));
		Assert.assertTrue(checkProductDetails.TotalPriceTobeAsserteds.getText().contains(TotalPrice));
		checkProductDetails.ClickOncheckoutBtn();
		Checkoutobject = new CheckOut(driver);
		Checkoutobject.ClickOnContinueBtn();

	}
		@DataProvider(name="ExcelData")
	public Object[][] userRegisterData() throws IOException
	{
		// get data from Excel Reader class 
		ExcellReader ER = new ExcellReader();
		return ER.getExcelData();
	}

	@Test (dependsOnMethods = { "AssertTheProductValue"} ,dataProvider="ExcelData")
	
	public void UserCanRegisterSuccessfully(String firstname , String lastname , String mail , String telephone,
			String address1,String city,String country, String region , String pass) 
	{ 
		
		userRegisterObj = new UserRegistrationPage(driver);
		userRegisterObj.userRegistration(firstname,lastname,mail,telephone,address1,city,country, region, pass);
		
		ContinueCheckOutobj = new ContinueCheckOut(driver);
		ContinueCheckOutobj.ContinueCheckOutAndConfirmOrder();
		
		ContineAfterConfirmOrderobj = new ContineAfterConfirmOrder(driver);
		ContineAfterConfirmOrderobj.clickoncontinuebutton();



	}}