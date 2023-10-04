package Demo.UrvashiDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class VerifyLogin extends BaseClass{
	
	@Test		
	public void Login() throws IOException, InterruptedException {
		
		driverInitialize();
		Thread.sleep(3000);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement userName=driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("urvashi1234@gmail.com");
		
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("urvashi007##");
		
		Thread.sleep(3000);
		WebElement login= driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		
		driver.close();
		
		
		
	}
	

}
