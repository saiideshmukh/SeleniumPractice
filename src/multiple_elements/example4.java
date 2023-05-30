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

public class example4 
{
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("file:///F:/autoTesting/detail.html");
			List<WebElement> inputs = driver.findElements(By.xpath("//input[@type='text']"));
			
			FileInputStream file=new FileInputStream("F:\\autoTesting\\Book1.xlsx");
			Sheet Sheet = WorkbookFactory.create(file).getSheet("Sheet2");
			int R = Sheet.getLastRowNum();
			for(int i=0;i<=R;i++)
			{
				String value = Sheet.getRow(i).getCell(0).getStringCellValue();
				
				inputs.get(i).sendKeys(value);
				System.out.println(value);
			}
			Thread.sleep(2000);
			int N = inputs.size();
			for(int i=0; i<=N-1;i++)
			{
				inputs.get(i).clear();
			}
			
			
			driver.quit();
		}

}
