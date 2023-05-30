package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class assingnment1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\auto testing class\\Book.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		int Rnum = sh.getLastRowNum();
		for(int i=0;i<=Rnum;i++)
		{
			int Cnum = sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=Cnum;j++)
			{
				Cell info = sh.getRow(i).getCell(j);
				CellType type = info.getCellType();	
			
				if(type==CellType.STRING)
				{
					String value = info.getStringCellValue();
					System.out.print(value+"  ");
				}
				else if(type==CellType.NUMERIC)
				{
					double value = info.getNumericCellValue();
					System.out.print(value+"  ");
				}
				else if(type==CellType.BOOLEAN)
				{
					boolean value = info.getBooleanCellValue();
					System.out.println(value+"  ");
				}
			
			}
		System.out.println();	
		}
		
		
	}

}
