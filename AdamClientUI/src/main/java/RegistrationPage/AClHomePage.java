package RegistrationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClHomePage 
{
@FindBy(xpath="//a[text()='Sign up']")private WebElement SignUP;
	
public AClHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void clickHomePageSignUpButton()
{
	SignUP.click();
}
}
