package LoginTC;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import SignIN.AClHomePage;
import SignIN.AClLoginPage;
import net.bytebuddy.utility.RandomString;

public class HP1TC extends BaseClass
{
	AClHomePage hp;
	AClLoginPage lp;
	
@BeforeMethod
public void openBrowser() throws IOException
{
	initialiseBrowser();
	hp = new AClHomePage(driver);
	lp= new AClLoginPage(driver);
}
@Test
public void signIn() throws IOException, InterruptedException
{
	Thread.sleep(3000);
	hp.clickHomePageSignInButton();
	lp.inpLoginPageEmail(UtilityClass.getTD(1, 1));
	lp.inpLoginPagePwd(UtilityClass.getTD(1, 2));
	Thread.sleep(2000);
	lp.clickLoginPageRemMeCheckbox();
	lp.clickLoginPageLoginBtn();
	lp.drawborderLoginPageToastMsg(driver);
	String Actmsg =lp.drawborderLoginPageToastMsg(driver);
	String Expmsg=(UtilityClass.getTD(1, 3));
	SoftAssert soft= new SoftAssert();
	soft.assertEquals(Actmsg, Expmsg,"fail");
	soft.assertAll();	
	System.out.println(Actmsg);
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
