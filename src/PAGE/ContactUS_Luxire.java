package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUS_Luxire {
	@FindBy(id="ContactFormName")
	private WebElement Name;
	@FindBy(id="ContactFormEmail")
	private WebElement Email;
    @FindBy(id="ContactFormPhone")
    private WebElement Phone;
    @FindBy(id="ContactFormOrder")
    private WebElement OrderNo;
    @FindBy(id="ContactFormMessage")
    private WebElement Msg;
    @FindBy(xpath="//input[@value='Send']")
    private WebElement Send;
	public ContactUS_Luxire(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
   
	
	public void name(String name)
	{
		Name.sendKeys(name);
	}
	public void emailId(String email)
	{
		Email.clear();
		Email.sendKeys(email);
	}
	public void phoneNo(String Phno)
	{
		Phone.sendKeys(Phno);
	}
	public void orderNO(String No)
	{
		OrderNo.sendKeys(No);
	}
	public void Message(String msg)
	{
		Msg.sendKeys(msg);
	}
	public void send()
	{
		Send.click();
	}
	
}
