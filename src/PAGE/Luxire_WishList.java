package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class Luxire_WishList extends BasePage{
	
@FindBy(xpath="(//input[@title='Add to Cart'])[1]")
private WebElement AddCart;


public Luxire_WishList(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void addCart(WebDriver driver) throws Exception
{
	BasePage.ElementIsPresent(driver, AddCart);
	AddCart.click();
}
}
