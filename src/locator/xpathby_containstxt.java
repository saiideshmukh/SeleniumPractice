package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby_containstxt 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'new')]")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
