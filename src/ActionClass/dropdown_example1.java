package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown_example1
{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			driver.get("https://www.amazon.in/");
			
			//Find drop down element 
			WebElement ac = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
			
			//create an object of actions class
			Actions act=new Actions(driver);
			
			//move mouse cursor on web-element
			act.moveToElement(ac).perform();
			
			Thread.sleep(1500);
			driver.findElement(By.xpath("//span[text()='Create a Wish List']")).click();
			
			Thread.sleep(2000);
			driver.close();
			
			
			
			
		}

}
