package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class assingnment 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\auto testing class\\Book.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int R = sh.getLastRowNum();
		int C = sh.getRow(0).getLastCellNum()-1;
		for(int i=1;i<=R;i++)
		{
			for(int j=1;j<=C;j++)
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"  ");
			}
			System.out.println();	
		}
		
		
	}

}
