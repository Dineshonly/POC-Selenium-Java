package Script;

import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import Generic.Excel;
import PAGE.Account_Login;
import PAGE.Custom_made_Homepage;
import PAGE.Jeans_Luxire;
import PAGE.Luxire_WishList;
import PAGE.Your_Shoping_cart;

public class Product_WishList_Cart  extends BaseTest {
	
	@Test
	public void Test() throws Exception
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
		c.Pants(driver);
		c.jeans(driver);
		Jeans_Luxire j=new Jeans_Luxire(driver);
		BasePage.ScrollPage(driver,0,300);
		j.clickImg();
		j.addWishList(driver);
		c.Luxire();
		c.Account1(driver);
		c.WishList(driver);
		Luxire_WishList l=new Luxire_WishList(driver);
		l.addCart(driver);
		Your_Shoping_cart y=new Your_Shoping_cart(driver);
		y.RemoveCart();
		c.Luxire();
		c.Account1(driver);
		c.Logout(driver);
		String eResult=Excel.getdata(EXCEL_FILE, "Sheet1", 2,0);
		BasePage.VerifypageisDisplay(driver, eResult);
	}

}
