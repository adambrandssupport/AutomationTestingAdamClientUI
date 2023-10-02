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
import LibraryFiles.DataSupplierForLoginPage;
import LibraryFiles.UtilityClass;
import SignIN.AClForgotPwdPage;
import SignIN.AClHomePage;
import SignIN.AClLoginPage;
import SignIN.AClRegistrationPage;
import net.bytebuddy.utility.RandomString;

public class NegativeTC extends BaseClass
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
	hp = new AClHomePage(driver);
	lp= new AClLoginPage(driver);
	fp= new AClForgotPwdPage(driver);
	rp=new AClRegistrationPage(driver);
	soft=new SoftAssert();	
	hp.clickHomePageSignInButton();
}

@Test(dataProvider = "dataContainerForNegativeTC", dataProviderClass = DataSupplierForLoginPage.class)
public void negativeTC(String Scenario, String EID, String pwd, String Expmsg1, String Expmsg2) throws IOException, InterruptedException
{		
	
	lp.inpLoginPageEmail(EID);
	lp.inpLoginPagePwd(pwd);	
	lp.clickLoginPageLoginBtn();
   if(Scenario.equals("BothBlank"))
	{
	    Thread.sleep(3000);
	    UtilityClass.drawBorder(driver, lp.rtnInvalidEmailMsg());
	    UtilityClass.drawBorder(driver, lp.rtnPwdReqMsg());
	    String actMsg1=lp.rtnInvalidEmailMsg().getAttribute("innerHTML");
	    String actMsg2=lp.rtnPwdReqMsg().getAttribute("innerHTML");	
		Reporter.log(Expmsg1+"==>"+actMsg1, true);
		Reporter.log(Expmsg2+"==>"+actMsg2, true);
		soft.assertEquals(actMsg1, Expmsg1);
		soft.assertAll();
		soft.assertEquals(actMsg2, Expmsg2);
		soft.assertAll();
	}
   else if(Scenario.equals("PwdBlank"))
	{	  
	   Thread.sleep(3000);
	   UtilityClass.drawBorder(driver, lp.rtnPwdReqMsg());
	   String actMsg1=lp.rtnPwdReqMsg().getAttribute("innerHTML");
	   soft.assertEquals(actMsg1, Expmsg1); 
	   Reporter.log(Expmsg1+"==>"+actMsg1, true);
	   Thread.sleep(3000);
	   soft.assertAll();
	}

	else if(Scenario.equals("PwdCaseSensitive"))
	{
	   Thread.sleep(3000);
	   UtilityClass.drawBorder(driver, lp.rtnEleWrongPwdMsg());
	   String actMsg1=lp.rtnEleWrongPwdMsg().getAttribute("innerHTML");
	   soft.assertEquals(actMsg1, Expmsg1);	  
	   Reporter.log(Expmsg1+"==>"+actMsg1, true);
	   Thread.sleep(3000);
	   soft.assertAll();
	}
	else if(Scenario.equals("EmailBlank"))
	{
	   UtilityClass.drawBorder(driver, lp.rtnInvalidEmailMsg());
	   String actMsg1=lp.rtnInvalidEmailMsg().getAttribute("innerHTML");
	   soft.assertEquals(actMsg1, Expmsg1);	
	   Reporter.log(Expmsg1+"==>"+actMsg1, true);
	   Thread.sleep(5000);
	   soft.assertAll();
	}

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