package RegistrationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibraryFiles.UtilityClass;

public class AClRegistrationPage 
{
	@FindBy(xpath = "//h1[text()='Create Account']")private WebElement signUpPageTitle;
	@FindBy(xpath = "//input[@placeholder='Demo']")private WebElement compName;
	@FindBy(xpath = "//input[@placeholder='Demo@gmail.com']")private WebElement eMail;
	@FindBy(xpath = "//select[@class='PhoneInputCountrySelect']")private WebElement countryCode;
	@FindBy(xpath = "//input[@class='PhoneInputInput']")private WebElement phoneNO;
	@FindBy(xpath = "(//input[@type='password'])[1]")private WebElement pwd;
	@FindBy(xpath = "//input[@name='confirmPassword']")private WebElement reTypePwd;
	@FindBy(xpath = "//input[@class='login-input-btn']")private WebElement signUpBtn;
	@FindBy(xpath = "(//i[@class='eye fa fa-eye-slash'])[1]")private WebElement togglePwdBtn;
	@FindBy(xpath = "//span[text()='Sign In']")private WebElement signInLink;	
	public AClRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inpAClRegiPageCompanyName(String cName)
	{
		compName.sendKeys(cName);		
	}
	public void inpAClRegiPageEmail(String mail)
	{
		eMail.sendKeys(mail);		
	}
	public void seleAClRegiPageCountryCode(String cntryCode)
	{
		UtilityClass.selectCountryList(countryCode, cntryCode);		
	}
	public void inpAClRegiPagePhoneNo(String phone)
	{
		phoneNO.sendKeys(phone);		
	}
	public void inpAClRegiPagePwd(String pswd)
	{
		pwd.sendKeys(pswd);		
	}
	public void inpAClRegiPageRetypePwd(String rePswd)
	{
		reTypePwd.sendKeys(rePswd);		
	}
	public void clickAClRegiPageSignUpBtn()
	{
		signUpBtn.click();		
	}
	public void clickAClRegiPageSignInLink()
	{
		signInLink.click();		
	}
	public void clickAClRegiPageTogglePwd()
	{
		togglePwdBtn.click();		
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
