package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CjfsCCPage 
{
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(linkText="Add To Wishlist")
	private WebElement wishlist;
	
	public CjfsCCPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void playbtn()
	{
		playbtn.click();
	}
	
	public void pausebtn()
	{
		pausebtn.click();
	}
	
	public void wishlist()
	{
		wishlist.click();
	}
}
