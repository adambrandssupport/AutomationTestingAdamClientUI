package ProfilePage;

import java.io.IOException;

import org.checkerframework.checker.index.qual.SubstringIndexBottom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClProfilePage
{
	
@FindBy(xpath="//p[@class='headingCompanyNAme']")private WebElement CompName;
@FindBy(xpath="//p[@class='headingCompanyNAme']/following::p[1]")private WebElement CompEmail;
@FindBy(xpath="//p[text()='Company Phone Number']/following::p[1]")private WebElement CompPhone;
@FindBy(xpath="//p[text()='Company Registration Date']/following::p[1]")private WebElement CompRegDate;
@FindBy(xpath="//p[text()='Trade License Number ']/following::p[1]")private WebElement trdLiscNo;
@FindBy(xpath="//p[text()='Company Address']/following::p[1]")private WebElement CompAdd;
@FindBy(xpath="//div[@class='avtarCamera']//img")private WebElement changeProfilePhotoBtn;
@FindBy(xpath="//div[@class='iconCamera']//img")private WebElement changeBackgroundImgBtn;

@FindBy(xpath="//div[text()='Profile']")private WebElement profileBtn;
@FindBy(xpath="//div[text()='KYC Form']")private WebElement kycFormBtn;
@FindBy(xpath="//h1[text()='KYC Form Details']")private WebElement kycFormDetails;
@FindBy(xpath="//div[text()='Notification']")private WebElement notificationBtn;
@FindBy(xpath="//i[@class='fa-regular fa-bell']")private WebElement notificationBtnAtTop;
@FindBy(xpath="//div[text()='Settings']")private WebElement settingBtn;
@FindBy(xpath="//a[text()='Log Out']")private WebElement logOutBtn;
@FindBy(xpath="//i[@class='fa-sharp fa-solid fa-circle-user']")private WebElement clientProfileLogo;
public AClProfilePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickAClProfilePageChangeProfilePhotoBtn() throws IOException
{
	changeProfilePhotoBtn.click();
}
public void clickAClProfilePageChangeBackgroundImgBtn() throws IOException
{
	changeBackgroundImgBtn.click();
}
public String rtnAClProfilePageCompName() throws IOException
{
	return CompName.getText();
}
public String rtnAClProfilePageCompEmail() throws IOException
{
	
	return CompEmail.getText();
	
}
public String rtnAClProfilePageCompPhone() throws IOException
{
	return CompPhone.getText();
}
public String rtnAClProfilePageCompRegDate() throws IOException
{
	String date=CompRegDate.getText(); 
	String s1=date.substring(8,10)+date.substring(5,7);
	String s2=date.substring(0,4);
	String s3=s1.concat(s2);
	return s3;   // 1984-09-30 <==>3009
}
public String rtnAClProfilePageTrdLiscNo() throws IOException
{
	return trdLiscNo.getText();
}
public String rtnAClProfilePageCompAdd() throws IOException
{
	return CompAdd.getText();
}


public WebElement rtnAClProfilePageClientProfileLogo() throws IOException
{
	return clientProfileLogo;
}
public void clickAClProfilePageProfileBtn()
{
	profileBtn.click();
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
public void clickAClProfilePageSettingBtn()
{
	settingBtn.click();
}
public void clickAClProfilePageLogOutBtn()
{
	logOutBtn.click();
}
}
