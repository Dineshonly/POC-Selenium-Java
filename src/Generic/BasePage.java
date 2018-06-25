package Generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	
public static void  VerifypageisDisplay(WebDriver driver,String eResult) throws Exception
{
	String sEW=PropertyFile.getProperties(Iautoconst.PROPERTIES_FILE,"ETO");
	long EW=Long.parseLong(sEW);
	WebDriverWait wait=new WebDriverWait(driver,EW);
   try {
   wait.until(ExpectedConditions.titleContains(eResult));
   Reporter.log("Pass:Expected page is displayed",true);
   }
   catch(Exception e)
   {
	Reporter.log("Fail:Expected page is not displayed",true);
	Assert.fail();
   }
}
public static void VerifyTitle(String  expected,WebDriver driver)
{
	String actual=driver.getTitle();
	Assert.assertEquals(actual, expected);	
}



public static void  ElementIsPresent(WebDriver driver,WebElement element) throws Exception
{
	String sEW=PropertyFile.getProperties(Iautoconst.PROPERTIES_FILE,"ETO");
	long EW=Long.parseLong(sEW);
	WebDriverWait wait=new WebDriverWait(driver,EW);
	   try {
	   wait.until(ExpectedConditions.visibilityOf(element));
	   Reporter.log("Pass:Element is displayed",true);
	   }
	   catch(Exception e)
	   {
		Reporter.log("Fail:Element is not displayed,TimeOut",true);
		Assert.fail();
	   }

}
public static void ScrollPage(WebDriver driver,int x_axis,int y_axis)
{
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy("+x_axis+","+y_axis+")");
}
public static void moveToElement(WebDriver driver,WebElement target)
{
	Actions a=new Actions(driver);
	a.moveToElement(target).perform();
	
}


}
