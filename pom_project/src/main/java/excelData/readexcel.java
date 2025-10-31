package excelData;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readexcel {


	public static String[][] readdata() throws IOException
	{
		XSSFWorkbook wb=new XSSFWorkbook("./ExcelData/Book1.xlsx");
	    XSSFSheet	ws=wb.getSheetAt(0);
	    int rowcount=ws.getLastRowNum();
	    int colcount=ws.getRow(0).getLastCellNum();
	    System.out.println(rowcount);
	    System.out.println(colcount);
	    String[][] data=new String[rowcount][colcount];
	    for(int i=1;i<=rowcount;i++)
	    {
	    	for(int j=0; j<colcount; j++)
	    	{
	    	  String value=ws.getRow(i).getCell(j).getStringCellValue();
	    	  System.out.println(value);
	    	  data[i-1][j]=value;
	    	}
	    }
		return data;
	
	}
	}
