package AboutUsTC;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import AboutUsPage.AClAboutUsPage;
import AboutUsPage.AClContactUsPage;
import AboutUsPage.AClHomePage;
import AboutUsPage.AClLoginPage;
import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import net.bytebuddy.utility.RandomString;

public class AU6BtnLink extends BaseClass
{
	AClHomePage hp;
	AClAboutUsPage as;
	AClContactUsPage cs;
	AClLoginPage lp;
	SoftAssert soft;
@BeforeClass
public void openBrowser() throws IOException, InterruptedException
{
	initialiseBrowser();
	hp = new AClHomePage(driver);
	as = new AClAboutUsPage(driver);
	cs = new AClContactUsPage(driver);
	lp = new AClLoginPage(driver);
	soft = new SoftAssert();
	Thread.sleep(2000);
}

@Test(priority=1, enabled= false)
public void adamBrandLogoDisplayed() throws IOException,InterruptedException 
{	
	Thread.sleep(2000);
    hp.clickHomePageAboutUsButton();
    as.clickAboutUsPageReadMoreBtn();
    as.clickAboutUsPageContactUsBtn();
}
@Test(priority=1, enabled= true)
public void goToKycFormButton() throws IOException,InterruptedException 
{	
	hp.clickHomePageAboutUsButton();
	Thread.sleep(2000);
	UtilityClass.scrollDownToElement(driver, as.rtnAboutUsPageGoToKycFormBtn());
	Thread.sleep(2000);
	as.rtnAboutUsPageGoToKycFormBtn().click();
	Thread.sleep(100);
	UtilityClass.drawBorder(driver, lp.rtnAClSignInPageWebElement());
	Thread.sleep(2000);
	String ExpResult = UtilityClass.getTD(1, 3);
    String ActResult = lp.rtnAClSignInPageWebElement().getText();
  	Reporter.log(ExpResult+"==>"+ActResult, true);   
    soft.assertEquals(ExpResult, ActResult,"Login page not opened");
    soft.assertAll();
	driver.navigate().back();
}
@Test(priority=2, enabled= true)
public void contactUsButton() throws IOException,InterruptedException 
{	
	Thread.sleep(100);
	as.clickAboutUsPageContactUsBtn();
	Thread.sleep(100);
	UtilityClass.drawBorder(driver, cs.AClContactUsPageSendMsg());
	Thread.sleep(2000);
	String ExpResult = UtilityClass.getTD(1, 1);
    String ActResult = cs.AClContactUsPageSendMsg().getText();
  	Reporter.log(ExpResult+"==>"+ActResult, true);   
    soft.assertEquals(ExpResult, ActResult,"Login page not opened");
    soft.assertAll();
	driver.navigate().back();
}
@Test(priority=3, enabled= true)
public void contactUsLink() throws IOException,InterruptedException 
{	
	Thread.sleep(100);
	as.clickAboutUsPageContactUsLink();
	Thread.sleep(100);
	UtilityClass.drawBorder(driver, cs.AClContactUsPageSendMsg());
	Thread.sleep(2000);
	String ExpResult = UtilityClass.getTD(1, 1);
    String ActResult = cs.AClContactUsPageSendMsg().getText();
  	Reporter.log(ExpResult+"==>"+ActResult, true);   
    soft.assertEquals(ExpResult, ActResult,"Login page not opened");
    soft.assertAll();
	driver.navigate().back();
}

@AfterMethod
public void CaptureFailedTCSS(ITestResult s1) throws IOException
{
	String rs= RandomString.make(2);
if(s1.getStatus()==ITestResult.FAILURE)
{
	UtilityClass.captureSS(driver, rs);
}
}

@AfterClass
public void logOut() throws IOException
{
 //  driver.close();
}
}
