package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//*[@id='menu']/div[2]/ul/li[1]/a")
	public WebElement DesktopLnk ; 
	
	@FindBy(linkText="Show All Desktops")
	public WebElement ShowAllDesktopLnk ; 
	
 public void ClickOnDesktopFromMenueBar ()
 {
	 DesktopLnk.click();
 }
 public void ClickOnShowwAllDesktop ()
 {
	 ShowAllDesktopLnk.click();
 }
 
}
