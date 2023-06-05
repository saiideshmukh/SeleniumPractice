package POM_withPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class5
public class PBmyAccDDoptionspage
{
	@FindBy(xpath = "//span[text()=' My profile ']")private WebElement myprofile;
	
	public PBmyAccDDoptionspage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickmyprofile() 
	{
		myprofile.click();
	}

}
