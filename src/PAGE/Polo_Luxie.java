package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class Polo_Luxie extends BasePage{
	@FindBy(xpath="(//a[@class='grid__image'])[2]")
	private WebElement Click_Img;
	@FindBy(xpath="(//div[@class='select__placeholder'])[1]")
	private WebElement Please_select_style;
	
	@FindBy(xpath="//img[@alt='Short Sleeve Business Shirt']")
	private WebElement Short_Sleeve;
	
	@FindBy(xpath="(//div[@class='style-select__item-add'])[2]")
    private WebElement select;
	 @FindBy(xpath="(//div[.='Customize style'])[2]")
	 private WebElement Customise_Style;
	 
	 @FindBy(xpath="(//div[.='Customize'])[3]")
	 private WebElement customise;
	 @FindBy(xpath="(//div[@class='component__image'])[4]")
	 private WebElement Button;
	 @FindBy(xpath="(//div[@class='component__image'])[5]")
	 private WebElement WhiteCatButton;
	 @FindBy(xpath="//div[.='save']")
	 private WebElement Save;
	 @FindBy(xpath="//div[.='Save & proceed to measurements']")
	 private WebElement save_P_Meas;
	@FindBy(name="add")
	private WebElement add_cart;
	
	
	@FindBy(xpath="//span[.='Customize Fit']")
	private WebElement CustomiseFIt;
	@FindBy(xpath="//div[.='Measure your shirt']")
	private WebElement Measureshirt;
	@FindBy(xpath="//div[.='Save this shirt size']")
	 private WebElement SaveShirtSize;
	@FindBy(xpath="//div[@class='close']")
	private WebElement close;
	
	public Polo_Luxie(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickImg()
	{
		Click_Img.click();
	}

	public void pleaseSelectStyle()
	{
		Please_select_style.click();
	}
	public void shortSleeve(WebDriver driver)
	{
		BasePage.moveToElement(driver,Short_Sleeve);
	}
	
	public void Select()
	{
		select.click();
	}
	public void customizeStyle()
	{
		Customise_Style.click();
	}
	public void customize(WebDriver driver) throws Exception
	{
		BasePage.ElementIsPresent(driver,customise);
		customise.click();
	}
	public void button()
	{
		Button.click();
	}
	public void whiteCatButton()
	{
		WhiteCatButton.click();
	}
	public void save()
	{
		Save.click();
	}
	public void saveProceedMes()
	{
		save_P_Meas.click();
	}
	public void CustomiseFit()
	{
		CustomiseFIt.click();
	}
	public void measureYourSize()
	{
		Measureshirt.click();
	}
	public void SaveYourShirtSize()
	{
		SaveShirtSize.click();
	}
	
	public void Close(WebDriver driver) throws Exception
	{
		BasePage.ElementIsPresent(driver, close);
		close.click();
	}
	public void addToCart()
	{
		add_cart.click();
	}
}
