package KYCPage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AAdmnKYCFormView 
{
    @FindBy(xpath="//p[text()='Registered Company Name']//following::p[1]")private WebElement CompNameKycForm; 
public AAdmnKYCFormView(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement rtnAAdmnKYCFormTableCompNameKycForm()
{
	return CompNameKycForm;
}
}
