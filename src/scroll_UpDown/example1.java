package scroll_UpDown;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
//			scroll down
//			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
			Thread.sleep(2000);
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-100)");
			
			driver.quit();
		}
		

}
