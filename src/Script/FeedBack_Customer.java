package Script;

import org.testng.annotations.Test;

import Generic.BasePage;
import Generic.BaseTest;
import Generic.Excel;
import PAGE.Account_Login;
import PAGE.ContactUS_Luxire;
import PAGE.Custom_made_Homepage;

public class FeedBack_Customer extends BaseTest {
	
@Test()
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
	BasePage.ScrollPage(driver,0,2300);
	c.contactUs();
	ContactUS_Luxire cu=new ContactUS_Luxire(driver);
	String N=Excel.getdata(EXCEL_FILE,"Sheet2",0,0);
	cu.name(N);
	String EI=Excel.getdata(EXCEL_FILE, "Sheet2",1,0);
	cu.emailId(EI);
	String PN=Excel.getdata(EXCEL_FILE,"Sheet2",2, 0);
	cu.phoneNo(PN);
	String ON=Excel.getdata(EXCEL_FILE, "Sheet2",3,0);
	cu.orderNO(ON);
	String MSG=Excel.getdata(EXCEL_FILE, "Sheet2", 4,0);
	cu.Message(MSG);
	cu.send();
	c.Luxire();
	c.Account1(driver);
	c.Logout(driver);
	String eResult=Excel.getdata(EXCEL_FILE, "Sheet1", 2,0);
	BasePage.VerifypageisDisplay(driver, eResult);
}
}
