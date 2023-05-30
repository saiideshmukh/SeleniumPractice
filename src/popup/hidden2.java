package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@class,'_2IX_2')]")).sendKeys("9404487267");
		driver.findElement(By.xpath("//button[contains(text(),'OTP')]")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'_2doB4z')]")).click();
		
		Thread.sleep(1000);
		driver.close();
		
	}

}
