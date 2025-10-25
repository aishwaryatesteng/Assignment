package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {
 
	public static String[][] readdata(String filename) throws IOException
	{
		XSSFWorkbook wb=new XSSFWorkbook("./exceldata/"+filename+".xlsx");
		XSSFSheet ws=wb.getSheetAt(0);
		int rowcount=ws.getLastRowNum();
		int colcount=ws.getRow(0).getLastCellNum();
		String[][] data=new String[rowcount][colcount];
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
			   String alldata=ws.getRow(i).getCell(j).getStringCellValue();
			   data[i-1][j]=alldata;
			}
		}
		return data;
		
	}
}
