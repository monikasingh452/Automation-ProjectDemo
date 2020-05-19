package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseClass;
import basePackage.WaitStatementLib;

public class FKartHome{
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	private WebElement SearchSendKeys;
	
	//@FindBy(xpath="//button[@type='submit']")
	@FindBy(xpath="//button[@class='vh79eN']//*[local-name()='svg']//*"
			+ "[name()='g' and contains(@fill,'#2874F1')]//*[name()='path'][2]")
	
	private WebElement ClickSearch;
	
	public FKartHome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public  void Search(String searchBook)
	{
		WaitStatementLib.eWaitForVisible(20, SearchSendKeys);
		SearchSendKeys.sendKeys(searchBook);
		ClickSearch.click();
		
	}

}
