package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClLoginPage 
{
	@FindBy(xpath = "//h1[text()='Create Account']")private WebElement signUpPageTitle;
	public AClLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement rtnAClSignUpPageWebElement()
	{	
		return signUpPageTitle;		
	}

}
