package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Generic.BasePage;

public class Your_Shoping_cart extends BasePage {
	@FindBy(xpath="//small[.='Remove']")
	private WebElement remove;
	
	public Your_Shoping_cart(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void RemoveCart()
	{
		remove.click();	
	}
	
}
