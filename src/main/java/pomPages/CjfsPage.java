package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CjfsPage 
{
	@FindBy(xpath="(//a[text()=' Core Java For Selenium Trainin'])")
	private WebElement cjfs;
	
	public CjfsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void cjfs()
	{
		cjfs.click();
	}
		
}
