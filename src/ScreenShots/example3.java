package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class example3 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		File SS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String RS = RandomString.make(5);
		File SS1=new File("F:\\autoTesting\\SS"+RS+".png");
		
		FileHandler.copy(SS, SS1);
		
		driver.close();
		
	}

}
