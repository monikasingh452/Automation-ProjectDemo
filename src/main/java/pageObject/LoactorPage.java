package pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import basePackage.WaitStatementLib;

public class LoactorPage {
	
	@FindBy(xpath="//a[contains(text(),'Login & Signup')]")
	private WebElement LoginLink;
	
	@FindBy(xpath="(//form/div/input[@type='text'])")
	private WebElement UnTxBx;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement PwdTxBx;
	
	@FindBy(xpath="(//button[@type='submit'])[last()]")
	private WebElement loginBtn;
	
	@FindBy(xpath="//span[contains(text(),'Your username or password is incorrect')]")
	private WebElement invalidLoginMsg;
	
	
	public LoactorPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public  void login(String username, String password)
	{
		
	 //// LoginLink.click();
	 // WaitStatementLib.eWaitForVisible(10, UnTxBx);
	  UnTxBx.sendKeys(username);	
	  PwdTxBx.sendKeys(password);
	  loginBtn.click();
	}
	
	public void verifyInvalidLoginMsg()
	{
		String expMsg= "Your username or password is incorrect";
		String actMsg= invalidLoginMsg.getText();
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log("Invalid Login msg is verified", true);
	}
	


}
