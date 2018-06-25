package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class Custom_made_Homepage extends BasePage {
	
	@FindBy(xpath="//a[.='Account']")
	private WebElement Account;

	@FindBy(xpath="//a[.='Login']")
	private WebElement Login;
    
	@FindBy(xpath="//img[@alt='Luxire Custom Clothing']")
	private WebElement lUXIRE;
	
	@FindBy(xpath="//a[.='Jackets']")
	private WebElement jackets;
	
	@FindBy(xpath="(//a[.='Jackets'])[2]")
	private WebElement jackets_sub;
	@FindBy(xpath="(//a[.='Pants'])[3]")
	private WebElement Pants;
	@FindBy(xpath="//a[.='Gift Cards']")
	private WebElement Gift_Cards;
	
	@FindBy(xpath="(//a[.='Account'])[2]")
	private WebElement Account1;
	@FindBy(xpath="(//a[@id='customer_logout_link'])[2]")
	private WebElement Logout;
	@FindBy(xpath="(//a[.='Jeans'])[1]")
	private WebElement Jeans;
	@FindBy(xpath="//a[.='Shirt']")
	private WebElement Shirt;
	@FindBy(xpath="//a[.='Polos & Knits']")
	private  WebElement Polos_knits;
	@FindBy(xpath="//a[.='Wishlist']")
	private WebElement WishList;
	
	
	@FindBy(xpath="//a[.='Contact Us']")
	private WebElement ContactUS;
	@FindBy(xpath="//a[.='Instagram']")
	private WebElement Instrgram;
	@FindBy(xpath="//span[.='USD']")
	private WebElement Usd_Country;
	@FindBy(xpath="//li[@data-value='EUR']")
	private WebElement Eur_country;
	 public Custom_made_Homepage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	 
   public void ACCOUNT(WebDriver driver) throws Exception
	{
	   BasePage.ElementIsPresent(driver,Account);
		BasePage.moveToElement(driver,Account);
	}
   public void LoginBt()
	 {
		 Login.click();
	 }
   public void Luxire()
   {
	   lUXIRE.click();
	 
   }
	public void Jackets(WebDriver driver)
	{
		jackets.click();
	}
	public void Jackets_sub()
	{
		jackets_sub.click();
	}
	public void Pants(WebDriver driver) throws Exception
	{
		BasePage.ElementIsPresent(driver, Pants);
		BasePage.moveToElement(driver, Pants);
	}
	public void shirts(WebDriver driver)
	{
		BasePage.moveToElement(driver,Shirt);
	}
	public void polosknits(WebDriver driver) throws Exception
	{
		BasePage.ElementIsPresent(driver,Polos_knits);
		Polos_knits.click();
	}
	public void WishList(WebDriver driver) throws Exception
	{
		BasePage.ElementIsPresent(driver, WishList);
		WishList.click();
	}
	public void jeans(WebDriver driver) throws Exception
	{
		BasePage.ElementIsPresent(driver, Jeans);
		Jeans.click();
	}
	
    public void GiftCart()
    {
    	Gift_Cards.click();
    }
    
    public void Account1(WebDriver driver) throws Exception
    {  BasePage.ElementIsPresent(driver,Account1);
       BasePage.moveToElement(driver, Account1);
    }
    
    public void Logout(WebDriver driver) throws Exception
    {   BasePage.ElementIsPresent(driver,Logout);
    	Logout.click();
    }
    public void contactUs()
    {
    	ContactUS.click();
    }
    public void instragram()
    {
    	Instrgram.click();
    }
    public void usdCountry()
    {
    	Usd_Country.click();
    }
    public void eurCountry()
    {
    	Eur_country.click();
    }
}

