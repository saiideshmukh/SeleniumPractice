package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_withDDF 
{
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
		{
			FileInputStream file=new FileInputStream("F:\\autoTesting\\Book2.xlsx");
			Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.policybazaar.com/");
			
			
			//click on sign in button
			driver.findElement(By.xpath("//a[text()='Sign in']")).click();
			
			//Pass input to login
			Thread.sleep(2000);
			String mobno = sh.getRow(0).getCell(0).getStringCellValue();
			driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(mobno);
			driver.findElement(By.xpath("(//a[contains(@id,'with-pwd')])[2]")).click();
			Thread.sleep(1000);
			String pwd = sh.getRow(0).getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//a[@class='cl-btn sr-btn-primary']")).click();
			
			//action perform on drop down My Account
			Thread.sleep(1000);
			WebElement myac = driver.findElement(By.xpath("//div[text()='My Account']"));
			Actions act=new Actions(driver);
			act.moveToElement(myac).perform();
			//Click on My profile
			driver.findElement(By.xpath("//span[text()=' My profile '] ")).click();
			
			//Switch focus from main page to child window
			Set<String> all = driver.getWindowHandles();
			ArrayList<String> al=new ArrayList<String>(all);
			driver.switchTo().window(al.get(1));
			
			//get value from name field
			String acttxt = driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
			System.out.println(acttxt);
			String exptxt = sh.getRow(0).getCell(2).getStringCellValue();
			
			if(acttxt.equals(exptxt))
			{
				System.out.println("TC pass");
			}
			else
			{
				System.out.println("TC fail");
			}
			
			driver.quit();
					
			
		}

}
