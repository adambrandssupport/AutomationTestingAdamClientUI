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

public class CreateMultipleRegistration extends BaseClass
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

@Test(priority=1, dataProvider = "dataContainerRegistrationPage", dataProviderClass = DataSupplierForRegistrationPage.class)
public void Registration(String scenario, String compName, String email, String cntryCode, String phone, String pWD, String rePWD) throws IOException, InterruptedException
{	
	rp.inpAClRegiPageCompanyName(compName);
	Thread.sleep(100);
	rp.inpAClRegiPageEmail(email);
	Thread.sleep(200);
	rp.seleAClRegiPageCountryCode(cntryCode);
	Thread.sleep(200);
	rp.inpAClRegiPagePhoneNo(phone);
	Thread.sleep(100);
	rp.inpAClRegiPagePwd(pWD);
	Thread.sleep(100);
	rp.clickAClRegiPageTogglePwd();
	Thread.sleep(200);
	rp.inpAClRegiPageRetypePwd(rePWD);
	Thread.sleep(100);
	rp.clickAClRegiPageSignUpBtn();
	boolean result = lp.rtnAClSignUpPageWebElement().isDisplayed();
	soft.assertTrue(result,"User not created");
	String s1 = String.valueOf(result);
	Reporter.log("User created= "+s1,true);
	//soft.assertAll();
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