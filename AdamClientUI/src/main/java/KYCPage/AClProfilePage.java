package KYCPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClProfilePage
{
@FindBy(xpath="//div[text()='Profile']")private WebElement profileBtn;
@FindBy(xpath="//p[@class='headingCompanyNAme']")private WebElement companyNameOnPP;
@FindBy(xpath="//div[text()='KYC Form']")private WebElement kycFormBtn;
@FindBy(xpath="//h1[text()='KYC Form Details']")private WebElement kycFormDetails;
@FindBy(xpath="//div[text()='Notification']")private WebElement notificationBtn;
@FindBy(xpath="//p[text()='Notifications List']")private WebElement notificationList;
@FindBy(xpath="//i[@class='fa-regular fa-bell']")private WebElement notificationBtnAtTop;
@FindBy(xpath="//div[text()='Settings']")private WebElement settingBtn;
@FindBy(xpath="//a[text()='Log Out']")private WebElement logOutBtn;
@FindBy(xpath="//i[@class='fa-sharp fa-solid fa-circle-user']")private WebElement clientProfileLogo;
public AClProfilePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement rtnAClProfilePageClientProfileLogo() throws IOException
{
	return clientProfileLogo;
}
public void clickAClProfilePageProfileBtn()
{
	profileBtn.click();
}
public WebElement rtnAClProfilePageCompanyName() throws IOException
{
	return companyNameOnPP;
}
public void clickAClProfilePageKycFormBtn()
{
	kycFormBtn.click();
}
public WebElement rtnAClProfilePageKycFormDetails() throws IOException
{
	return kycFormDetails;
}
public void clickAClProfilePageNotificationBtn()
{
	notificationBtn.click();
}
public void clickAClProfilePageNotificationBtnAtTop()
{
	notificationBtnAtTop.click();
}
public WebElement rtnAClProfilePageNotificationList() throws IOException
{
	return notificationList;
}
public void clickAClProfilePageSettingBtn()
{
	settingBtn.click();
}
public void clickAClProfilePageLogOutBtn()
{
	logOutBtn.click();
}
}
