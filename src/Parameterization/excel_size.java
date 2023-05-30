package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_size 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\auto testing class\\Book1.xlsx");
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int numR = sheet.getLastRowNum()+1;	
		
		short numC = sheet.getRow(0).getLastCellNum();
		
		System.out.println(numR);
		System.out.println(numC);
		
	}

}
