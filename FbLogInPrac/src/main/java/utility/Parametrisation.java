package utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Parametrisation {
	
	public static String ParametrisationClass(String Sheet,int row , int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream File = new FileInputStream("C:\\Users\\SAICOM\\eclipse-workspace\\FbLogInPrac\\src\\test\\resources\\Book1.xlsx");
		String value = WorkbookFactory.create(File).getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	
	

}
