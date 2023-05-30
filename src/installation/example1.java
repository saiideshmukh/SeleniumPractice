package installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.close();
		//driver.get("https://www.google.com/");
		
		// WebDriver driver=new ChromeDriver();
	}

}
