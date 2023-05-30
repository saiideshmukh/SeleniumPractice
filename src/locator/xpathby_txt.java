package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby_txt 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc1234");
		Thread.sleep(3000);
		
		//xpath bytext
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		driver.quit();
		
		
		
	}

}
