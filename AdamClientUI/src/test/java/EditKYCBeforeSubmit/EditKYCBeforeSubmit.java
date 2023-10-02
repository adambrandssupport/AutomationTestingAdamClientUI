package EditKYCBeforeSubmit;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import EditKYCBeforeSubmitPage.AClHomePage;
import EditKYCBeforeSubmitPage.AClKYCformPage;
import EditKYCBeforeSubmitPage.AClLoginPage;
import EditKYCBeforeSubmitPage.AClProfilePage;
import LibraryFiles.BaseClass;
import LibraryFiles.DataSupplierForKYCForm;
import LibraryFiles.UtilityClass;
import net.bytebuddy.utility.RandomString;

public class EditKYCBeforeSubmit extends BaseClass
{	
	AClHomePage hp;
	AClLoginPage lp;
    AClKYCformPage kp;
    AClProfilePage pp;
	SoftAssert soft;
	
@BeforeMethod
public void openBrowser() throws Throwable 
{
	initialiseBrowser();      //nullpointer Exception
	hp = new AClHomePage(driver);
	lp= new AClLoginPage(driver);
	kp=new AClKYCformPage(driver);
	pp=new AClProfilePage(driver);
	soft=new SoftAssert();		
	
}	
		

@Test(dataProvider = "dataContainerEditKYC", dataProviderClass = DataSupplierForKYCForm.class)
public void KYCFormFill
(
		String Scenario, String iCoName, String ipCoName, String iRAdd,String infCountry, String iCont, String iWbsite, String iDomain, String iEmp,

		String struType, String sOStr, String natureType, String sOBusi, String CntryOfInc, String ddmm1, String sRegNo, String sTrdLisc, String ddmm, String sVat, 
 
		String bName,String bankCountry, String bAdd, String bSwift, String bAccName,String curency, String bAccNo,String bIban, String bMangName,String bMangCountry, String bMangCont, String bCorBankName, String bCorBankSwift,

		String shrHldName1, String shrHldPrctg1, String shrCountry1, String shrHldName2, String shrHldPrctg2,String shrCountry2,
 
		String cPCName, String cPCDesign, String pcCountry, String cPCPhon, String cPCEmail,
 
		String cCFName, String cCFDesign, String ccfCountry, String cCFPhon, String cCFEmail,

		String cOpName, String cOpDesign, String opCountry, String cOpPhon, String cOpEmail,
 
		String cAccName, String cAccDesign, String acCountry, String cAccPhon, String cAccEmail,
 
		String cPrBusi, String cConPer,
		
		String tRFName1,String trfCountry1, String trfPhon1,String trEmail1, String tRFName2,String trfCountry2, String trfPhon2,String trEmail2,
		
		String upCoI, String upAoA, String upTLC, String upTRC, String upCP, String uURL,String upBR, String upPass,String upSign, String signName, 
		
		
		String ScenarioE, String iCoNameE, String ipCoNameE, String iRAddE,String infCountryE, String iContE, String iWbsiteE, String iDomainE, String iEmpE,

		String struTypeE, String sOStrE, String natureTypeE, String sOBusiE, String CntryOfIncE, String ddmm1E, String sRegNoE, String sTrdLiscE, String ddmmE, String sVatE, 
 
		String bNameE,String bankCountryE, String bAddE, String bSwiftE, String bAccNameE,String curencyE, String bAccNoE,String bIbanE, String bMangNameE,String bMangCountryE, String bMangContE, String bCorBankNameE, String bCorBankSwiftE,

		String shrHldName1E, String shrHldPrctg1E, String shrCountry1E, String shrHldName2E, String shrHldPrctg2E,String shrCountry2E,
 
		String cPCNameE, String cPCDesignE, String pcCountryE, String cPCPhonE, String cPCEmailE,
 
		String cCFNameE, String cCFDesignE, String ccfCountryE, String cCFPhonE, String cCFEmailE,

		String cOpNameE, String cOpDesignE, String opCountryE, String cOpPhonE, String cOpEmailE,
 
		String cAccNameE, String cAccDesignE, String acCountryE, String cAccPhonE, String cAccEmailE,
 
		String cPrBusiE, String cConPerE,
		
		String tRFName1E,String trfCountry1E, String trfPhon1E,String trEmail1E, String tRFName2E,String trfCountry2E, String trfPhon2E,String trEmail2E,
		
		String upCoIE, String upAoAE, String upTLCE, String upTRCE, String upCPE, String uURLE,String upBRE, String upPassE,String upSignE, String signNameE 

		) throws Throwable
{
	hp.clickHomePageSignInButton();	
	lp.inpLoginPageEmail(UtilityClass.getPFData("EMailID"));
	lp.inpLoginPagePwd(UtilityClass.getPFData("Password"));
	lp.clickLoginPageLoginBtn();
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
	kp.inpAClKYCformPageIRegCompConNo(driver,iCont);
	Thread.sleep(100);
    kp.inpAClKYCformPageIRegCompWSite(iWbsite);
    Thread.sleep(100);
	kp.inpAClKYCformPageIRegCompDomain(iDomain);
	Thread.sleep(100);
	kp.inpAClKYCformPageIRegCompEmployee(iEmp);
	Thread.sleep(100);
//	}
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
	kp.inpAClKYCformPageStDateOfIncorporation(ddmm1);
	Thread.sleep(100);
	kp.inpAClKYCformPageStRegNo(sRegNo);
	Thread.sleep(100);
	kp.inpAClKYCformPageStTradLiscNo(sTrdLisc);
	Thread.sleep(100);
	kp.inpAClKYCformPageStTradLiscExDate(ddmm);
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
	
//boolean emailIsTakenPopUp= kp.rtnAClKYCformPageUemailIsTakenMsgWindow().isDisplayed();
	
    //  boolean emailIsTakenMsg= kp.rtnAClKYCformPageUemailIsTakenMsg().isDisplayed();
	//  String result1= kp.rtnAClKYCformPageUemailIsTakenMsg().getText();
	//  System.out.println(kp.rtnAClKYCformPageUemailIsTakenMsg().getText());
    //  UtilityClass.drawBorder(driver, kp.rtnAClKYCformPageUemailIsTakenMsg());
		
    //  soft.assertFalse(emailIsTakenMsg,"Email address is already taken. Msg");
	//  soft.assertAll();
	
//KYC View Before Submit	
    UtilityClass.drawBorder(driver, kp.rtnAClKYCformPageCBPopUpKycViewBeforeSubmit());
	Thread.sleep(5000);
	boolean ViewBeforeSubmitPopUp =kp.rtnAClKYCformPageCBPopUpKycViewBeforeSubmit().isDisplayed();
	Thread.sleep(2000);
	soft.assertTrue(ViewBeforeSubmitPopUp, "not displayed");
	String s1= String.valueOf(ViewBeforeSubmitPopUp);
	Reporter.log("View Before Submit PopUp is displayed = "+s1,true);
	kp.clickAClKYCformPageVBSPopUpEditBtn();

				

	kp.inpAClKYCformPageIRegCompName(iCoNameE);
	Thread.sleep(100);
	kp.inpAClKYCformPageIParCompName(ipCoNameE);
	Thread.sleep(100);
	kp.inpAClKYCformPageICompRegAddrs(iRAddE);
	Thread.sleep(100);
	kp.selectAClKYCformPageStCountry(infCountryE);  
	Thread.sleep(100);
	kp.inpAClKYCformPageIRegCompConNo(driver, iContE);
	Thread.sleep(100);
    kp.inpAClKYCformPageIRegCompWSite(iWbsiteE);
    Thread.sleep(100);
	kp.inpAClKYCformPageIRegCompDomain(iDomainE);
	Thread.sleep(100);
	kp.inpAClKYCformPageIRegCompEmployee(iEmpE);
	Thread.sleep(100);
//	}
//COMPANY STRUCTURE	
	
	 kp.selectAClKYCformPageStBusineStructure(struTypeE); 
	if(struType.equals("Others"))
	{
	  kp.inpAClKYCformPageStOtherStructure(sOStrE); 
	}
	Thread.sleep(100);
	kp.selectAClKYCformPageStBusineNature(natureTypeE); 
	if(natureType.equals("Others"))
	{
	  kp.inpAClKYCformPageStOtherBusiness(sOBusiE); 
	}
	Thread.sleep(100);
	kp.selectAClKYCformPageCountryOfIncorp(CntryOfIncE);
	Thread.sleep(100);
	kp.inpAClKYCformPageStDateOfIncorporation(ddmm1E);
	Thread.sleep(100);
	kp.inpAClKYCformPageStRegNo(sRegNoE);
	Thread.sleep(100);
	kp.inpAClKYCformPageStTradLiscNo(sTrdLiscE);
	Thread.sleep(100);
	kp.inpAClKYCformPageStTradLiscExDate(ddmmE);
	Thread.sleep(100);
	kp.inpAClKYCformPageStVatNo(sVatE);
	Thread.sleep(100);
//BankDetails
	kp.inpAClKYCformPageBankName(bNameE);
	Thread.sleep(100);
	kp.selectAClKYCformPageBankCountry(bankCountryE);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAddr(bAddE);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankSwiftCod(bSwiftE);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAccName(bAccNameE);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankCurrency(curencyE, driver);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAccNo(bAccNoE);		
	Thread.sleep(100);
	kp.inpAClKYCformPageBankIBan(bIbanE); 
	
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAccMangName(bMangNameE);
	
	Thread.sleep(100);
	kp.selectAClKYCformPageBankAccMangCountry(bMangCountryE);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankAccMangConct(bMangContE);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankCorrBnkName(bCorBankNameE);
	Thread.sleep(100);
	kp.inpAClKYCformPageBankcorrBnkSwift(bCorBankSwiftE);
	Thread.sleep(100);
//Share Holders
	kp.inpAClKYCformPageShrHldName1(shrHldName1E); 
	Thread.sleep(100);
	kp.inpAClKYCformPageShrHldPerctg1(shrHldPrctg1E);
	Thread.sleep(100);
	kp.selectAClKYCformPageShrHldCountry1(shrCountry1E);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageShrHldName2(shrHldName2E);
	Thread.sleep(100);
	kp.inpAClKYCformPageShrHldPerctg2(shrHldPrctg2E);
	Thread.sleep(100);
	kp.selectAClKYCformPageShrHldCountry2(shrCountry2E);
	Thread.sleep(100);
	
	kp.clickAClKYCformPageShrHldPerctg2();
	Thread.sleep(100);
	kp.clickAClKYCformPageShrHldPerctg2();
	Thread.sleep(1000);
	kp.clickAClKYCformPageShrHldPerctg2();
	Thread.sleep(100);
//Contact Details
	kp.inpAClKYCformPageCPCName(cPCNameE);
	Thread.sleep(100);
	kp.inpAClKYCformPageCPCDesigna(cPCDesignE);
	Thread.sleep(100);
	kp.selectAClKYCformPageCPCCountry(pcCountryE);
	Thread.sleep(100);
	kp.inpAClKYCformPageCPCPhNo(cPCPhonE);
	Thread.sleep(100);
	kp.inpAClKYCformPageCPCEmail(cPCEmailE);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageCCFName(cCFNameE); 
	Thread.sleep(100);
	kp.inpAClKYCformPageCCFDesigna(cCFDesignE);
	Thread.sleep(100);
	kp.selectAClKYCformPageCCFCountry(ccfCountryE);
	Thread.sleep(100);
	kp.inpAClKYCformPageCCFPhNo(cCFPhonE);
	Thread.sleep(100);
	kp.inpAClKYCformPageCCFEmail(cCFEmailE);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageCOpDCName(cOpNameE); 
	Thread.sleep(100);
	kp.inpAClKYCformPageCOpDCDesigna(cOpDesignE);
	Thread.sleep(100);
	kp.selectAClKYCformPageCOpDCCountry(opCountryE);
	Thread.sleep(100);
	kp.inpAClKYCformPageCOpDCPhNo(cOpPhonE);
	Thread.sleep(100);
	kp.inpAClKYCformPageCOpDCEmail(cOpEmailE);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageCAcdName(cAccNameE);
	Thread.sleep(100);
	kp.inpAClKYCformPageCAcdDesigna(cAccDesignE);
	Thread.sleep(100);
	kp.selectAClKYCformPageCAccCountry(acCountryE);
	Thread.sleep(100);
	kp.inpAClKYCformPageCAcdphNo(cAccPhonE);
	Thread.sleep(100);
	kp.inpAClKYCformPageCAcDEmail(cAccEmailE);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageCProposedBusiness(cPrBusiE); 
	Thread.sleep(100);
	kp.inpAClKYCformPageCConctPerson(cConPerE);
	Thread.sleep(100);
	
//TradeReferance
	kp.inpAClKYCformPageTrdRefName1(tRFName1E);
	Thread.sleep(100);
	kp.seleAClKYCformPageTrdRefCountry1(trfCountry1E);	
	Thread.sleep(100);
	kp.inpAClKYCformPageTrdRefPhone1(trfPhon1E);
	Thread.sleep(100);
	kp.inpAClKYCformPageTrdRefEmail1(trEmail1E);
	Thread.sleep(100);
	
	kp.inpAClKYCformPageTrdRefName2(tRFName2E);
	Thread.sleep(100);
	kp.seleAClKYCformPageTrdRefCountry2(trfCountry2E);
	Thread.sleep(100);
	kp.inpAClKYCformPageTrdRefPhone2(trfPhon2E);
	Thread.sleep(100);
	kp.inpAClKYCformPageTrdRefEmail2(trEmail2E);
	Thread.sleep(100);
	
//Upload Document
	
	Thread.sleep(100);
	kp.uplodkAClKYCformPageUpldCertOfIncorp(upCoIE);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldAoA(upAoAE);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldTrdLiscCert(upTLCE);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldTaxRegi(upTRCE);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldCompProfile(upCPE);
	Thread.sleep(100);
	kp.inpAClKYCformPageUpldURL(uURLE);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldBankRef(upBRE);
	Thread.sleep(100);
	kp.uplodAClKYCformPageUpldPassport(upPassE);
	Thread.sleep(100);
		
	Thread.sleep(100);
	kp.clickAClKYCformPageUiDeclrare(); 
	Thread.sleep(100);
	
    kp.uplodAClKYCformPageUpldSign(upSignE);
    kp.inpAClKYCformPageUpldAuthoSignName(signNameE);
	kp.clickAClKYCformPageUpdateBtn();
	Thread.sleep(2000);
	
	//kp.clickAClKYCformPageVBSPopUpIReview();
	Thread.sleep(5000);
	kp.clickAClKYCformPageVBSPopUpEditBtn();
	Thread.sleep(5000);

//Client profile Page	
	boolean result = hp.getHomePageClientProfileLogo().isDisplayed();
	UtilityClass.drawBorder(driver, hp.getHomePageClientProfileLogo());
	soft.assertTrue(result, "Client Profile Logo not displayed");
	System.out.println(result);
	Thread.sleep(100);
	hp.getHomePageClientProfileLogo().click();
	
	Thread.sleep(2000);
	pp.clickAClProfilePageKycFormBtn();
	UtilityClass.drawBorder(driver, pp.rtnAClProfilePageKycFormDetails());
	Thread.sleep(2000);

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