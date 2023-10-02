package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClSignInPage 
{
	
	@FindBy(xpath = "//h1[text()='Hello ! Welcome Back']")private WebElement signInPageTitle;
	
	public AClSignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement rtnAClSignInPageWebElement()
	{	
		return signInPageTitle;		
	}
}
