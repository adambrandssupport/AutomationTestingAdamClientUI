package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClKYCFormPage 
{
	@FindBy(xpath = "//h1[text()='Create Account']")private WebElement KYCFormPageTitle;
	public AClKYCFormPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String getAClSignUpPageText()
	{
		String text= KYCFormPageTitle.getText();
		return text;		
	}
	public WebElement getAClSignUpPageWebElement()
	{	
		return KYCFormPageTitle;		
	}

}
