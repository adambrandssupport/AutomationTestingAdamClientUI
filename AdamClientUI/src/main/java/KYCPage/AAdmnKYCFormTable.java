package KYCPage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AAdmnKYCFormTable 
{
	@FindBy(xpath="//button[@class='pageNumberactive']/following::button[1]")private WebElement nextActBtn;
	@FindBy(xpath="//table//tr//td[6]")private List<WebElement> listEmail;
    @FindBy(xpath="//input[@value='Sign In']")private WebElement SignInBtn;
    @FindBy(xpath="//span[@class='login-signUp']")private WebElement SignUpLnk;
  
public AAdmnKYCFormTable(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickAAdmnKYCFormTableRecentKYCForm(WebDriver driver, String cliEmail) throws InterruptedException
{
	while(true)
	{
		for(WebElement wb:listEmail)
		{
			String ele= wb.getText();
			if(ele.equals(cliEmail))
			  {	
				driver.findElement(By.xpath("//td[text()='"+cliEmail+"']//following::div[1]")).click();	
			  }	
		}
		try
		{
			Thread.sleep(2000);
			nextActBtn.click();
		}
		catch(Exception e)
		{
			System.out.println("org.openqa.selenium.NoSuchElementException");
		}
	}
	
}

}
