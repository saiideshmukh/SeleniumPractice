package POM_withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class2
public class PBMobNoPage 
{
	//Step1: declare global variable with private access
	@FindBy(xpath = "(//input[@id='central-login-module-sign-mobile'])[2]")private WebElement mobno;
	@FindBy(xpath = "(//span[text()='Sign in with Password'])[2]")private WebElement signinwithPWD;
	
	//Step2: initialize within constructor with public access using PageFactory class
	public PBMobNoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Step3: utilize within method with public access
	public void entermobno() 
	{
		mobno.sendKeys("7020500587");
	}
	
	public void clickSignInwithPwd() 
	{
		signinwithPWD.click();
	}

}
