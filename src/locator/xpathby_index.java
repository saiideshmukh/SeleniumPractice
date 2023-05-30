package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby_index 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("asdf");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("kds153");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("6521846252");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("akdc515");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).clear();
		Thread.sleep(1500);
		
		driver.close();
	}

}
