package LibraryFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass 
{
public WebDriver driver;
public String browserName="Chrome";
public void initialiseBrowser() throws IOException
{
	
	if(browserName.equalsIgnoreCase("Chrome"))
	{
	  driver = new ChromeDriver();	
    }
	else if(browserName.equalsIgnoreCase("Firefox"))
	{
		driver = new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("Edge"))
	{
		driver = new EdgeDriver();
    }
	else if(browserName.equalsIgnoreCase("Edge"))
	{
		driver = new SafariDriver();
    }
	driver.manage().window().maximize();
	//driver.get("https://frontendui-9ba21.web.app");
	driver.get(UtilityClass.getPFData("URL"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
}