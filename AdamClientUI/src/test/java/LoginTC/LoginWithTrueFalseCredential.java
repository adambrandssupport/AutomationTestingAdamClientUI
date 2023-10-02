package LoginTC;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
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
import SignIN.AClHomePage;
import SignIN.AClLoginPage;
import net.bytebuddy.utility.RandomString;

public class LoginWithTrueFalseCredential extends BaseClass
{
	AClHomePage hp;
	AClLoginPage lp;
	SoftAssert soft;
@BeforeMethod
public void openBrowser() throws IOException, InterruptedException
{
	initialiseBrowser();
	hp = new AClHomePage(driver);
	lp= new AClLoginPage(driver);
	soft = new SoftAssert();
	Thread.sleep(3000);
	hp.clickHomePageSignInButton();
}

@Test(dataProvider = "dataContainerTFLogin", dataProviderClass = DataSupplierForLoginPage.class)
public void signIn(String Scenario, String ID, String pwd, String Expmsg) throws IOException, InterruptedException
{
	
	lp.inpLoginPageEmail(ID);
	lp.inpLoginPagePwd(pwd);
	lp.clickLoginPageRemMeCheckbox();	
	lp.clickLoginPageLoginBtn();

	

	if(Scenario.equals("BothTrue"))
	{
		try
		{
	    UtilityClass.drawBorder(driver, lp.rtnEleLogInSuccesstMsg());
	    String actMsg=lp.rtnEleLogInSuccesstMsg().getAttribute("innerHTML"); 
	    Reporter.log(Expmsg+"==>"+actMsg, true);
		soft.assertEquals(actMsg, Expmsg, "Fail");	
		soft.assertAll();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();	
		}
		catch(NoAlertPresentException e)
		{
			e.printStackTrace();
			Reporter.log("NoAlertPresentException Handled");
		}
	}
	else if(Scenario.equals("TrueEmailFalsePW"))
	{
	    UtilityClass.drawBorder(driver, lp.rtnEleWrongPwdMsg());
	    String actMsg=lp.rtnEleWrongPwdMsg().getAttribute("innerHTML");
	    Reporter.log(Expmsg+"==>"+actMsg, true);
		soft.assertEquals(actMsg, Expmsg, "Fail");	
		soft.assertAll();
	}
	else if(Scenario.equals("FalseEmailTruePW"))
	{
	   UtilityClass.drawBorder(driver, lp.rtnEleNotRegMsg());
	   String actMsg=lp.rtnEleNotRegMsg().getAttribute("innerHTML");
	   Reporter.log(Expmsg+"==>"+actMsg, true);
	   soft.assertEquals(actMsg, Expmsg, "Fail"); 
	   soft.assertAll();
	}
	else if(Scenario.equals("BothFalse"))
	{
	   UtilityClass.drawBorder(driver, lp.rtnEleNotRegMsg());
	   String actMsg=lp.rtnEleNotRegMsg().getAttribute("innerHTML");
	   Reporter.log(Expmsg+"==>"+actMsg, true);
	   soft.assertEquals(actMsg, Expmsg, "Fail");
	   soft.assertAll();
	}	
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