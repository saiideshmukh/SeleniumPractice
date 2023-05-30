package Handle_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("dhsfhf");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("awegtj");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[contains(@name,'reg_email')]")).sendKeys("alfjv@mail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("avks12345");
		driver.findElement(By.xpath("//input[contains(@name,'confirmation__')]")).sendKeys("alfjv@mail.com");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select S1=new Select(day);
		S1.selectByVisibleText("25");
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select S2=new Select(month);
		S2.selectByIndex(5);
		
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select S3=new Select(year);
		S3.selectByVisibleText("1976");
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
	}

}
