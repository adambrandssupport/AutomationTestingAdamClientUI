package ContactUsTC;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ContactUsPage.AClContactUsPage;
import ContactUsPage.AClHomePage;
import ContactUsPage.AClLoginPage;
import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import net.bytebuddy.utility.RandomString;

public class CUBtnLink extends BaseClass
{
	AClHomePage hp;
	AClContactUsPage cs;
	AClLoginPage lp;
	SoftAssert soft;
@BeforeClass
public void openBrowser() throws IOException, InterruptedException
{
	initialiseBrowser();
	hp = new AClHomePage(driver);
	cs = new AClContactUsPage(driver);
	lp = new AClLoginPage(driver);
	soft = new SoftAssert();
	Thread.sleep(2000);
}
@Test(priority=1, enabled= true)
public void goToKycFormButton() throws IOException,InterruptedException 
{	
	hp.clickHomePageContactUsButton();
	Thread.sleep(2000);
	UtilityClass.scrollDownToElement(driver, cs.rtnAClContactUsPageGoToKycFormBtn());
	Thread.sleep(2000);
	cs.rtnAClContactUsPageGoToKycFormBtn().click();
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
