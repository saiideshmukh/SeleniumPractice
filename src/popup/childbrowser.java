package popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class childbrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();

		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	//selenium implicit wait
		
		
		Set<String> windowID = driver.getWindowHandles();
		ArrayList<String> a1=new ArrayList<String>(windowID);
		
		driver.switchTo().window(a1.get(1)); 	//switch selenium focus from main window to new page
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		Thread.sleep(1000);
		driver.switchTo().window(a1.get(0));		//focus switch to main page
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		Set<String> ID2 = driver.getWindowHandles();
		ArrayList<String> a2=new ArrayList<String>(ID2);
		
		driver.switchTo().window(a2.get(2));		//switch focus to new window
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		Thread.sleep(1000);
		
//		driver.close();		//close current window
		
		driver.quit();		//close complete browser
		
	}

}
