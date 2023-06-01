package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class custmosizeListBox 
{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			
			//Identify list box
			WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
			WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
			
			//create an object of actions class
			Actions act=new Actions(driver);
			//perform click on list box
			act.click(month).perform();
			Thread.sleep(1000);
			
			//navigate options up by using "Arrow_Up" key
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(200);
			act.sendKeys(Keys.ARROW_UP).perform();
			
			//press enter key by using "ENTER" key
			act.sendKeys(Keys.ENTER).perform();
			
			Thread.sleep(2000);
			act.click(month	).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();

			act.click(year).perform();			
			Thread.sleep(1000);
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();
			
			Thread.sleep(2000);
			
			driver.close();
			
			
			
			
			
		}

}
