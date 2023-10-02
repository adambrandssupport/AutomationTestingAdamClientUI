package AboutUsPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClContactUsPage 
{
	@FindBy(xpath="//h1[@class='hjj']")private WebElement sendMsg;
	public AClContactUsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement AClContactUsPageSendMsg() 
	{
		return sendMsg;
	}
}
