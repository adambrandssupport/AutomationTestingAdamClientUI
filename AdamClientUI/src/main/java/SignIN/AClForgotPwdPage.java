package SignIN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClForgotPwdPage 
{
	@FindBy(xpath = "//h1[text()='Forgot Your Password']")private WebElement forgotPwdPageTitle;
	public AClForgotPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String getAClForgotPwdPageText()
	{
		String text= forgotPwdPageTitle.getText();
		return text;		
	}
	public WebElement getAClForgotPwdPageWebElement()
	{	
		return forgotPwdPageTitle;		
	}
}
