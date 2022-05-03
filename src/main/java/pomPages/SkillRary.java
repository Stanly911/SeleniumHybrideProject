package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRary 
{
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn; 
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	public WebElement searchtb;
	
	@FindBy(xpath="(//input[@type='submit'])")
	private WebElement srcbtn;
	
	public SkillRary(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getGearsbtn() 
	{
		return gearsbtn;
	}

	public WebElement getSkillrarydemoapp() 
	{
		return skillrarydemoapp;
	}

	public void  searchtb(String course) 
	{
		searchtb.sendKeys(course);
	}

		public void gearsButton() 
	{
		gearsbtn.click();
	}
	
	public void skillrarydemoapp()
	{
		skillrarydemoapp.click();
	}
	
	public void srcbtn()
	{
		srcbtn.click();
	}
}
