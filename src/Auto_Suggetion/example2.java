package Auto_Suggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi note");
		
		Thread.sleep(2000);
		List<WebElement> suggetions = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
		String exptxt="redmi note 10";
		
		for(WebElement s1:suggetions)
		{
			String acttxt = s1.getText();
			if(acttxt.equals(exptxt))
			{
				s1.click();
				break;
			}
		}
		
	}
	

}
