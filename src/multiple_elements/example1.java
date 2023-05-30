package multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		List<WebElement> allelements = driver.findElements(By.xpath("//a"));
		
		for(WebElement s1:allelements)
		{
			System.out.println(s1.getText());
//			System.out.println(s1);			//link address
		}
		driver.quit();
	}

}
