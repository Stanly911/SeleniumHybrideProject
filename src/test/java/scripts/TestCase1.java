package scripts;


import org.testng.annotations.Test;
import genericLib.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillRary;
import pomPages.SkillraryDemoApp;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1() 
	{
		SkillRary s=new SkillRary(driver);
		s.gearsButton();
		s.skillrarydemoapp();
		
		SkillraryDemoApp sd=new SkillraryDemoApp(driver);
		driverUtilities.switchingTabs(driver);
		driverUtilities.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		AddToCart a=new AddToCart(driver);
		driverUtilities.doubleClick(driver, a.getAdd());
		a.addtocart();
	}
}
