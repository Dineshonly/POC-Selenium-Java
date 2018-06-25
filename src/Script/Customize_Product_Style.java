package Script;

import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import Generic.Excel;
import PAGE.Account_Login;
import PAGE.Custom_made_Homepage;
import PAGE.Polo_Luxie;
import PAGE.Your_Shoping_cart;

public class Customize_Product_Style extends BaseTest {

	@Test
	public void test() throws Exception
	{
		Custom_made_Homepage c=new Custom_made_Homepage(driver);
		c.ACCOUNT(driver);
		c.LoginBt();
		Account_Login a=new Account_Login(driver);
		String Un = Excel.getdata(EXCEL_FILE,"Sheet1",0,0);
		a.SetUserName(Un);
		String Pw = Excel.getdata(EXCEL_FILE,"Sheet1",1,0);
		a.SetPassword(Pw);
		a.Login_Button();
		c.Luxire();
		c.shirts(driver);
		c.polosknits(driver);
		BasePage.ScrollPage(driver, 0,300);
		Polo_Luxie p=new Polo_Luxie(driver);
		p.clickImg();
		p.pleaseSelectStyle();
		p.shortSleeve(driver);
		p.Select();
      	p.customizeStyle();
    	p.customize(driver);
    	p.button();
     	p.whiteCatButton();
	    p.save();
		p.saveProceedMes();
		p.addToCart();
		Your_Shoping_cart y=new Your_Shoping_cart(driver);
		y.RemoveCart();
		c.Luxire();
		c.Account1(driver);
		c.Logout(driver);
		String eResult=Excel.getdata(EXCEL_FILE, "Sheet1", 2,0);
		BasePage.VerifypageisDisplay(driver, eResult);
	}
}
