package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class Luxire_GiftCards extends BasePage{

	
	@FindBy(name="add")
	private WebElement add_cart;
	 @FindBy(xpath="(//span[.='write a review'])[2]")
	 private WebElement Review;
	 @FindBy(xpath="//span[@data-score='4']")
	 private WebElement score;
	 @FindBy(name="review_title")
	 private WebElement Review_title;
	 @FindBy(name="review_content")
	 private WebElement review_content;
	 
	 @FindBy(xpath="//input[@value='Post']")
     private WebElement Post;
	 public Luxire_GiftCards(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void addGiftCart()
	{
		add_cart.click();
	}
	public void review(WebDriver driver) throws Exception
	{
		BasePage.ElementIsPresent(driver,Review);
		Review.click();
	}
	public void Score()
	{
		score.click();
	}
	public void reviewTitle(String review)
	{
		Review_title.sendKeys(review);
	}
	public void reviewContent(String Content)
	{
		review_content.sendKeys(Content);
	}
	public void post()
	{
		Post.click();
	}
	
}
