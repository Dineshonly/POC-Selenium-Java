package Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import Generic.Excel;
import PAGE.Account_Login;
import PAGE.Custom_made_Homepage;
import PAGE.Instragram_Luxire;

public class Follow_luxire_Instragram extends BaseTest
{
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
			 Reporter.log("Pass:Element is displayed",true);
			 Reporter.log("Pass:Element is displayed",true);
			 Reporter.log("Pass:Element is displayed",true);
			  Reporter.log("Pass:Expected page is displayed",true);
			a.Login_Button();
			c.Luxire();
			c.instragram();
			Instragram_Luxire l=new Instragram_Luxire(driver);
			l.follow();
			l.userNameTB(Un);
			l.passwordTB(Pw);
			l.LoginBN();
		    l.Profile();
			l.optionsBN();
			l.LogoutBN();
			l.navigateBack(driver);
			c.Luxire();
			c.Account1(driver);
			c.Logout(driver);
			String eResult=Excel.getdata(EXCEL_FILE, "Sheet1", 2,0);
			BasePage.VerifypageisDisplay(driver, eResult);
	 }

}
