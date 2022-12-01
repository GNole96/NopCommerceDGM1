package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	
	public static String EnterExcelData (String sheet , int row , int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream File = new FileInputStream("C:\\Users\\SAICOM\\eclipse-workspace\\Automation-Ecommerce\\src\\test\\resources\\Book1.xlsx");
		String value = WorkbookFactory.create(File).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
}
