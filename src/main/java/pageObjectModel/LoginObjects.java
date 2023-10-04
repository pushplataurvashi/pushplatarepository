package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjects {
	
	public static WebDriver driver;
	private By UserName=By.xpath("//input[@id='username']");
	private By Password=By.xpath("//input[@id='password']");
	private By Login= By.xpath("//input[@id='Login']");
	private By TryForFree=By.xpath("//a[@id='signup_link']");
	public LoginObjects(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement enterUsername()
	{
		return driver.findElement(UserName);
	}
	public WebElement enterPassword()
	{
		return driver.findElement(Password);
	}
	public WebElement clickOnLogin()
	{
		return driver.findElement(Login);
	}
	public WebElement TryForFree ()
	{
		return driver.findElement(TryForFree);
	
	}
}
