package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import resources2ORNG.BaseClass2ORNG;

public class verifyLogIn2ORNG extends BaseClass2ORNG {
	
	@Test
	public void login() throws IOException, InterruptedException
	{
	driverInitialize ();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	
	WebElement Username=driver.findElement(By.xpath("//input[@name='username']"));
	Username.sendKeys("Admin");
	Thread.sleep(1000);
	
	WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
	Password.sendKeys("admin123");
	Thread.sleep(1000);
	
	WebElement loginbutton=driver.findElement(By.xpath(" //button[@type='submit']"));
	loginbutton.click();

	Thread.sleep(1000);   
	}
}