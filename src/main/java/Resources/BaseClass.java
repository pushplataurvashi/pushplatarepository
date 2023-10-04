package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public void driverInitialize() throws IOException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\amanp\\eclipse-workspace\\UrvashiDemo\\src\\main\\java\\Resources\\data.properties");
        
		Properties p=new Properties();
        p.load(fs);
        
        String browserName=p.getProperty("browser");
        
        if(browserName.equalsIgnoreCase("chrome") )	
        {
        	driver=new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("edge") )	
        {
        	driver=new EdgeDriver();
        }
        else if(browserName.equalsIgnoreCase("firefox") )	
        {
        	driver=new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("safari") )	
        {
        	driver=new SafariDriver();
        }
        else
        {
        	System.out.println("plz make sure you have correct browser");
        }
	}

}
