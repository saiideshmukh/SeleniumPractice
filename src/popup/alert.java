package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(500);
		
		Alert alt = driver.switchTo().alert();		//switch selenium focus from main tab to alert pop-up
		
		String txt = alt.getText();		//get text on alert pop-up
		System.out.println(txt);
		
		alt.accept();		//click on OK button on alert pop-up
		
//		alt.dismiss();		//click cancel button on alert pop-up
		
		Thread.sleep(2000);
		String txt2 = alt.getText();
		System.out.println(txt2);
		alt.accept();
		
		driver.close();
		
		
	}
	

}
