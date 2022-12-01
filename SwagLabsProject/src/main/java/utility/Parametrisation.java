package utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrisation {
	
	
	public static String GetSheetData(String Sheet , int row , int cell) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\SAICOM\\eclipse-workspace\\SwagLabsProject\\src\\test\\resources\\SwgLabData.xlsx");

	String value = WorkbookFactory.create(file).getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		
	return value;
	
	}

}
