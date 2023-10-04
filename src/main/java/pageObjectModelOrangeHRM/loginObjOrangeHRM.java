package pageObjectModelOrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginObjOrangeHRM {
	
	public static WebDriver driver ;
	
	private By Username=By.xpath("//input[@name='username']");
	
	private By Password=By.xpath("//input[@name='password']");
	
	private By login=By.xpath(" //button[@type='submit']");
	
	
	public WebElement Username ()
	{
		return driver.findElement(Username);
	}
	
	public WebElement Password ()
	{
		return driver.findElement(Password);
	}
	
	public WebElement login ()
	{
		return driver.findElement(login);
	}
	
	public loginObjOrangeHRM  (WebDriver driver2) {
	this.driver=driver2;	
		
	}
}

