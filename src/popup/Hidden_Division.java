package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@class,'_2IX_2')]")).sendKeys("9820404248");
		
		
		driver.findElement(By.xpath("(//button[contains(@class,'_2KpZ6l')])[2]")).click();
		
	
		driver.findElement(By.xpath("(//button[contains(@class,'_2KpZ6l')])[1]")).click();
		
		
//		Thread.sleep(2000);
//		driver.close();
		
	}

}
