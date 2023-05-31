package multiple_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6 
{
	
	//Error msg has been shown in this program
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(@class,'_2doB4z')]")).click();
		driver.findElement(By.xpath("//input[contains(@title,'Search')]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='_2d0we9']//div[@class='_1Y4Vhm _4FO7b6']"));
		
		for(WebElement s1:all)
		{
			s1.click();
			Thread.sleep(500);
		}
		
		for(WebElement s2:all)
		{
			s2.click();
			
		}
		
	}

}
