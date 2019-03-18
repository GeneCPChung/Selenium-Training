import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriver {

	// Identify Testcases column by scanning the entire first row
	// Once column is identified then scan entire testcase column to identify
	// purchase testcase
	// After you grab purchase testcase row = pull all the data of that row and feed
	// into test
	
	public ArrayList<String> getData(String testCaseName) throws IOException {

		// XSSFWorkbook has access to fileInputStream arguments
		
		ArrayList<String> arrayList = new ArrayList<String>();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\genec\\Desktop\\workspace\\Selenium-Training\\ExcelApache\\TestDataFile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("TestData")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				// Identify Testcases column by scanning the entire first row
				Iterator<Row> rows = sheet.iterator(); // Sheet is a collection of rows
				Row firstRow = rows.next();
				Iterator<Cell> cell = firstRow.cellIterator(); // Row is a collection of cells

				int k = 0;
				int column = 0;
				while (cell.hasNext()) {

					Cell value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						// desired column
						column = k;
					}
					k++;
				}
				System.out.println(column);
				
				// Once column is identified then scan entire testcase column to identify purchase testcase
				
				while (rows.hasNext()) {
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)){
						
						// After you grab purchase testcase row = pull all the data of that row and feed
						// into test
						Iterator<Cell> cv = r.cellIterator();
						while(cv.hasNext()) {
							arrayList.add(cv.next().getStringCellValue());
						}
					}
				
				}

			}
		}
		return arrayList;
	}

	public static void main(String[] args) throws IOException {

	}
	
}
