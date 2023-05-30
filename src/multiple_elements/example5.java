package multiple_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'_2doB4z')]")).click();
		driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'QvtND5')]")).click();
		Thread.sleep(500);
		
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='_3BBnX4']//div[@class='_4921Z']"));
		
		for(WebElement s1:all)
		{
			s1.click();
		}
		
		Thread.sleep(1000);
		for(WebElement s2:all)
		{
			s2.click();
		}
		
		driver.close();
		
		
		
		
	}

}
