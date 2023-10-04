package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupPageObjects {
	
	public static WebDriver driver;
	
	private By TryForFree=By.xpath("//a[@id='signup_link']");
	private By FirstName=By.xpath("//input[@name='UserFirstName']");
	private By LastName=By.xpath("//input[@name='UserLastName']");
	private By Email= By.xpath("//input[@id='UserEmail-UwDC']");
	private By jobtitle=By.xpath("//select[@id='UserTitle-yWug']");
	private By company=By.xpath("//input[@id='CompanyName-t2p1']");
    private By employee= By.xpath("//select[@id='CompanyEmployees-TGRU']");
	private By phone=By.xpath("//input[@id='UserPhone-dxFs']"); 
	private By country=By.xpath("  //select[@id='CompanyCountry-ynGh']");
	private By Serviceagreement=By.xpath("//div[@class='checkbox-ui']");
	
	
	public WebElement clickOnTryForFree()
	{
		return driver.findElement(TryForFree);
	}
	public WebElement FirstName()
	{
		return driver.findElement(FirstName);
	}
	public WebElement LastName()
	{
		return driver.findElement(LastName);
	}
	
	public WebElement Email()
	{
		return driver.findElement(Email);
	}
	public WebElement jobtitle()
	{
		return driver.findElement(jobtitle);
	}
	public WebElement company()
	{
		return driver.findElement(company);
	}
	public WebElement employee()
	{
		return driver.findElement(employee);
	}
	public WebElement phone()
	{
	return driver.findElement(phone);
	}
	
	public WebElement country ()
	{
	return driver.findElement(country);
	}
	
	public WebElement Serviceagreement ()
	{
	return driver.findElement(Serviceagreement);
    }
	
}


