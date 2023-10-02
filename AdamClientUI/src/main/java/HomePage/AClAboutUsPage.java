package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClAboutUsPage 
{
	@FindBy(xpath="//h1[text()='Introduction']")private WebElement intro;
	public AClAboutUsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement AClAboutUsPageIntro() 
	{
		return intro;
	}
}
