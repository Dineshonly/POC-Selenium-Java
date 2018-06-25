package Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile implements Iautoconst{
  public static String getProperties(String path,String Key) throws Exception
  {
	  String v="";
     try
       {
	     Properties p=new Properties();
         p.load(new FileInputStream(path));
         v= p.getProperty(Key);
        }
     catch (Exception e) 
        {
	      System.out.println("Property file not found");
        }
	return v;
   }  
 
}

