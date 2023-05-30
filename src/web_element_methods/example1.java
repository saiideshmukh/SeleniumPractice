package web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

		WebElement UN = driver.findElement(By.xpath("//input[@type='text']"));

		//Sendkeys()
		UN.sendKeys("Saiprasad");
		
		Thread.sleep(1000);
		
		//clear()
		UN.clear();
		
		//getAttribute()
		UN.sendKeys("Deshmukh");
		String enter = UN.getAttribute("value");
		System.out.println("Saiprasad "+enter);
		
		//getText()
		String text=driver.findElement(By.xpath("//button[@name='login']")).getText();
		System.out.println(text);
		
//		System.out.println(driver.findElement(By.xpath("//button[@name='login']")).getText());
		
		//click
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(1000);
		WebElement rb = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		//rb.click();
		
		//isSelected
		boolean result = rb.isSelected();
		System.out.println(result);
		if(result)
		{
			System.out.println("Radio button is selected");
		}
		else
		{
			System.out.println("Radio button is not selected");
		}
		

		driver.quit();
		
	}

}
