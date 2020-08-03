package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UserRegistrationPage extends PageBase  {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id="input-payment-firstname")
	WebElement fnTxtBox ; 

	@FindBy(id="input-payment-lastname")
	WebElement lnTxtBox; 

	@FindBy(id="input-payment-email")
	WebElement emailTxtBox ; 

	@FindBy(id="input-payment-telephone")
	WebElement TelephoneTxtBox ; 

	@FindBy(id="input-payment-address-1")
	WebElement address1TxtBox ;

	@FindBy(id="input-payment-city")
	WebElement cityTxtBox ;


	@FindBy(id="input-payment-country")
	WebElement CountryDDL ;
	Select oSelectCountry = new Select(CountryDDL);

	@FindBy(id="input-payment-zone")
	WebElement RegionDDL ;
	Select oSelectRegion = new Select(RegionDDL);


	@FindBy(id="input-payment-password")
	WebElement passwordTxtBox ; 

	@FindBy(id="input-payment-confirm")
	WebElement confirmPasswordTxtBox ; 
	
	@FindBy(name="agree")
	WebElement PrivacyPilicycheckBox ; 


	
	@FindBy(id="button-register")
	WebElement ContinueregisterBtn ; 



	public void userRegistration(String firstName , String lastName , String email , String Telephone,
			String Address1,String City,String Country, String Region , String password) 
	{
		//fnTxtBox.click();
		clickButton(fnTxtBox);
		fnTxtBox.sendKeys(firstName);

		//lnTxtBox.click();
		clickButton(lnTxtBox);
		lnTxtBox.sendKeys(lastName);

		//emailTxtBox.click();
		clickButton(emailTxtBox);
		emailTxtBox.sendKeys(email);


		TelephoneTxtBox.click();
		TelephoneTxtBox.sendKeys(Telephone);

		address1TxtBox.click();
		address1TxtBox.sendKeys(Address1);

		cityTxtBox.click();
		cityTxtBox.sendKeys(City);

		CountryDDL.click();
		CountryDDL.sendKeys(Country);

        
		RegionDDL.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RegionDDL.sendKeys(Region);

		passwordTxtBox.click();
		passwordTxtBox.sendKeys(password);
		
		clickButton(PrivacyPilicycheckBox);


		confirmPasswordTxtBox.click();
		confirmPasswordTxtBox.sendKeys(password);

		ContinueregisterBtn.click();


	}

}
