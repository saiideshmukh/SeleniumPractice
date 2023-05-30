package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_printentirecolm 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\auto testing class\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		//print all value present in column
		int Rnum = sh.getLastRowNum();
		for(int i=0; i<=Rnum;i++)
		{
			String cellvalue = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(cellvalue);
		}
		System.out.println("Index of row: "+Rnum);
		
		
		System.out.println("-------");
		//print all value present in row
		int Cnum = sh.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=Cnum;i++)
		{
			String rowvalue = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(rowvalue);
		}
		System.out.println("Index of col: "+Cnum);
	}

}
