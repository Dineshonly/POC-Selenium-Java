package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getdata(String path,String s,int r,int c)
	{
		String v="";
		try {
			Workbook wb=WorkbookFactory.create(new FileInputStream(path));
			v=wb.getSheet(s).getRow(r).getCell(c).getStringCellValue();
		}
		catch (Exception e) {
		System.out.println("Excel file not found");
		}
		return v;
		
	
	}
}
