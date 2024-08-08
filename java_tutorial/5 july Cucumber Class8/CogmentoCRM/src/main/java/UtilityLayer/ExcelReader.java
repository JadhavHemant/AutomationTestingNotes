package UtilityLayer;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcelReader extends BaseClass {
	protected static FileInputStream fis;
	protected static XSSFWorkbook workbook;
	protected static XSSFSheet sheet;
	public List<Map<String,String>> getAllsheetData (String ExcelPath,String SheetName)
	{
		 try {
			fis = new FileInputStream(ExcelPath);
			 workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 sheet = workbook.getSheet(SheetName);
	      int rowCount = sheet.getLastRowNum();
	      System.out.println(rowCount);
	      
	      List<Map<String,String>> RowTestData = new ArrayList<Map<String,String>>();
	      
	     for(int i=1; i<=rowCount;i++)
	     {
	    	 int cellCount = sheet.getRow(0).getLastCellNum();
	    	 System.out.println(cellCount);
	    	 LinkedHashMap<String,String> ColumnTestData = new LinkedHashMap<String,String>();
	    	 
	    	 for(int j=0;j<cellCount;j++ )
	    	 {
	    		 
	    		 String columnHeading = sheet.getRow(0).getCell(j).getStringCellValue();
	    		 String cellvalue = sheet.getRow(i).getCell(j).getStringCellValue();
	    		 ColumnTestData.put(columnHeading,cellvalue);
	    		 
	     }
	    	 RowTestData.add(ColumnTestData);
	      
	     }
	     return RowTestData;
	     
	}
}
