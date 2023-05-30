package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_example1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\auto testing class\\Book.xlsx");
		
		Sheet book = WorkbookFactory.create(file).getSheet("Sheet2");
		
		//get string value from excel sheet
		String value = book.getRow(1).getCell(2).getStringCellValue();
		
		//get int value from excel sheet
		long value1 = (long) book.getRow(4).getCell(2).getNumericCellValue();
		double value6 = book.getRow(4).getCell(2).getNumericCellValue();
		
		//get boolean value from excel sheet
		boolean value2 = book.getRow(5).getCell(3).getBooleanCellValue();
		
		
		String value3 = book.getRow(6).getCell(4).getStringCellValue();
		String value4 = book.getRow(7).getCell(5).getStringCellValue();
		String value5 = book.getRow(8).getCell(6).getStringCellValue();
		
		
		System.out.println(value);
		System.out.println(value1);
		System.out.println(value6);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		
	}

}
