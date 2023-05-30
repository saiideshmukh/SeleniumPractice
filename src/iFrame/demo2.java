package iFrame;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		//implicit wait in  selenium
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Date')]")).click();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
