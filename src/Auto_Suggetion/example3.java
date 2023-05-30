package Auto_Suggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("samsung");
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		String exptxt="Samsung Galaxy";
		
		for(WebElement s1:all)
		{
			String txt = s1.getText();
			if(exptxt.equalsIgnoreCase(txt))
			{
				s1.click();
				break;
			}
		}
		
//		driver.close();


		
	}

}
