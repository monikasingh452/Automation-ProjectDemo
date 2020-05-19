package scriptTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import basePackage.ExcelUtilities;
import pageObject.LoactorPage;

public class LoginPageTest extends BaseClass {
	@Test(priority=1)
	public void validLogin()
	{
		String filepath= "/home/ambrish/Lockdown_Tets/SeleniumPractice/TestDataSheet/testdata.xlsx";
		String username = ExcelUtilities.readData(filepath, "sheet1", 1, 1);
		//System.out.println(username);
		String password = ExcelUtilities.readData(filepath, "sheet1", 1, 2);
		//System.out.println(password);
		LoactorPage lp = new LoactorPage(driver);
		lp.login(username, password);
		
		//EnterTimeTrackPage ettp = new EnterTimeTrackPage(driver);
	//	ettp.verifyLogo();
	//	ettp.VrifyHomePageTitle();
		
		
	}
	
	/*@Test(priority=2)
	public void ivalidLogin()
	{
		String filepath= "/home/ambrish/Lockdown_Tets/SeleniumPractice/TestDataSheet/testdata.xlsx";
		String username = ExcelUtilities.readData(filepath, "sheet1", 2, 1);
		String password = ExcelUtilities.readData(filepath, "sheet1", 2, 2);
		LoactorPage lp = new LoactorPage(driver);
		lp.login(username, password);
		lp.verifyInvalidLoginMsg();
		
		
	}*/
}
