package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			driver.manage().window().maximize();
			
			WebElement btn = driver.findElement(By.xpath("//span[text()='right click me']"));
			Actions a2=new Actions(driver);
//			a2.moveToElement(btn).contextClick().perform();
			a2.contextClick(btn).perform();
			
			Thread.sleep(2000);			
			driver.findElement(By.xpath("//span[text()='Delete']")).click();
			
			Thread.sleep(2000);
			Alert alt = driver.switchTo().alert();
			alt.accept();
			
			driver.close();
			
			
			
			
			
		}

}
