package WebTable;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class example1 
{
		public static void main(String[] args) 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
			
			//Find no. of row present in  web-table
			int noR = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
//			List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
//			int noR = Rows.size();
			System.out.println(noR);
			
			//Find no. of column present in 1st Row (Header)
			int R1col = driver.findElements(By.xpath("(//table[@id='customers']//tr)[1]/th")).size();
			System.out.println(R1col);
			
			//Find no. of column present in 2nd Row 
			int R2col = driver.findElements(By.xpath("(//table[@id='customers']//tr)[2]/td")).size();
			System.out.println(R2col);
			
			//Get data from table
			 WebElement data = driver.findElement(By.xpath("(//table[@id='customers']//tr)[1]/th[1]"));
			 String d1 = data.getText();
			 System.out.println(d1);
			 
			 for(int i=1; i<=R1col; i++)
			 {
				 WebElement data1 = driver.findElement(By.xpath("(//table[@id='customers']//tr)[1]/th["+i+"]"));
				 String d2 = data1.getText();
				 System.out.print(d2+"  ");
			 }
			 
			 System.out.println();
			 
			 for(int j=2; j<=7; j++)
			 {
				 for(int k=1; k<=3; k++)
				 {
					 WebElement data2 = driver.findElement(By.xpath("(//table[@id='customers']//tr)["+j+"]/td["+k+"]"));
					 String d3 = data2.getText();
					 System.out.print(d3+"  "); 
				 }
				 System.out.println();
			 }
		
			
		}
}
