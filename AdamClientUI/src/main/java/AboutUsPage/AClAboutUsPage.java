package AboutUsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClAboutUsPage 
{
	@FindBy(xpath="//h1[text()='Introduction']")private WebElement intro;
	@FindBy(xpath="//button[text()='Read More']")private WebElement readMoreBtn;
	@FindBy(xpath="//button[text()='More Services']")private WebElement moreServicesBtn;
	@FindBy(xpath="//button[text()='Contact US']")private WebElement contactUsBtn;
	@FindBy(xpath="//button[@class='got_to_kyc_button']")private WebElement goToKYCFormBtn;
	@FindBy(xpath="//p[text()='Contact Us']")private WebElement contactUsLink;
	@FindBy(xpath="//button[@class='got_to_kyc_button']")private WebElement goToKycFormBtn;
	public AClAboutUsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement AClAboutUsPageIntro() 
	{
		return intro;
	}
	
	public void clickAboutUsPageReadMoreBtn()
	{
		readMoreBtn.click();
	}
	public void clickAboutUsPageMoreServicesBtn()
	{
		moreServicesBtn.click();
	}
	public void clickAboutUsPageContactUsBtn()
	{
		contactUsBtn.click();
	}
	public void clickAboutUsPageContactUsLink()
	{
		contactUsLink.click();
	}
	public WebElement rtnAboutUsPageGoToKycFormBtn()
	{
		return goToKycFormBtn;
	}
}
