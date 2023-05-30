package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_fileInputStream 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\auto testing class\\Book.xlsx");
		
		Workbook book1 = WorkbookFactory.create(file);		//diffClassname.methodname();
		Sheet sh = book1.getSheet("Sheet1");
		Row rw = sh.getRow(1);
		Cell cl = rw.getCell(2);
		String value = cl.getStringCellValue();
		System.out.println(value);
		
	}

}
