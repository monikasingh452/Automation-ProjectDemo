package basePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class BaseClass {
	
public static WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser", "baseUrl"})
	//@BeforeClass
	public void setUp(String browserName, String url)
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/home/ambrish/Lockdown_Tets/SeleniumPractice/drivers/chromedriver");
			driver= new ChromeDriver();
			Reporter.log("Chrome Launched", true);
		}
		else if(browserName.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver","/home/ambrish/Lockdown_Tets/SeleniumPractice/drivers/geckodriver");
			driver= new FirefoxDriver();
			Reporter.log("Firefox Launched", true);	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Reporter.log(url+ "url navigated", true);
		
	}
	@AfterMethod
	//@AfterTest
	//@AfterClass
	public void tearDown(ITestResult result)
	{
		String scriptName = result.getMethod().getMethodName();
		if (result.isSuccess())     //true---> script pass
		{
			Reporter.log(scriptName+ "script is passed :)", true);
		}
		else  //false----> script failed
		{
		   ScreenshotLib slib = new ScreenshotLib(driver);
		   slib.takescreenshot(scriptName);
		   Reporter.log("screenshot has been taken", true);
		}
		
		driver.close();
		Reporter.log("Browser closed", true);
		
		
	}


}
