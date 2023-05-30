package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.get("https://www.facebook.com/");
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		
	}

}
