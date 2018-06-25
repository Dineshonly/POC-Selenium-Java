package Generic;

import java.io.File;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Getphoto {
	public static void getphoto(WebDriver driver,String Folder,String TestcaseName) throws Exception
	{
      try
	{
		Date d=new Date();
		String Date=d.toString().replace(':','_');
		String path=Folder+TestcaseName+Date+".png";
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
	}
     	catch (Exception e) 
      {
		System.out.println("photo file not found");
	  }
	}

}
