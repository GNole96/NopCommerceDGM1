package Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterisation {
	public static String Parameterization (String Sheet, int row , int cell) throws IOException {
		
		FileInputStream File = new FileInputStream ("C:\\Users\\SAICOM\\Desktop\\Book1.xlsx");
		
		String value = WorkbookFactory.create(File). getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		
		return value;
	}
	
	
	public static String  ExcelDataFetch (String Name , int A ,int B) throws EncryptedDocumentException, IOException {
		
		FileInputStream File = new FileInputStream ("C:\\Users\\SAICOM\\Desktop\\Book11.xlsx\\"+Name+".jegp");
		String value =WorkbookFactory.create(File).getSheet(Name).getRow(A).getCell(B).getStringCellValue();
	
		return value;
	} 
	
}





