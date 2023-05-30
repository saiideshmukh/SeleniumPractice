package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert2_popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
//		driver.switchTo().alert().dismiss();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
//		alt.dismiss();
		Thread.sleep(1000);
		System.out.println(alt.getText());
		Thread.sleep(1000);
		alt.accept();
		
		driver.close();
		
		
	}

}
