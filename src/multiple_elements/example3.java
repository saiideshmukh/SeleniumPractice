package multiple_elements;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 
{
		public static void main(String[] args) throws EncryptedDocumentException, IOException  
		{
			WebDriver driver=new ChromeDriver();
			driver.get("file:///F:/auto%20testing%20class/multipleElements.html");
			List<WebElement> all = driver.findElements(By.xpath("//input[@type='text']"));

			FileInputStream file=new FileInputStream("F:\\autoTesting\\Book1.xlsx");
			Sheet S1 = WorkbookFactory.create(file).getSheet("Sheet1");
			int s2 = S1.getLastRowNum();
			System.out.println(s2);
			
			
			for(int i=0;i<=s2; i++)
			{
				String S = S1.getRow(i).getCell(0).getStringCellValue();
				System.out.println(S);
				all.get(i).sendKeys(S);
			}
			
		}

}
