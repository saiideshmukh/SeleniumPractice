package POM_withPageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLogInTestClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.policybazaar.com/");
		
		PBLoginPage login=new PBLoginPage(driver);
		login.clickPBSignIn();
		Thread.sleep(1000);
		
		PBMobNoPage mob=new PBMobNoPage(driver);
		mob.entermobno();
		mob.clickSignInwithPwd();
		Thread.sleep(2000);
		
		PBPwdPage pwd=new PBPwdPage(driver);
		pwd.enterPwd();
		pwd.clickSignIn();
		Thread.sleep(2000);
		
		PBHomePage Acc=new PBHomePage(driver);
		Acc.openDDoptions();
		
		PBmyAccDDoptionspage Myacc=new PBmyAccDDoptionspage(driver);
		Myacc.clickmyprofile();
		Thread.sleep(2000);
		
		PBProfilepage profile=new PBProfilepage(driver);
		profile.swithchChildWindow();
		profile.verfiyFullName();
		Thread.sleep(2000);
		
		driver.quit();
				
		
	}

}
