package multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_checkbox 
{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("file:///F:/auto%20testing%20class/multipleElements.html");
			
			List<WebElement> allchk = driver.findElements(By.xpath("//input[@type='checkbox']"));
			
			for(WebElement s1:allchk)
			{
				s1.click();
				Thread.sleep(500);
			}
			
			for(int i=0;i<=allchk.size();i++)
			{
				allchk.get(i).click();
				Thread.sleep(500);
			}
			
			
			
		}

}
