package UtilityLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcelReader extends BaseClass {
	private static XSSFWorkbook workbook;

	public ExcelReader(String excelPath) throws Exception {
		workbook = new XSSFWorkbook(new FileInputStream(new File(excelPath)));
	}

	public static int getTotalRowCount(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getLastRowNum() + 1;
	}

	public static int getTotalColumnCount(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getRow(0).getLastCellNum();
	}

	public static Object getSheetTestData(int sheetIndex, int row, int cell) {
		XSSFCell cells = workbook.getSheetAt(sheetIndex).getRow(row).getCell(cell);

		if (cells.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
			return "";
		} else if (cells.getCellType() == XSSFCell.CELL_TYPE_STRING) {
			return cells.getStringCellValue();
		} else if (cells.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
			return cells.getRawValue();
		} else if (cells.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
			return cells.getBooleanCellValue();
		} else if (cells.getCellType() == XSSFCell.CELL_TYPE_FORMULA) {
			return cells.getCellFormula();
		} else {
			return null;
		}
	}

	// call this method in TestLayer Package
	public Object[][] getAllSheetTestData(int sheetIndex) {
		int rows = getTotalRowCount(sheetIndex);
		int cells = getTotalColumnCount(sheetIndex);
		Object[][] data = new Object[rows][cells];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				data[i][j] = getSheetTestData(sheetIndex, i, j);
			}
		}

		return data;

	}

}
