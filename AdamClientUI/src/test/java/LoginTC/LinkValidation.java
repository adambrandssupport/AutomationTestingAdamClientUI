package LoginTC;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import SignIN.AClForgotPwdPage;
import SignIN.AClHomePage;
import SignIN.AClLoginPage;
import SignIN.AClRegistrationPage;
import net.bytebuddy.utility.RandomString;

public class LinkValidation extends BaseClass
{
	AClHomePage hp;
	AClLoginPage lp;
	AClRegistrationPage rp;
	AClForgotPwdPage fp;
	SoftAssert soft;
@BeforeMethod
public void openBrowser() throws IOException, InterruptedException
{
	initialiseBrowser();
	hp= new AClHomePage(driver);
	lp= new AClLoginPage(driver);
	fp= new AClForgotPwdPage(driver);
	rp= new AClRegistrationPage(driver);
	soft= new SoftAssert();
	hp.clickHomePageSignInButton();
}

@Test(priority=1)
public void signUpLink() throws IOException, InterruptedException
{	
	Thread.sleep(2000);
	lp.clickLoginPageSignUpLink();	
	Thread.sleep(2000);
	String ActText = rp.getAClSignUpPageText();
	String ExpText = UtilityClass.getTD(4, 0);
	Reporter.log(ExpText+"==>"+ActText, true);
	UtilityClass.drawBorder(driver, rp.getAClSignUpPageWebElement());
	soft.assertEquals(ActText,ExpText,"SignUp Page Not Opened");
	soft.assertAll();
	Thread.sleep(2000);
}

@Test(priority=2)
public void ForgotPwdLink() throws IOException, InterruptedException
{	
	lp.clickLoginPageForgotPwdLink();
	String ActText = fp.getAClForgotPwdPageText();
	String ExpText = UtilityClass.getTD(4, 1);
	Reporter.log(ExpText+"==>"+ActText, true);
	UtilityClass.drawBorder(driver, fp.getAClForgotPwdPageWebElement());
	soft.assertEquals(ActText,ExpText,"Forgot Password Page Not Opened");
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