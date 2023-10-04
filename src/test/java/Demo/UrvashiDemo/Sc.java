package Demo.UrvashiDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sc {
	
	@Test
	public void screenshot() throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		TakesScreenshot s=(TakesScreenshot)driver;
		
		File src=s.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\amanp\\OneDrive\\Desktop\\capss\\.png");
		FileUtils.copyFile(src, dest);
	}

}
