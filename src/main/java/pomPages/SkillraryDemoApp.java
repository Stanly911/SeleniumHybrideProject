package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp 
{
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleiumtraining;
	
	@FindBy(name="addresstype")
	private WebElement addressdd;
		
	public SkillraryDemoApp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCoursetab() 
	{
		return coursetab;
	}
	
	public WebElement getAddressdd() 
	{
		return addressdd;
	}
	
	public void seleniumtrainingbtn()
	{
		seleiumtraining.click();
	}
}
