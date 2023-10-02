package SignIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClRegistrationPage 
{
	@FindBy(xpath = "//h1[text()='Create Account']")private WebElement signUpPageTitle;
	public AClRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String getAClSignUpPageText()
	{
		String text= signUpPageTitle.getText();
		return text;		
	}
	public WebElement getAClSignUpPageWebElement()
	{	
		return signUpPageTitle;		
	}
}
