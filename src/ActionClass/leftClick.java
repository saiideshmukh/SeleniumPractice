package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class leftClick 
{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
//			driver.findElement(By.xpath("//button[contains(@class,'_2doB4z')]")).click();
			
			
			WebElement cart = driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
			
			Actions act=new Actions(driver);
//			act.click(cart).perform();
			act.doubleClick(cart).perform();
			
			Thread.sleep(2000);
			
			driver.close();
			
			
			
		}

}
