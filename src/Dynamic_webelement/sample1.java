package Dynamic_webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample1 
{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//button[contains(@class,'_2doB4z')]")).click();
			driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobiles");
			Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			
			//Identify dynamic web-element by  using relative or  obsolute xpath
			WebElement ele = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]"));
			String result = ele.getText();
			System.out.println(result);
			ele.click();
			
			driver.quit();
			
		}

}
