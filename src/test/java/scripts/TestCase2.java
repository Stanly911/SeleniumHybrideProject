package scripts;

import java.io.IOException;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;
import genericLib.BaseClass;
import pomPages.SkillRary;
import pomPages.SkillraryDemoApp;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc2() throws IOException
	{
		SkillRary s=new SkillRary(driver);
		s.gearsButton();
		s.skillrarydemoapp();
		
		SkillraryDemoApp sd=new SkillraryDemoApp(driver);
		driverUtilities.switchingTabs(driver);
		driverUtilities.dropDown(sd.getAddressdd(), pdata.getPropertyfiledata("dropdowndata"));
		
		TestingPage t = new TestingPage(driver);
		driverUtilities.switchingTabs(driver);
		driverUtilities.dragandDrop(driver, t.getSeleniumtraining(), t.getCart());
		Point loc = t.getCart().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverUtilities.scrollBar(driver, x, y);
	}
}
