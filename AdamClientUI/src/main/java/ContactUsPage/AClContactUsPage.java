package ContactUsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClContactUsPage 
{
	@FindBy(xpath="//h1[@class='hjj']")private WebElement sendMsg;
	@FindBy(xpath="//input[@placeholder='Your Name']")private WebElement name;
	@FindBy(xpath="//input[@placeholder='Your Email Address']")private WebElement eMail;
	@FindBy(xpath="//input[@placeholder='Your Phone Number']")private WebElement phone;
	@FindBy(xpath="//textarea[@placeholder='Enter Your Message Here']")private WebElement msg;
	@FindBy(xpath="//button[text()='Submit Now']")private WebElement submitNowBtn;
	@FindBy(xpath="//button[@class='got_to_kyc_button']")private WebElement goToKycFormBtn;
	@FindBy(xpath="")private WebElement facebookLink;
	@FindBy(xpath="")private WebElement twitterLink;
	@FindBy(xpath="")private WebElement googleLink;
	@FindBy(xpath="")private WebElement linkedInLink;
	public AClContactUsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement AClContactUsPageSendMsg() 
	{
		return sendMsg;
	}
	public void inpAClContactUsPageName(String yName) 
	{
		name.sendKeys(yName);
	}
	public void inpAClContactUsPageEmail(String yEmail) 
	{
		eMail.sendKeys(yEmail);
	}
	public void inpAClContactUsPagePhone(String yPhone) 
	{
		phone.sendKeys(yPhone);
	}
	public void inpAClContactUsPageMsg(String yMsg) 
	{
		msg.sendKeys(yMsg);
	}
	public void clickAClContactUsPageSubmitNowBtn() 
	{
		submitNowBtn.click();
	}
	public WebElement rtnAClContactUsPageGoToKycFormBtn() 
	{
		return goToKycFormBtn;
	}
}
