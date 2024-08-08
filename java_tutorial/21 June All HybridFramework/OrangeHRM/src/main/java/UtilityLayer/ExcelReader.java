package UtilityLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import BaseLayer.BaseClass;

public class ExcelReader extends BaseClass{

	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet ;
	public ExcelReader(String excelPath) throws IOException
	{
		
		workbook = new XSSFWorkbook(new FileInputStream(new File(excelPath)));
	}
	
	public int getTotalRowCount(int sheetIndex)
	{
		return workbook.getSheetAt(sheetIndex).getLastRowNum()+1;
	}
	
	public int getTotalColumnCount(int sheetIndex)
	{
		return workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
	}
	
	public Object getSheetTestData(int sheetIndex, int rows, int cells)
	{
		XSSFCell cell = workbook.getSheetAt(sheetIndex).getRow(rows).getCell(cells);
		if(cell.getCellType()== XSSFCell.CELL_TYPE_BLANK)
		{
			return "";
		}
		else if(cell.getCellType()== XSSFCell.CELL_TYPE_STRING)
		{
			return cell.getStringCellValue();
		}
		else if(cell.getCellType()== XSSFCell.CELL_TYPE_NUMERIC)
		{
			return cell.getRawValue();
		}
		else if(cell.getCellType()== XSSFCell.CELL_TYPE_BOOLEAN)
		{
			return cell.getBooleanCellValue();
		}
		else if(cell.getCellType()== XSSFCell.CELL_TYPE_FORMULA)
		{
			return cell.getCellFormula();
		}
		return null;
	}
	
	public Object[][] getAllSheetTestData(int sheetIndex)
	{
		int rows = getTotalRowCount(sheetIndex);
		int cells = getTotalColumnCount(sheetIndex);
		
		Object [][] data = new Object[rows][cells];
		
		for(int i=0 ;i<rows; i++)
		{
			for(int j=0; j<cells; j++)
			{
				data[i][j] = getSheetTestData(sheetIndex, i , j);
			}
		}
		return data;
	}	
}
