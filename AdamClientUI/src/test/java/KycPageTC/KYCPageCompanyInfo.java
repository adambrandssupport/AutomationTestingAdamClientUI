package KycPageTC;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import KYCPage.AClHomePage;
import KYCPage.AClKYCformPage;
import KYCPage.AClLoginPage;
import LibraryFiles.BaseClass;
import LibraryFiles.DataSupplierForKYCForm;
import LibraryFiles.UtilityClass;
import net.bytebuddy.utility.RandomString;

public class KYCPageCompanyInfo extends BaseClass
{	
	AClHomePage hp;
	AClLoginPage lp;
    AClKYCformPage kp;
	SoftAssert soft;
	
@BeforeMethod
public void openBrowser() throws Throwable 
{
	initialiseBrowser();      //nullpointer Exception
	hp = new AClHomePage(driver);
	lp= new AClLoginPage(driver);
	kp=new AClKYCformPage(driver);
	soft=new SoftAssert();
		
	hp.clickHomePageSignInButton();	
	lp.inpLoginPageEmail(UtilityClass.getPFData("EMailID"));
	lp.inpLoginPagePwd(UtilityClass.getPFData("Password"));
	lp.clickLoginPageLoginBtn();
}


@Test(dataProvider = "dataContainerKYCCompanyInfo", dataProviderClass = DataSupplierForKYCForm.class)
public void KYCFormFill
(
		String Scenario, String iCoName, String ipCoName, String iRAdd,String infCountry, String iCont, String iWbsite, String iDomain, String iEmp
		
) throws InterruptedException, IOException, AWTException
 {
	//if (Scenario.equals("Positive"))
    //{ 

//COMPANY INFO
	kp.inpAClKYCformPageIRegCompName(iCoName);
	Thread.sleep(100);
	kp.inpAClKYCformPageIParCompName(ipCoName);
	Thread.sleep(100);
	kp.inpAClKYCformPageICompRegAddrs(iRAdd);
	Thread.sleep(100);
	kp.selectAClKYCformPageStCountry(infCountry);  
	Thread.sleep(100);
	kp.inpAClKYCformPageIRegCompConNo(iCont);
	Thread.sleep(100);
	kp.inpAClKYCformPageIRegCompWSite(iWbsite);
	Thread.sleep(100);
	kp.inpAClKYCformPageIRegCompDomain(iDomain);
	Thread.sleep(100);
	kp.inpAClKYCformPageIRegCompEmployee(iEmp);
	Thread.sleep(2000);
//  kp.clickAClKYCformPageUSubmitBtn();
	
	boolean result1 = kp.inpAClKYCformPageIRegCompNameEr();
	soft.assertFalse(result1);
	
	boolean result2 = kp.inpAClKYCformPageIParCompNameEr();
	soft.assertFalse(result2);
	
	boolean result3 = kp.inpAClKYCformPageICompRegAddrsEr();
	soft.assertFalse(result3);
	
	boolean result4 = kp.inpAClKYCformPageIRegCompConNoEr();
	soft.assertFalse(result4);
	
	boolean result5 = kp.inpAClKYCformPageIRegCompWSiteEr();
	soft.assertFalse(result5);
		
	boolean result6 = kp.inpAClKYCformPageIRegCompDomainEr();
	soft.assertFalse(result6);
	
	boolean result7 = kp.inpAClKYCformPageIRegCompEmployeeEr();
	soft.assertFalse(result7);
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