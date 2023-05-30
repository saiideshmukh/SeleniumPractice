package Handle_ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample2 
{
	
	//Select multi-selectable List box
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/auto%20testing%20class/multiple.html");
		
		WebElement counntry = driver.findElement(By.id("1234"));
		Select S=new Select(counntry);
		S.selectByVisibleText("Ind");
		S.selectByVisibleText("Aus");
		S.selectByIndex(1);
		
		Thread.sleep(3000);
	
//		first selected option(as per index)
		String txt = S.getFirstSelectedOption().getText();
		System.out.println(txt);
		
//		all selected options
		List<WebElement> allopt = S.getAllSelectedOptions();
//		get size of all selected options
		System.out.println(allopt.size());
//		all selected options
		for(WebElement S1:allopt)
		{
			System.out.println(S1.getText());
		}
		
		
		
//		S.deselectByIndex(0);
		S.deselectByVisibleText("Aus");
//		S.deselectByValue("")
		Thread.sleep(1000);
		
		
//		deselect all selected options 
		S.deselectAll();
		Thread.sleep(1000);
		
//		isMultiple
		boolean result = S.isMultiple();
		if(result) 
		{
			System.out.println("List box is Multiselectable");
		}
		else
		{
			System.out.println("List box is not Multiselectable");
		}
		
	
		
		
		driver.close();
		
	}

}
