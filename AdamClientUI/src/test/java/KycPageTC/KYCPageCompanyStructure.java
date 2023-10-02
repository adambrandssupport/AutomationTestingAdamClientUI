package KycPageTC;

import java.awt.AWTException;
import java.io.IOException;
import org.testng.ITestResult;
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

public class KYCPageCompanyStructure extends BaseClass
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


@Test(dataProvider = "dataContainerKYCCompanyStructure", dataProviderClass = DataSupplierForKYCForm.class)
public void KYCFormFill
(        String Scenario,
	//	 String iCoName, String ipCoName, String iRAdd,String infCountry, String iCont, String iWbsite, String iDomain, String iEmp,
		String struType, String sOStr, String natureType, String sOBusi, String CntryOfInc, String dd1, String mm1, String yyyy1, String sRegNo, String sTrdLisc, String dd2, String mm2, String yyyy2, String sVat
) throws InterruptedException, IOException, AWTException
 {

//if (Scenario.equals("Positive"))
//{ 

//COMPANY INFO
//	kp.inpAClKYCformPageIRegCompName(iCoName);
//	Thread.sleep(2000);
//	kp.inpAClKYCformPageIParCompName(ipCoName);
//	Thread.sleep(2000);
//	kp.inpAClKYCformPageICompRegAddrs(iRAdd);
//	Thread.sleep(2000);
//	kp.selectAClKYCformPageStCountry(infCountry);  
//	Thread.sleep(2000);
//	kp.inpAClKYCformPageIRegCompConNo(iCont);
//	Thread.sleep(2000);
//	kp.inpAClKYCformPageIRegCompWSite(iWbsite);
//	Thread.sleep(2000);
//	kp.inpAClKYCformPageIRegCompDomain(iDomain);
//	Thread.sleep(2000);
//	kp.inpAClKYCformPageIRegCompEmployee(iEmp);
//	Thread.sleep(2000);
	
//COMPANY STRUCTURE	
	
		kp.selectAClKYCformPageStBusineStructure(struType); 
		if(struType.equals("Others"))
		{
		  kp.inpAClKYCformPageStOtherStructure(sOStr); 
		}
		Thread.sleep(500);
		kp.selectAClKYCformPageStBusineNature(natureType); 
		if(natureType.equals("Others"))
		{
		  kp.inpAClKYCformPageStOtherBusiness(sOBusi); 
		}
		Thread.sleep(500);
		kp.selectAClKYCformPageCountryOfIncorp(CntryOfInc);
		Thread.sleep(500);
		if(browserName.equalsIgnoreCase("Firefox"))
		{		
			kp.inpAClKYCformPageStDateOfIncorporationFirefox(dd1, mm1, yyyy1);
		}
		else
		{
			kp.inpAClKYCformPageStDateOfIncorporation(dd1, mm1, yyyy1);
		}
		
		Thread.sleep(500);
		kp.inpAClKYCformPageStRegNo(sRegNo);
		Thread.sleep(500);
	
		kp.inpAClKYCformPageStTradLiscNo(sTrdLisc);
		
		Thread.sleep(500);
		if(browserName.equalsIgnoreCase("Firefox"))
		{
		
		kp.inpAClKYCformPageStTradLiscExDateFirefox(dd2, mm2,yyyy2);
		}
		else
		{
			kp.inpAClKYCformPageStTradLiscExDate(dd2, mm2,yyyy2);
		}
		Thread.sleep(500);
		kp.inpAClKYCformPageStVatNo(sVat);
		Thread.sleep(500);	
		
	    kp.clickAClKYCformPageUSubmitBtn();
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