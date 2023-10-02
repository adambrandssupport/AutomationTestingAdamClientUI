package ProfilePageKYCForm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;


public class LocalTesting 
{
	@Test
public void Test() {
		WebDriver dr=new SafariDriver();
	System.out.println("Hi LocalHost");
	dr.get("file:///D:/HTML/Table/JavaScript.html");
}
}
