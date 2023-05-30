package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby_txt2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12354");		
		Thread.sleep(3500);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();
		
		//xpath by text
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		Thread.sleep(2500);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
	}

}
