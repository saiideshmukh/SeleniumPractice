package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdown_example2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(@class,'_2doB4z')]")).click();
		
		WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
		
		Actions a1=new Actions(driver);
		
		a1.moveToElement(more).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Advertise']")).click();
		

		
		
		
		
	}

}
