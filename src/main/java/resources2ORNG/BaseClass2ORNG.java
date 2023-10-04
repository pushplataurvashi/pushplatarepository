package resources2ORNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass2ORNG {
	
	public static WebDriver driver;
	
	public void driverInitialize() throws IOException
	
	{
FileInputStream fs=new FileInputStream("\\Users\\amanp\\eclipse-workspace\\UrvashiDemo\\src\\main\\java\\resources2ORNG\\data.properties2ORNG");
        
		Properties p=new Properties();
		
        p.load(fs);
        
        String browserName=p.getProperty("browser");
        
        if(browserName.equalsIgnoreCase("chrome") )	
        {
        	driver=new ChromeDriver();
        }
    
     }
}