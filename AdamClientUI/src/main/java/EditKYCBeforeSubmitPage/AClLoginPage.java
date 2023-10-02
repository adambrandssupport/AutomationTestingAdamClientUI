package EditKYCBeforeSubmitPage;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import LibraryFiles.UtilityClass;
public class AClLoginPage 
{
	@FindBy(xpath="//input[@type='text']")private WebElement eMail;
	@FindBy(xpath="//input[@type='password']")private WebElement pwd;	
	@FindBy(xpath="//input[@type='checkbox']")private WebElement remMe;
	@FindBy(xpath="//input[@type='button']")private WebElement signInBtn;
	@FindBy(xpath="//h2[text()='Login successful']")private WebElement logInSuccesstMsg;
	@FindBy(xpath="//div[contains(text(),'Password didn')]")private WebElement wrongPwdMsg;
	@FindBy(xpath="//div[text()='User not registered']")private WebElement notRegMsg;
	@FindBy(xpath="//i[@class='eye fa fa-eye']")private WebElement togglePwdBtn;
	@FindBy(xpath="//span[@class='login-signUp']")private WebElement signUpLink;
	@FindBy(xpath="//p[text()='Forgot Password?']")private WebElement forgotPwdLink;
	@FindBy(xpath = "//h1[text()='Hello ! Welcome Back']")private WebElement signInPageTitle;
	@FindBy(xpath="(//p[text()='This field is required'])[1]")private WebElement invalidEmailMsg;
	@FindBy(xpath="(//p[text()='This field is required'])[2]")private WebElement pwdReqMsg;
	public Actions act;
	public AClLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	//	this.act=new Actions(driver);
	}
	public void inpLoginPageEmail(String mailId)
	{
		eMail.sendKeys(mailId);
	}
	
	public void inpLoginPagePwd(String passWord)
	{
		pwd.sendKeys(passWord);
	}
	
	public void clickLoginPageLoginBtn()//WebDriver driver
	{
		signInBtn.click();
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].click();", signInBtn);
	}

	public String getAClLoginPageText()
	{
		String text= signInPageTitle.getText();
		return text;		
	}
	public WebElement getAClLoginPageWebElement()
	{	
		return signInPageTitle;		
	}
	public void clickLoginPageSignUpLink()
	{
		signUpLink.click();
	}
	public void clickLoginPageForgotPwdLink()
	{
		forgotPwdLink.click();
	}

	
	public void clickLoginPageRemMeCheckbox()
	{
		remMe.click();
	}
	
	public WebElement rtnEleLogInSuccesstMsg() throws IOException
	{
		return logInSuccesstMsg;
	}
	public WebElement rtnEleWrongPwdMsg() throws IOException
	{
		return wrongPwdMsg;
	}
	public WebElement rtnEleNotRegMsg() throws IOException
	{	
		return notRegMsg;
	}
	
	public WebElement rtnInvalidEmailMsg() throws IOException
	{	
		return invalidEmailMsg;
	}
	
	public WebElement rtnPwdReqMsg() throws IOException
	{	
		return pwdReqMsg;
	}
	
	
	
	public String drawborderLoginPageToastMsg(WebDriver driver) throws IOException
	{		
		//act.click(togglePwdBtn).perform();
		  UtilityClass.drawBorder(driver, logInSuccesstMsg);
		  return logInSuccesstMsg.getAttribute("innerHTML");			
	}
}
