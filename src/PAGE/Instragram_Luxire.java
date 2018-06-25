package PAGE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instragram_Luxire {
 
	 @FindBy(xpath="//button[.='Follow']")
     private WebElement Follow;	
	 
	 @FindBy(xpath="//input[@name='username']")
	 private WebElement UserName;
	 @FindBy(xpath="//input[@name='password']")
	 private WebElement Password;
	 
	 @FindBy(xpath="//button[.='Log in']")
	 private WebElement Login;
	 @FindBy(xpath="(//a[.='Profile'])")
	 private WebElement Profile;
	 
	 @FindBy(xpath="//button[.='Options']")
	 private WebElement options;
	  @FindBy(xpath="//button[.='Log Out']")
	  private WebElement Logout;
	 public Instragram_Luxire(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }
	
	public void follow()
	{
		Follow.click();
	}
	public void userNameTB(String UN)
	{
		UserName.sendKeys(UN);
	}
	public void passwordTB(String PW)
	{
		Password.sendKeys(PW);
	}
	public void LoginBN()
	{
		Login.click();
	}
	public void Profile()
	{
		Profile.click();
	}
	public void optionsBN()
	{
		options.click();
	}
	public void LogoutBN()
	{
		Logout.click();
	}
	public void navigateBack(WebDriver driver)
	{
		driver.navigate().to("https://luxire.com/");
	}
}