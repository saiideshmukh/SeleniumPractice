package Handle_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(4000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select S=new Select(month);
//		S.selectByIndex(5);		//Select by Index
//		S.selectByVisibleText("Jun");		//Select by visible text
		S.selectByValue("6");		//Select by value
		
		boolean result = S.isMultiple();
		if(result)
		{
			System.out.println("List box is multiselectable");
		}
		else
		{
			System.out.println("List box is not Multislectable");
		}
		
//		get selected option from list box
		String opt = S.getFirstSelectedOption().getText();
		System.out.println(opt);
		
		System.out.println("-----------");
//		get all options present in list box
		List<WebElement> S3 = S.getOptions();
		for(WebElement list:S3)
		{
			System.out.println(list.getText());
		}
		
//		size of list box
		System.out.println(S3.size());
		
		driver.close();
		
		
		
		
		
		
	}

}
