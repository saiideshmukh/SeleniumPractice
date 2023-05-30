package webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		String title=driver.getTitle();
		System.out.println(title);

		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(4000);
		driver.close();
	}

}
