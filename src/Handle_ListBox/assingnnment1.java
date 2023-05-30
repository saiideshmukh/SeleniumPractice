package Handle_ListBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assingnnment1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select S=new Select(month);
		
		List<WebElement> list = S.getOptions();
		
		ArrayList<String> AL=new ArrayList<String>();
		for(WebElement A:list)
		{
			String S1=A.getText();
			AL.add(S1);
		}
		
		Collections.sort(AL);
		System.out.println("-----------");
		for(String S2:AL)
		{
			System.out.println(S2);
		}
		
		driver.close();
		
	}

}
