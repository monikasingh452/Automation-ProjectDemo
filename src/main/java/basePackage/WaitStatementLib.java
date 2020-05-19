package basePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatementLib extends BaseClass {
	//public static WebDriver driver;
	public static WebDriverWait wait;
	 
	/******************Constructor*******************/	 
		/* public WaitStatementLib(WebDriver driver)
		 {
			 this.driver= driver;
		 }*/
		 
	/********************HardCodeWait***************/
		 public void iSleep(int secs)
		 {
			 try {
				Thread.sleep(secs*1000);
			} 
			 catch (InterruptedException e) {
		
				e.printStackTrace();
			}
		 }
		 
	/*******************************Implicit Wait*************/
		 public void iWaitForSecs(int secs)
		 {
			 driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS); 
		 }
		 
	/*******************Explicit Wait******************/
		 public static void eWaitForVisible(int secs, WebElement ele)
		 {
			wait = new WebDriverWait(driver, secs);
			 wait.until(ExpectedConditions.visibilityOf(ele));
			 //wait.until(ExpectedConditions.elementToBeClickable(ele));
		 }
		 
	/***************ExplicitWait Refresh************/
		 public void eefreshWait(int secs, WebElement ele)
		 {
			 WebDriverWait wait = new WebDriverWait(driver, secs);
			 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(ele)));
			 
		 }
		 
		 
		 

}
