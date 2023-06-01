package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handle_dropdown 
{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[contains(@class,'_2doB4z')]")).click();
			
			//Step1 identify webelement
			WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
			
			//Step2 create an object of action class
			Actions act=new Actions(driver);
			
			//Step3 call method moveToElement()
			act.moveToElement(login).perform();
			
			Thread.sleep(1500);
			//click on dropdown element wishlist
			driver.findElement(By.xpath("//div[text()='Wishlist']")).click();		//element doesn't work properly
			
			
			
			
			
			
		}

}
