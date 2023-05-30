package Handle_ListBox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assingnment 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		
		Thread.sleep(3000);
		
		WebElement list = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select S=new Select(list);
		List<WebElement> month = S.getOptions();
		
		TreeSet<String> TS=new TreeSet<String>();
		for(WebElement a1:month)
		{
			String S1=a1.getText();
			TS.add(S1);
		}
		for(String S2:TS)
		{
			System.out.println(S2);
		}
	
		driver.close();
		
		
	}

}
