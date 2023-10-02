package HomePageTC;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import HomePage.AClAboutUsPage;
import HomePage.AClContactUsPage;
import HomePage.AClHomePage;
import HomePage.AClLoginPage;
import HomePage.AClSignInPage;
import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;
import net.bytebuddy.utility.RandomString;

public class HP6TC extends BaseClass
{
	AClHomePage hp;
	AClAboutUsPage as;
	AClContactUsPage cs;
	AClSignInPage lp;
	AClLoginPage rp;
	SoftAssert soft;
@BeforeClass
public void openBrowser() throws IOException, InterruptedException
{
	initialiseBrowser();
	hp = new AClHomePage(driver);
	as = new AClAboutUsPage(driver);
	cs = new AClContactUsPage(driver);
	lp = new AClSignInPage(driver);
	rp = new AClLoginPage(driver);
	soft = new SoftAssert();
	Thread.sleep(2000);
}

@Test(priority=1, enabled= true)
public void adamBrandLogoDisplayed() throws IOException,InterruptedException 
{	
	Thread.sleep(2000);
    WebElement logo = hp.HomePageAdamBrandsLogoPresent();
    UtilityClass.drawBorder(driver, logo);
    Thread.sleep(2000);
    boolean result = logo.isDisplayed(); 
    soft.assertTrue(result,"logo is not present");  
    soft.assertAll();
}
@Test(priority=2, enabled= true)
public void aboutUsButton() throws IOException,InterruptedException 
{	
	Thread.sleep(100);
	hp.clickHomePageAboutUsButton();
	Thread.sleep(100);
	UtilityClass.drawBorder(driver, as.AClAboutUsPageIntro());
	Thread.sleep(2000);
	String ExpResult = UtilityClass.getTD(1, 0);
    String ActResult = as.AClAboutUsPageIntro().getText();
  	Reporter.log(ExpResult+"==>"+ActResult, true);   
    soft.assertEquals(ExpResult, ActResult,"Login page not opened");
    soft.assertAll();
	driver.navigate().back();
	
}
@Test(priority=3, enabled= true)
public void contactUsButton() throws IOException,InterruptedException 
{	
	Thread.sleep(100);
	hp.clickHomePageContactUsButton();
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

@Test(priority=4, enabled= true)
public void signInButton() throws IOException,InterruptedException 
{	
	Thread.sleep(100);
	hp.clickHomePageSignInButton();
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
@Test(priority=5, enabled= true)
public void signUpButton() throws IOException,InterruptedException 
{	
	Thread.sleep(100);
	hp.clickHomePageSignUpButton();
	Thread.sleep(100);
	UtilityClass.drawBorder(driver, rp.rtnAClSignUpPageWebElement());
	Thread.sleep(2000);
	String ExpResult = UtilityClass.getTD(1, 4);
    String ActResult = rp.rtnAClSignUpPageWebElement().getText();
    Reporter.log(ExpResult+"==>"+ActResult, true); 
    soft.assertEquals(ExpResult, ActResult,"registration page not opened");
    soft.assertAll();
	driver.navigate().back();
}
@Test(priority=6, enabled= true)
public void Navigation() throws IOException,InterruptedException 
{	
	Thread.sleep(100);
	hp.clickHomePageAboutUsButton();
	Thread.sleep(100);
	hp.clickHomePageContactUsButton();
	Thread.sleep(100);
	driver.navigate().back();
	UtilityClass.drawBorder(driver, as.AClAboutUsPageIntro());
	Thread.sleep(2000);
	String ExpResult = UtilityClass.getTD(1, 0);
    String ActResult = as.AClAboutUsPageIntro().getText();
  	Reporter.log(ExpResult+"==>"+ActResult, true);   
    soft.assertEquals(ExpResult, ActResult,"Login page not opened");
	
    Thread.sleep(100);
    driver.navigate().back();
    WebElement logo = hp.HomePageAdamBrandsLogoPresent();
    UtilityClass.drawBorder(driver, logo);
    Thread.sleep(2000);
    boolean result = logo.isDisplayed(); 
    soft.assertTrue(result,"logo is not present"); 
    
    Thread.sleep(100);
    driver.navigate().refresh();
    Thread.sleep(100);
    driver.navigate().refresh();
    Thread.sleep(100);
    
    driver.navigate().forward();
    UtilityClass.drawBorder(driver, as.AClAboutUsPageIntro());
	Thread.sleep(2000);
	String ExpResult1 = UtilityClass.getTD(1, 0);
    String ActResult1 = as.AClAboutUsPageIntro().getText();
  	Reporter.log(ExpResult1+"==>"+ActResult1, true);   
    soft.assertEquals(ExpResult1, ActResult1,"Login page not opened");
   
    Thread.sleep(100);
    driver.navigate().forward();
    UtilityClass.drawBorder(driver, cs.AClContactUsPageSendMsg());
	Thread.sleep(2000);
	String ExpResult2 = UtilityClass.getTD(1, 1);
    String ActResult2 = cs.AClContactUsPageSendMsg().getText();
  	Reporter.log(ExpResult2+"==>"+ActResult2, true);   
    soft.assertEquals(ExpResult2, ActResult2,"Login page not opened");
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
