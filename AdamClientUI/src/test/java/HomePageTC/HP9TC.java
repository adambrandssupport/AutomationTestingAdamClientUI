package HomePageTC;

import java.io.IOException;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import HomePage.AClHomePage;
import HomePage.AClSignInPage;
import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import net.bytebuddy.utility.RandomString;

public class HP9TC extends BaseClass
{
	AClHomePage hp;
	AClSignInPage lp;
	SoftAssert soft;
@BeforeClass
public void openBrowser() throws IOException, InterruptedException
{
	initialiseBrowser();
	hp = new AClHomePage(driver);
	lp = new AClSignInPage(driver);
	soft = new SoftAssert();
	Thread.sleep(2000);
}
@Test(priority=6, enabled= true)
public void gettingStartedButton() throws IOException,InterruptedException 
{	
	Thread.sleep(2000);
	hp.clickHomePageGettingStartedButton();
	Thread.sleep(2000);
	UtilityClass.drawBorder(driver, hp.rtnHomePageAboutCompany());
	Thread.sleep(2000);
	String ExpResult = UtilityClass.getTD(1, 2);
    String ActResult = hp.rtnHomePageAboutCompany().getText();
  	Reporter.log(ExpResult+"==>"+ActResult, true);   
    soft.assertEquals(ExpResult, ActResult,"Login page not opened");
    soft.assertAll();
}
@Test(priority=7, enabled= true)
public void goToKYCFormButton() throws IOException,InterruptedException 
{	
	Thread.sleep(2000);
	UtilityClass.scrollUpDown(driver);
	Thread.sleep(2000);
	hp.clickHomePageGoToKYCFormButton();
	Thread.sleep(2000);
	UtilityClass.drawBorder(driver, lp.rtnAClSignInPageWebElement());
	Thread.sleep(2000);
	String ExpResult = UtilityClass.getTD(1, 3);
    String ActResult = lp.rtnAClSignInPageWebElement().getText();
    Reporter.log(ExpResult+"==>"+ActResult, true);
    soft.assertEquals(ExpResult, ActResult,"Login page not opened");
    soft.assertAll();
	driver.navigate().back();
	
}
@Test(priority=8, enabled= true)
public void goToKYCFormButtonAtBottom() throws IOException,InterruptedException 
{	
	Thread.sleep(2000);
	UtilityClass.scrollDownToElement(driver,hp.rtnHomePageGoToKYCFormBtnAtBottom());
	hp.rtnHomePageGoToKYCFormBtnAtBottom().click();
	Thread.sleep(2000);
	UtilityClass.drawBorder(driver, lp.rtnAClSignInPageWebElement());
	Thread.sleep(2000);
	String ExpResult = UtilityClass.getTD(1, 3);
    String ActResult = lp.rtnAClSignInPageWebElement().getText();
    Reporter.log(ExpResult+"==>"+ActResult, true);
    soft.assertEquals(ExpResult, ActResult,"Login page not opened");	
    soft.assertAll();
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
