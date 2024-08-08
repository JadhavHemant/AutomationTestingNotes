package UtilityLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	// check the file present or not using fileclass object

	public ExcelReader(String Execelpath) throws IOException {

		// check the file present or not using fileclass object

		File F = new File(Execelpath);

		FileInputStream fis = new FileInputStream(F);

		workbook = new XSSFWorkbook(fis);

	}

	public int getTotalRowCount(int sheetIndex)

	{
		sheet = workbook.getSheetAt(sheetIndex);

		int rows = sheet.getLastRowNum() + 1;

		return rows;

	}

	public int getTotalColumnCount(int sheetIndex) {
		sheet = workbook.getSheetAt(sheetIndex);

		int cells = sheet.getRow(sheetIndex).getLastCellNum();

		return cells;
	}

	public Object getSheetTestData(int sheetIndex, int rows, int cells) {

		sheet = workbook.getSheetAt(sheetIndex);

		XSSFCell cell = sheet.getRow(rows).getCell(cells);

		if (cell.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
			return "";

		}

		else if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {

			return cell.getStringCellValue();
		}

		else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {

			return cell.getRawValue();
		}

		else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {

			return cell.getBooleanCellValue();

		} else if (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA) {

			return cell.getCellFormula();
		}

		return null;
	}

	public Object[][] getAllSheetTestData(int SheetIndex) {

		int rows = getTotalRowCount(SheetIndex);

		int cell = getTotalColumnCount(SheetIndex);

		Object[][] data = new Object[rows][cell];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cell; j++)

			{
				data[i][j] = getSheetTestData(SheetIndex, i, j);
			}

		}
		return data;
	}

}
