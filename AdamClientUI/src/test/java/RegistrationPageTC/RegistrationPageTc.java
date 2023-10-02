package RegistrationPageTC;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import LibraryFiles.BaseClass;
import LibraryFiles.DataSupplierForRegistrationPage;
import LibraryFiles.UtilityClass;
import RegistrationPage.AClHomePage;
import RegistrationPage.AClLoginPage;
import RegistrationPage.AClRegistrationPage;
import net.bytebuddy.utility.RandomString;

public class RegistrationPageTc extends BaseClass
{
	AClHomePage hp;
	AClRegistrationPage rp;
	AClLoginPage lp;
	SoftAssert soft;
@BeforeMethod
public void openBrowser() throws IOException, InterruptedException
{
	initialiseBrowser();
	hp= new AClHomePage(driver);
	lp= new AClLoginPage(driver);
	rp=new AClRegistrationPage(driver);
	soft= new SoftAssert();
	hp.clickHomePageSignUpButton();
    Thread.sleep(2000);
}
@Test(priority=2)
public void SignInLink() throws IOException, InterruptedException
{	
  Thread.sleep(500);
  rp.clickAClRegiPageSignInLink();
  Thread.sleep(500);
  UtilityClass.drawBorder(driver, lp.rtnAClSignUpPageWebElement());
  Thread.sleep(500);
  String ExpResult = "Hello ! Welcome Back";
  String ActResult = lp.rtnAClSignUpPageWebElement().getText();
  Reporter.log(ExpResult+"===>"+ActResult, true);
  soft.assertEquals(ExpResult,ActResult);
  soft.assertAll();
  Thread.sleep(500);
  driver.navigate().back();
}
@Test(priority=1, dataProvider = "dataContainerRegistrationPage", dataProviderClass = DataSupplierForRegistrationPage.class)
public void Registration(String scenario, String compName, String email, String cntryCode, String phone, String pWD, String rePWD) throws IOException, InterruptedException
{	
	rp.inpAClRegiPageCompanyName(compName);
	rp.inpAClRegiPageEmail(email);
	rp.seleAClRegiPageCountryCode(cntryCode);
	rp.inpAClRegiPagePhoneNo(phone);
	rp.inpAClRegiPagePwd(pWD);
	Thread.sleep(500);
	rp.clickAClRegiPageTogglePwd();
	Thread.sleep(500);
	rp.inpAClRegiPageRetypePwd(rePWD);
	rp.clickAClRegiPageSignUpBtn();
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