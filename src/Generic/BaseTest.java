package Generic;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest implements Iautoconst{
	  public WebDriver driver;
		
	  static
	  {
	    System.setProperty(GECKO_KEY,GECKO_VALUE);
	  }
	
	  @BeforeMethod
	  public void before(Method testmethod) throws Exception
	  {
		  String URL=PropertyFile.getProperties(PROPERTIES_FILE,"URL");
	  	driver=new FirefoxDriver();
	  	driver.get(URL);
	  	String sIW=PropertyFile.getProperties(Iautoconst.PROPERTIES_FILE,"ITO");
		long IW=Long.parseLong(sIW);
	  	driver.manage().timeouts().implicitlyWait(IW,TimeUnit.SECONDS);
	  	
	  }
	  
	  @AfterMethod
	  public void after(ITestResult r) throws Exception
	  {
		  String TestName=r.getName();
		  int i=r.getStatus();
		  if(i==2)
		  {
			  Getphoto.getphoto(driver,PHOTO_PATH,TestName);
		  }
		
	   driver.close();
	  
	  }

}
