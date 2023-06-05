package POM_withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//POM class4
public class PBHomePage 
{
	//Step1: declare global variable with private access
	@FindBy(xpath = "//div[text()='My Account']")private WebElement myacc;
	WebDriver driver1;
	
	//Step2: initialize within constructor with public access using PageFactory class
	public PBHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	//Step3: utilize within method with public access
	public void openDDoptions() 
	{
		Actions act=new Actions(driver1);
		act.moveToElement(myacc).perform();
	}
	

}
