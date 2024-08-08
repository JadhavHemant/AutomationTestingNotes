package UitlityLayer;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	static XSSFWorkbook workbook;
	static XSSFSheet sheets;

	public List<Map<String, String>> getAllSheetTestData(String excelSheetPath, String sheetName) {

		try {
			// read all file content
			FileInputStream fis = new FileInputStream(excelSheetPath);
			// load all excel sheet
			workbook = new XSSFWorkbook(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// focus on specific sheet
		XSSFSheet sheets = workbook.getSheet(sheetName);

		// capture total rows in sheet
		int rowCount = sheets.getLastRowNum();

		// create object of List<Map<String, String>.
		List<Map<String, String>> rowTestData = new ArrayList<Map<String, String>>();

		// iterate all rows
		for (int i = 1; i <= rowCount; i++) {

			// count columns
			int cellCount = sheets.getRow(0).getLastCellNum();

			// create object of LinkedHashMap<String, String>>
			LinkedHashMap<String, String> columnTestData = new LinkedHashMap<String, String>();

			// iterate columns value
			for (int j = 0; j < cellCount; j++) {
				// capture the column heading or headers value
				String columnHeading = sheets.getRow(0).getCell(j).getStringCellValue();

				// capture ghe column cell value
				String cellValue = sheets.getRow(i).getCell(j).getStringCellValue();

				// put all value inside the LinkedHashMap object
				columnTestData.put(columnHeading, cellValue);
			}

			// add value inside the List<Map<String, String> object
			rowTestData.add(columnTestData);
		}

		return rowTestData;
	}

}
