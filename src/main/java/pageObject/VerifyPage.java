package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import basePackage.BaseClass;

public abstract class VerifyPage extends BaseClass{
	@FindBy(xpath="//img[@title='Flipkart']")

	 private WebElement logo;
	 
	 public VerifyPage(WebDriver driver)
	 {
		PageFactory.initElements(driver, this); 
	 }
	 
	 public void verifyLogo()
	 {
		 Assert.assertTrue(logo.isDisplayed());
		 Reporter.log("Home page is Displayed", true);
	 }

}
