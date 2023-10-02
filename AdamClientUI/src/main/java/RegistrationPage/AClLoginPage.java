package RegistrationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClLoginPage 
{
	@FindBy(xpath = "//h1[text()='Hello ! Welcome Back']")private WebElement signInPageTitle;
	public AClLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement rtnAClSignUpPageWebElement()
	{	
		return signInPageTitle;		
	}

}
