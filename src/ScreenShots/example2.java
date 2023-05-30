package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class example2 
{
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		
		File SS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File SS1=new File("F:\\autoTesting\\SS2.jpg");
		FileHandler.copy(SS, SS1);
		
		driver.close();
				
		
		
	}

}
