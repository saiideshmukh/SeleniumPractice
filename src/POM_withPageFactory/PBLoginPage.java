package POM_withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class1
public class PBLoginPage 
{
	//Step1: declare global variable with private access 
	@FindBy(xpath="//a[text()='Sign in']")private WebElement SignIn;
	
	//Step2: initialize within constructor with public access using PageFactory class
	public PBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Step3: utilize within method with public access
	public void clickPBSignIn() 
	{
		SignIn.click();
	}

}
