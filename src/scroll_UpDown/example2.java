package scroll_UpDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 
{
//	Scroll Up-Down by using web-element
	
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[contains(@class,'_2doB4z')]")).click();
			Thread.sleep(1000);
			
			WebElement ele = driver.findElement(By.xpath("//a[text()='Terms Of Use']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
			
			WebElement ele2 = driver.findElement(By.xpath("(//a[text()='VIEW ALL'])[3]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele2);
			
			
			
			
		}

}
