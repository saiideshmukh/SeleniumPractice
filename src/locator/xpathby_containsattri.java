package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby_containsattri 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(@data-testid,'registration')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'First')]")).sendKeys("abcd");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ahdk125");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[contains(@class,'_6j')]")).click();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.close();
		
	}

}
