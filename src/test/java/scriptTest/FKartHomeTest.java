package scriptTest;

import org.testng.annotations.Test;

import basePackage.BaseClass;
import pageObject.FKartHome;
import pageObject.LoactorPage;

public class FKartHomeTest extends BaseClass {
	
	@Test(priority=2)
	public void searchBook()
	{
		String searchBook="Books";
		FKartHome fh = new FKartHome(driver);
		fh.Search(searchBook);
	}

}
