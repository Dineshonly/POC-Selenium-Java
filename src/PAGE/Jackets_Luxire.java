package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class Jackets_Luxire extends BasePage {
	
	@FindBy(xpath="(//a[@class='grid__image'])[1]")
	private WebElement click_img;
	
	@FindBy(xpath="(//div[@class='select__placeholder'])[1]")
	private WebElement Please_select_style;
	
	@FindBy(xpath="//img[@alt='Tuxedo single breasted']")
	private WebElement tuxedo_single;
	
	@FindBy(xpath="(//div[@class='style-select__item-add'])[2]")
    private WebElement select;
	 
	@FindBy(name="add")
	private WebElement add_cart;
	public Jackets_Luxire(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickImg()
	{
		click_img.click();
	}
	public void pleaseSelectStyle()
	{
		Please_select_style.click();
	}
	public void TuxedoSingleBreasted(WebDriver driver)
	{
		BasePage.moveToElement(driver,tuxedo_single);
	}
	
	public void Select()
	{
		select.click();
	}
	
	public void addToCart()
	{
		add_cart.click();
	}
	
	
	
	
	
	
	

}
