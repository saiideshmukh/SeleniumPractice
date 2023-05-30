package Auto_Suggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("redmi");
		Thread.sleep(1000);
		
		List<WebElement> opt = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		String expectedtxt="Redmi note 10";
		
		
		for(WebElement s1:opt)
		{
			String acttxt=s1.getText();
			if(acttxt.equalsIgnoreCase(expectedtxt))
			{
				s1.click();
				break;
			}
						
		}
		Thread.sleep(1000);
		
//		driver.close();
		
	}

}
