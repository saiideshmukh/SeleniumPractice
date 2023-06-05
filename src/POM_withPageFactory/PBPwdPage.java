package POM_withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class3
public class PBPwdPage 
{
	//Step1: declare global variable with private access
	@FindBy(xpath = "//input[@name='password']")private WebElement pwd;
	@FindBy(xpath = "//span[text()='Sign in']")private WebElement SignIn;
	
	//Step2: initialize within constructor with public access using PageFactory class
	public PBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Step3: utilize within method with public access
	public void enterPwd()
	{
		pwd.sendKeys("Sanjay@23");
	}
	public void clickSignIn()
	{
		SignIn.click();
	}
	

}
