package web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3
{
	public static void main(String[] args) throws InterruptedException {
		
		//isEnabled()
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Saiprasad");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sdjfnl1253");
		
		Thread.sleep(4000);
		
		System.out.println(driver.findElement(By.xpath("//button[@type='submit']")).isEnabled());

		driver.quit();
	}

}
