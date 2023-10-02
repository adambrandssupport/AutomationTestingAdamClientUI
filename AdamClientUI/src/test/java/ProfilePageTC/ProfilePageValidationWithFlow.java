package ProfilePageTC;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import KYCPage.AAdmnHomePage;
import KYCPage.AAdmnKYCFormTable;
import KYCPage.AAdmnKYCFormView;
import KYCPage.AClHomePage;
import KYCPage.AClKYCformPage;
import KYCPage.AClLoginPage;
import LibraryFiles.BaseClass;
import LibraryFiles.DataSupplierForKYCForm;
import LibraryFiles.UtilityClass;
import ProfilePage.AClProfilePage;
import net.bytebuddy.utility.RandomString;

public class ProfilePageValidationWithFlow extends BaseClass
{	
	AClHomePage hp;
	AClLoginPage lp;
    AClKYCformPage kp;
    AClProfilePage pp;
    AAdmnHomePage AdmnHP;
    AAdmnKYCFormTable AdmmKFT;
    AAdmnKYCFormView AdmmKV;
	SoftAssert soft;
	
@BeforeMethod
public void openBrowser() throws Throwable 
{
	initialiseBrowser();      //nullpointer Exception
	hp = new AClHomePage(driver);
	lp= new AClLoginPage(driver);
	kp=new AClKYCformPage(driver);
	pp=new AClProfilePage(driver);
	AdmnHP=new AAdmnHomePage(driver);
	AdmmKFT=new AAdmnKYCFormTable(driver);
	AdmmKV=new AAdmnKYCFormView(driver);
	soft=new SoftAssert();		
	hp.clickHomePageSignInButton();	
	lp.inpLoginPageEmail(UtilityClass.getPFData("EMailID"));
	lp.inpLoginPagePwd(UtilityClass.getPFData("Password"));
	lp.clickLoginPageLoginBtn();
}	
		

@Test(dataProvider = "dataContainerKYCForm", dataProviderClass = DataSupplierForKYCForm.class)public void KYCFormFill
(
		String Scenario, String iCoName, String ipCoName, String iRAdd,String infCountry, String iCont, String iWbsite, String iDomain, String iEmp,

		String struType, String sOStr, String natureType, String sOBusi, String CntryOfInc, String dd1,String mm1, String yyyy1, String sRegNo, String sTrdLisc, String dd2,String mm2, String yyyy2, String sVat, 
 
		String bName,String bankCountry, String bAdd, String bSwift, String bAccName,String curency, String bAccNo,String bIban, String bMangName,String bMangCountry, String bMangCont, String bCorBankName, String bCorBankSwift,

		String shrHldName1, String shrHldPrctg1, String shrCountry1, String shrHldName2, String shrHldPrctg2,String shrCountry2,
 
		String cPCName, String cPCDesign, String pcCountry, String cPCPhon, String cPCEmail,
 
		String cCFName, String cCFDesign, String ccfCountry, String cCFPhon, String cCFEmail,

		String cOpName, String cOpDesign, String opCountry, String cOpPhon, String cOpEmail,
 
		String cAccName, String cAccDesign, String acCountry, String cAccPhon, String cAccEmail,
 
		String cPrBusi, String cConPer,
		
		String tRFName1,String trfCountry1, String trfPhon1,String trEmail1, String tRFName2,String trfCountry2, String trfPhon2,String trEmail2,
		
		String upCoI, String upAoA, String upTLC, String upTRC, String upCP, String uURL,String upBR, String upPass,String upSign, String signName, String AdmnURL,String AdmnEmail, String AdmnPwd 
		
		) throws InterruptedException, IOException, AWTException
{
	//if (Scenario.equals("Positive"))
//	{ 

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
	Thread.sleep(100);

//COMPANY STRUCTURE	
	
	 kp.selectAClKYCformPageStBusineStructure(struType); 
	if(struType.equals("Others"))
	{
	  kp.inpAClKYCformPageStOtherStructure(sOStr); 
	}
	Thread.sleep(100);
	kp.selectAClKYCformPageStBusineNature(natureType); 
	if(natureType.equals("Others"))
	{
	  kp.inpAClKYCformPageStOtherBusiness(sOBusi); 
	}
	Thread.sleep(100);
	kp.selectAClKYCformPageCountryOfIncorp(CntryOfInc);
	Thread.sleep(100);
	if(browserName.equalsIgnoreCase("Firefox"))
	{		
		kp.inpAClKYCformPageStDateOfIncorporationFirefox(dd1, mm1, yyyy1);
	}
	else
	{
		kp.inpAClKYCformPageStDateOfIncorporation(dd1, mm1, yyyy1);
	}
	Thread.sleep(100);
	kp.inpAClKYCformPageStRegNo(sRegNo);
	Thread.sleep(100);
	kp.inpAClKYCformPageStTradLiscNo(sTrdLisc);
	Thread.sleep(100);
	if(browserName.equalsIgnoreCase("Firefox"))
	{
	
	kp.inpAClKYCformPageStTradLiscExDateFirefox(dd2, mm2,yyyy2);
	}
	else
	{
		kp.inpAClKYCformPageStTradLiscExDate(dd2, mm2,yyyy2);
	}
	Thread.sleep(100);
	kp.inpAClKYCformPageStVatNo(sVat);
	Thread.sleep(100);
//BankDetails
	kp.inpAClKYCformPageBankName(bName);
	Thread.sleep(100);
	kp.selectAClKYCformPageBankCountry(bankCountry);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAddr(bAdd);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankSwiftCod(bSwift);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAccName(bAccName);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankCurrency(curency, driver);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAccNo(bAccNo);		
	Thread.sleep(100);
	kp.inpAClKYCformPageBankIBan(bIban); 
	
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAccMangName(bMangName);
	
	Thread.sleep(100);
	kp.selectAClKYCformPageBankAccMangCountry(bMangCountry);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAccMangConct(bMangCont);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankCorrBnkName(bCorBankName);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankcorrBnkSwift(bCorBankSwift);
	Thread.sleep(100);
//Share Holders
	kp.inpAClKYCformPageShrHldName1(shrHldName1); 
	Thread.sleep(100);
	kp.inpAClKYCformPageShrHldPerctg1(shrHldPrctg1);
	Thread.sleep(100);
	kp.selectAClKYCformPageShrHldCountry1(shrCountry1);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageShrHldName2(shrHldName2);
	Thread.sleep(100);
	kp.inpAClKYCformPageShrHldPerctg2(shrHldPrctg2);
	Thread.sleep(100);
	kp.selectAClKYCformPageShrHldCountry2(shrCountry2);
	Thread.sleep(100);
	
	kp.clickAClKYCformPageShrHldPerctg2();
	Thread.sleep(100);
	kp.clickAClKYCformPageShrHldPerctg2();
	Thread.sleep(1000);
	kp.clickAClKYCformPageShrHldPerctg2();
	Thread.sleep(100);
//Contact Details
	kp.inpAClKYCformPageCPCName(cPCName);
	Thread.sleep(100);
	kp.inpAClKYCformPageCPCDesigna(cPCDesign);
	Thread.sleep(100);
	kp.selectAClKYCformPageCPCCountry(pcCountry);
	Thread.sleep(100);
	kp.inpAClKYCformPageCPCPhNo(cPCPhon);
	Thread.sleep(100);
	kp.inpAClKYCformPageCPCEmail(cPCEmail);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageCCFName(cCFName); 
	Thread.sleep(100);
	kp.inpAClKYCformPageCCFDesigna(cCFDesign);
	Thread.sleep(100);
	kp.selectAClKYCformPageCCFCountry(ccfCountry);
	Thread.sleep(100);
	kp.inpAClKYCformPageCCFPhNo(cCFPhon);
	Thread.sleep(100);
	kp.inpAClKYCformPageCCFEmail(cCFEmail);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageCOpDCName(cOpName); 
	Thread.sleep(100);
	kp.inpAClKYCformPageCOpDCDesigna(cOpDesign);
	Thread.sleep(100);
	kp.selectAClKYCformPageCOpDCCountry(opCountry);
	Thread.sleep(100);
	kp.inpAClKYCformPageCOpDCPhNo(cOpPhon);
	Thread.sleep(100);
	kp.inpAClKYCformPageCOpDCEmail(cOpEmail);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageCAcdName(cAccName);
	Thread.sleep(100);
	kp.inpAClKYCformPageCAcdDesigna(cAccDesign);
	Thread.sleep(100);
	kp.selectAClKYCformPageCAccCountry(acCountry);
	Thread.sleep(100);
	kp.inpAClKYCformPageCAcdphNo(cAccPhon);
	Thread.sleep(100);
	kp.inpAClKYCformPageCAcDEmail(cAccEmail);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageCProposedBusiness(cPrBusi); 
	Thread.sleep(100);
	kp.inpAClKYCformPageCConctPerson(cConPer);
	Thread.sleep(100);
	
//TradeReferance
	kp.inpAClKYCformPageTrdRefName1(tRFName1);
	Thread.sleep(100);
	kp.seleAClKYCformPageTrdRefCountry1(trfCountry1);	
	Thread.sleep(100);
	kp.inpAClKYCformPageTrdRefPhone1(trfPhon1);
	Thread.sleep(100);
	kp.inpAClKYCformPageTrdRefEmail1(trEmail1);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageTrdRefName2(tRFName2);
	Thread.sleep(100);
	kp.seleAClKYCformPageTrdRefCountry2(trfCountry2);
	Thread.sleep(100);
	kp.inpAClKYCformPageTrdRefPhone2(trfPhon2);
	Thread.sleep(100);
	kp.inpAClKYCformPageTrdRefEmail2(trEmail2);
	Thread.sleep(100);
	
//Upload Document
	
	Thread.sleep(100);
	kp.uplodkAClKYCformPageUpldCertOfIncorp(upCoI);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldAoA(upAoA);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldTrdLiscCert(upTLC);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldTaxRegi(upTRC);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldCompProfile(upCP);
	Thread.sleep(100);
	kp.inpAClKYCformPageUpldURL(uURL);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldBankRef(upBR);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldPassport(upPass);
	Thread.sleep(100);
		
	Thread.sleep(100);
	kp.clickAClKYCformPageUiDeclrare(); 
	Thread.sleep(100);
	
    kp.uplodAClKYCformPageUpldSign(upSign);
    kp.inpAClKYCformPageUpldAuthoSignName(signName);
	kp.clickAClKYCformPageUSubmitBtn();
	Thread.sleep(2000);
	
//KYC View Before Submit	
    UtilityClass.drawBorder(driver, kp.rtnAClKYCformPageCBPopUpKycViewBeforeSubmit());
	Thread.sleep(3000);
	boolean ViewBeforeSubmitPopUp =kp.rtnAClKYCformPageCBPopUpKycViewBeforeSubmit().isDisplayed();
	Thread.sleep(3000);
	System.out.println(ViewBeforeSubmitPopUp);

	kp.clickAClKYCformPageVBSPopUpIReview();
	Thread.sleep(3000);
    soft.assertTrue(ViewBeforeSubmitPopUp, "not displayed");	
	Thread.sleep(3000);
	kp.clickAClKYCformPageVBSPopUpSubmitBtn();
	Thread.sleep(3000);
	//try{
	//	driver.switchTo().alert().accept();
	//   }
	//catch(NoSuchElementException e)
	//{
	//	System.out.println("NoSuchElementException");
	//}

//Client profile Page	
	boolean result = hp.getHomePageClientProfileLogo().isDisplayed();
	UtilityClass.drawBorder(driver, hp.getHomePageClientProfileLogo());
	soft.assertTrue(result, "Client Profile Logo not displayed");
	System.out.println(result);
	Thread.sleep(100);
	hp.getHomePageClientProfileLogo().click();
	
	Thread.sleep(500);
	String CompName = pp.rtnAClProfilePageCompName();
	soft.assertEquals(CompName, iCoName);
	Reporter.log(CompName+"====="+iCoName,true);
	Thread.sleep(500);
	String CompEmail = pp.rtnAClProfilePageCompEmail();
	soft.assertEquals(CompEmail, UtilityClass.getPFData("EMailID"));
	Reporter.log(CompEmail+"====="+UtilityClass.getPFData("EMailID"),true);
	Thread.sleep(500);
	String CompPhone = pp.rtnAClProfilePageCompPhone();
	soft.assertTrue(CompPhone.contains(iCont),"CompPhone dont match");
	Reporter.log(CompPhone+"====="+iCont,true);
	Thread.sleep(500);
	String CompRegDate = pp.rtnAClProfilePageCompRegDate();
	String s1 = String.valueOf(dd1);
	if (s1.length()==1)
	{
		 s1="0"+s1;
	}
	String s2 = String.valueOf(mm1);
	if (s2.length()==1)
	{
		 s2="0"+s2;
	}
	String s3 = String.valueOf(yyyy1);
	String s=s1+s2+s3;
	soft.assertTrue(CompRegDate.contains(s),"CompRegDate dont match");
	
	Reporter.log(CompRegDate+"====="+s,true);
	Thread.sleep(500);
	String TrdLiscNo = pp.rtnAClProfilePageTrdLiscNo();
	soft.assertEquals(TrdLiscNo, sTrdLisc);
	Reporter.log(TrdLiscNo+"====="+sTrdLisc,true);
	Thread.sleep(500);
	String CompAdd = pp.rtnAClProfilePageCompAdd();
	soft.assertEquals(CompAdd, iRAdd);
	Reporter.log(CompAdd+"====="+iRAdd,true);
	soft.assertAll();
}

@AfterMethod(enabled =false)
public void CaptureFailedTCSS(ITestResult s1) throws IOException, InterruptedException
{
	String rs= RandomString.make(2);
if(s1.getStatus()==ITestResult.FAILURE)
{
	UtilityClass.captureSS(driver, rs);
}
    Thread.sleep(2000);  
    pp.clickAClProfilePageLogOutBtn();   
}

@AfterClass
public void logOut() throws IOException
{
 //  driver.close();
}
}