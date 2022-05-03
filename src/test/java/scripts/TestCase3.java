package scripts;

import java.io.IOException;
import org.testng.annotations.Test;
import genericLib.BaseClass;
import pomPages.CjfsCCPage;
import pomPages.CjfsPage;
import pomPages.SkillRary;

public class TestCase3 extends BaseClass
{
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillRary s=new SkillRary(driver);
		s.searchtb(pdata.getPropertyfiledata("course"));
		s.srcbtn();
		
		CjfsPage c = new CjfsPage(driver);
		c.cjfs();
		
		driverUtilities.switchFrames(driver);
		
		CjfsCCPage cc = new CjfsCCPage(driver);
		Thread.sleep(3500);
		cc.playbtn();
		//Thread.sleep(1500);
		cc.pausebtn();
		
		driverUtilities.switchBackframe(driver);
		//Thread.sleep(1500);
		cc.wishlist();
		
		//Assert.assertEquals(driver.getTitle(),"36drr5tytyr6123")
	}
}
