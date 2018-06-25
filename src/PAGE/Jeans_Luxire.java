package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class Jeans_Luxire extends BasePage{
	@FindBy(xpath="(//a[@class='grid__image'])[4]")
	private WebElement Click_Img;
	 @FindBy(xpath="//input[@title='Add to Wishlist']")
	 private WebElement addWishList;
	public Jeans_Luxire(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
  
	public void clickImg()
	{
		Click_Img.click();
	}
	public void addWishList(WebDriver driver) throws Exception
	{
		BasePage.ElementIsPresent(driver,addWishList);
		addWishList.click();
	}
	
}
