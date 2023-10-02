package KYCPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AAdmnHomePage 
{
	@FindBy(xpath="//input[@name='companyEmail']")private WebElement eMail;
	@FindBy(xpath="//input[@placeholder='****************']")private WebElement pwd;
    @FindBy(xpath="//input[@value='Sign In']")private WebElement SignInBtn;
    @FindBy(xpath="//span[@class='login-signUp']")private WebElement SignUpLnk;

public AAdmnHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void inpAAdmnHomePageEMail(String Email) throws IOException
{
	eMail.sendKeys(Email);
}
public void inpAAdmnHomePagePwd(String Pwd)
{
	pwd.sendKeys(Pwd);
}
public void clickAAdmnHomePageSignInBtn()
{
	SignInBtn.click();
}

}
