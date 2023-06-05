package POM_withPageFactory;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class6
public class PBProfilepage 
{
	@FindBy(xpath = "//input[@name='personName']")private WebElement acttxt;
	WebDriver driver1;
	
	public PBProfilepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void swithchChildWindow()
	{
		Set<String> allID = driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allID);
		driver1.switchTo().window(al.get(1));
	}
	
	public void verfiyFullName() 
	{
		String name = acttxt.getAttribute("value");
		String name1="Jan batch";
		
		if(name.equals(name1))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC fail");
		}
	}

}
