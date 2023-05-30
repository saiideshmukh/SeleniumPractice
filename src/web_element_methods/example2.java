package web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//isDisplyed
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		boolean result=logo.isDisplayed();
		System.out.println(result);
		
		
		
	
		
		
		
	}

}
