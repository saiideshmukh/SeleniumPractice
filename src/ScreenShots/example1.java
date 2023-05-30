package ScreenShots;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		File SS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(SS);
		
		File dest=new File("F:\\autoTesting\\SS1.jpg");
		
		org.openqa.selenium.io.FileHandler.copy(SS, dest);
		
		
		
	}
	

}
