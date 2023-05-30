package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Set<String> ID = driver.getWindowHandles();
		ArrayList<String> a1=new ArrayList<String>(ID);
		driver.switchTo().window(a1.get(1));
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(500);
		
		driver.switchTo().window(a1.get(0));
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		Set<String> ID2 = driver.getWindowHandles();
		ArrayList<String> a2=new ArrayList<String>(ID2);
		driver.switchTo().window(a2.get(2));

		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
	}

}
