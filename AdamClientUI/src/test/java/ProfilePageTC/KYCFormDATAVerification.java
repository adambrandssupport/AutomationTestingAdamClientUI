package ProfilePageTC;

import java.awt.AWTException;
import java.io.IOException;
import java.io.ObjectInputFilter.Status;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

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
import ProfilePage.AClViewKYCProfilePage;
import net.bytebuddy.utility.RandomString;

public class KYCFormDATAVerification extends BaseClass
{	
	AClHomePage hp;
	AClLoginPage lp;
    AClKYCformPage kp;
    AClProfilePage pp;
    AClViewKYCProfilePage kf;
    AAdmnHomePage AdmnHP;
    AAdmnKYCFormTable AdmmKFT;
    AAdmnKYCFormView AdmmKV;
	SoftAssert soft;
    ExtentReports extent;
	ExtentSparkReporter exsp;
@BeforeMethod
public void openBrowser() throws Throwable 
{
	initialiseBrowser();      //nullpointer Exception
	extent= new ExtentReports();
	exsp= new ExtentSparkReporter("C:\\Users\\PC\\git\\AEClientUITest\\Adambrands\\test-output\\ExtentReport\\Report.html");
	extent.attachReporter(exsp);
	extent.flush();
	extent.createTest("KYCFormFill");
//	.log(Status.INFO, "Info 1")
//  .log(Status.PASS, "pass")
//	.log(Status.WARNING, "warning")
//	.log(Status.FAIL, "fail")
//	.log(Status.SKIP), "skip");
	hp = new AClHomePage(driver);
	lp= new AClLoginPage(driver);
	kp=new AClKYCformPage(driver);
	pp=new AClProfilePage(driver);
	kf=new AClViewKYCProfilePage(driver);
	AdmnHP=new AAdmnHomePage(driver);
	AdmmKFT=new AAdmnKYCFormTable(driver);
	AdmmKV=new AAdmnKYCFormView(driver);
	soft=new SoftAssert();	
	
	
	hp.clickHomePageSignInButton();	
	lp.inpLoginPageEmail(UtilityClass.getPFData("EMailID"));
	lp.inpLoginPagePwd(UtilityClass.getPFData("Password"));
	lp.clickLoginPageLoginBtn();
}	
		

@Test(dataProvider = "dataContainerKYCForm", dataProviderClass = DataSupplierForKYCForm.class)
public void KYCFormFill
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
	extent.createTest("KYCFormFill");
//	.log(Status.INFO "info 1");
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
	Thread.sleep(15000);
	
	String st=String.valueOf(ViewBeforeSubmitPopUp);
	Reporter.log(st+"POPup displayed");

	soft.assertTrue(ViewBeforeSubmitPopUp, "pop up not displayed");	
	Thread.sleep(2000);	
	kp.clickAClKYCformPageVBSPopUpIReview();
	Thread.sleep(2000);
   	
	kp.clickAClKYCformPageVBSPopUpSubmitBtn();
	Thread.sleep(2000);
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
	String re= String.valueOf(result);
	Reporter.log(re);
	Thread.sleep(100);
	hp.getHomePageClientProfileLogo().click();
	pp.clickAClProfilePageKycFormBtn();
	
//Client View KYC Form	

	Thread.sleep(100);
	soft.assertEquals(iCoName, kf.getKYCFormPageCompName());
	Reporter.log(iCoName+"==>"+kf.getKYCFormPageCompName(),true);
	Thread.sleep(100);
	soft.assertEquals(ipCoName, kf.getKYCFormPagePaCompName());
	Reporter.log(ipCoName+"==>"+kf.getKYCFormPagePaCompName(),true);
	Thread.sleep(100);
	soft.assertEquals(iRAdd, kf.getKYCFormPageCompAdd());
	Reporter.log(iRAdd+"==>"+kf.getKYCFormPageCompAdd(),true);
	Thread.sleep(100);
    soft.assertTrue(kf.getKYCFormPageCompPhone().contains(iCont), "Company phone no. dont match");
	Reporter.log(iCont+"==>"+kf.getKYCFormPageCompPhone(),true);
	Thread.sleep(100);
	soft.assertEquals(UtilityClass.getPFData("EMailID"), kf.getKYCFormPageCompeMail());
	Reporter.log(UtilityClass.getPFData("EMailID")+"==>"+kf.getKYCFormPageCompeMail(),true);
	Thread.sleep(100);
	soft.assertEquals(iWbsite, kf.getKYCFormPageCompWebsite());
	Reporter.log(iWbsite+"==>"+kf.getKYCFormPageCompWebsite(),true);
	Thread.sleep(100);
	soft.assertEquals(iDomain, kf.getKYCFormPageCompDomain());
	Reporter.log(iDomain+"==>"+kf.getKYCFormPageCompDomain(),true);
	Thread.sleep(100);
	soft.assertEquals(iEmp, kf.getKYCFormPageCompEmpNo());
	Reporter.log(iEmp+"==>"+kf.getKYCFormPageCompEmpNo(),true);
	Thread.sleep(200);
	//Business Structure
	soft.assertEquals(struType, kf.getKYCFormPageCompStrBussStru());
	Reporter.log(struType+"==>"+kf.getKYCFormPageCompStrBussStru(),true);
	Thread.sleep(500);
	soft.assertEquals(natureType, kf.getKYCFormPageCompStrBussNature());
	Reporter.log(natureType+"==>"+kf.getKYCFormPageCompStrBussNature(),true);
	Thread.sleep(500);
	soft.assertEquals(CntryOfInc, kf.getKYCFormPageCompStrCountryofIncorp());
	Reporter.log(CntryOfInc+"==>"+kf.getKYCFormPageCompStrCountryofIncorp(),true);
			Thread.sleep(500);
	String s1 	= String.valueOf(dd1);
	String s2 = String.valueOf(mm1);
	if (s1.length()==1 && s2.length()==1)
	{
		 s1="0"+s1;
	}
	
	if (s2.length()==1)
	{
		 s2="0"+s2;
	}
	Thread.sleep(500);
	String s3 = String.valueOf(yyyy1);
	String s=s1+s2+s3;
	
	Thread.sleep(100);
	soft.assertEquals(s, kf.getKYCFormPageCompStrDateofIncorp());
	Reporter.log(s+"==>"+kf.getKYCFormPageCompStrDateofIncorp(),true);
	Thread.sleep(500);
	soft.assertEquals(sRegNo, kf.getKYCFormPageCompStrRegNo());
	Reporter.log(sRegNo+"==>"+kf.getKYCFormPageCompStrRegNo(),true);
	Thread.sleep(100);
	soft.assertEquals(sTrdLisc, kf.getKYCFormPageCompStrTrdLiscNo());
	Reporter.log(sTrdLisc+"==>"+kf.getKYCFormPageCompStrTrdLiscNo(),true);
	Thread.sleep(100);
	String s4 = String.valueOf(dd2);
	if (s4.length()==1)
	{
		 s4="0"+s4;
	}
	String s5 = String.valueOf(mm2);
	if (s5.length()==1)
	{
		 s5="0"+s5;
	}
	String s6 = String.valueOf(yyyy2);
	Thread.sleep(100);
	String s7=s4+s5+s6;
	Thread.sleep(100);
	soft.assertEquals(s7, kf.getKYCFormPageCompStrTrdLiscExpDate());
	Reporter.log(s7+"==>"+kf.getKYCFormPageCompStrTrdLiscExpDate(),true);
	Thread.sleep(100);
	soft.assertEquals(sVat, kf.getKYCFormPageCompStrVatNo());
	Reporter.log(sVat+"==>"+kf.getKYCFormPageCompStrVatNo(),true);
	Thread.sleep(100);
	
//Bank Details
	Thread.sleep(100);
	soft.assertEquals(bName, kf.getKYCFormPageBnkName());
	Reporter.log(bName+"==>"+kf.getKYCFormPageBnkName(),true);
	Thread.sleep(100);
	soft.assertEquals(bankCountry, kf.getKYCFormPageBnkCountry());
	Reporter.log(bankCountry+"==>"+kf.getKYCFormPageBnkCountry(),true);
	Thread.sleep(100);
	soft.assertEquals(bAdd, kf.getKYCFormPageBnkAdd());
	Reporter.log(bAdd+"==>"+kf.getKYCFormPageBnkAdd(),true);
	Thread.sleep(100);
	soft.assertEquals(bSwift, kf.getKYCFormPageBnkSwiftCode());
	Reporter.log(bSwift+"==>"+kf.getKYCFormPageBnkSwiftCode(),true);
	Thread.sleep(100);
	soft.assertEquals(bAccName, kf.getKYCFormPageBnkAccName());
	Reporter.log(bAccName+"==>"+kf.getKYCFormPageBnkAccName(),true);
	Thread.sleep(100);
	soft.assertEquals(curency, kf.getKYCFormPageBnkCurrency());
	Reporter.log(curency+"==>"+kf.getKYCFormPageBnkCurrency(),true);
	Thread.sleep(100);
	soft.assertEquals(bAccNo, kf.getKYCFormPageBnkAccNo());
	Reporter.log(bAccNo+"==>"+kf.getKYCFormPageBnkAccNo(),true);	
	Thread.sleep(100);
	soft.assertEquals(bIban, kf.getKYCFormPageBnkIban());
	Reporter.log(bIban+"==>"+kf.getKYCFormPageBnkIban(),true);
	Thread.sleep(100);
	soft.assertEquals(bMangName, kf.getKYCFormPageBnkManName());
	Reporter.log(bMangName+"==>"+kf.getKYCFormPageBnkManName(),true);
	Thread.sleep(100);
	soft.assertEquals(bMangCont, kf.getKYCFormPageBnkManPhone());
	Reporter.log(bMangCont+"==>"+kf.getKYCFormPageBnkManPhone(),true);
	Thread.sleep(100);
	soft.assertEquals(bCorBankName, kf.getKYCFormPageBnkCorreBnkName());
	Reporter.log(bCorBankName+"==>"+kf.getKYCFormPageBnkCorreBnkName(),true);
	Thread.sleep(100);
	soft.assertEquals(bCorBankSwift, kf.getKYCFormPageBnkCorreBnkSwiftCode());
	Reporter.log(bCorBankSwift+"==>"+kf.getKYCFormPageBnkCorreBnkSwiftCode(),true);
//Shareholder Details	
	Thread.sleep(100);
	soft.assertEquals(shrHldName1, kf.getKYCFormPageShrName1());
	Reporter.log(shrHldName1+"==>"+kf.getKYCFormPageShrName1(),true);
	Thread.sleep(100);
	soft.assertEquals(shrHldPrctg1, kf.getKYCFormPageShrPercentage1());
	Reporter.log(shrHldPrctg1+"==>"+kf.getKYCFormPageShrPercentage1(),true);
	Thread.sleep(100);
	soft.assertEquals(shrCountry1, kf.getKYCFormPageShrCountry1());
	Reporter.log(shrCountry1+"==>"+kf.getKYCFormPageShrCountry1(),true);
	Thread.sleep(100);
	soft.assertEquals(shrHldName2, kf.getKYCFormPageShrName2());
	Reporter.log(shrHldName2+"==>"+kf.getKYCFormPageShrName2(),true);
	Thread.sleep(100);
	soft.assertEquals(shrHldPrctg2, kf.getKYCFormPageShrPercentage2());
	Reporter.log(shrHldPrctg2+"==>"+kf.getKYCFormPageShrPercentage2(),true);
	Thread.sleep(100);
	soft.assertEquals(shrCountry2, kf.getKYCFormPageShrCountry2());
	Reporter.log(shrCountry2+"==>"+kf.getKYCFormPageShrCountry2(),true);

	
	//Contact Details
	Thread.sleep(100);
	soft.assertEquals(cPCName, kf.getKYCFormPagePCName());
	Reporter.log(cPCName+"==>"+kf.getKYCFormPagePCName(),true);	
	Thread.sleep(100);
	soft.assertEquals(cPCDesign, kf.getKYCFormPagePCDesign());
	Reporter.log(cPCDesign+"==>"+kf.getKYCFormPagePCDesign(),true);	
	Thread.sleep(100);
	soft.assertTrue(kf.getKYCFormPagePCPhone().contains(cPCPhon), "PCD PHONE dont match");
	Reporter.log(cPCPhon+"==>"+kf.getKYCFormPagePCPhone(),true);	
	Thread.sleep(100);
	soft.assertEquals(cPCEmail, kf.getKYCFormPagePCEmail());
	Reporter.log(cPCEmail+"==>"+kf.getKYCFormPagePCEmail(),true);
	
	Thread.sleep(100);
	soft.assertEquals(cOpName, kf.getKYCFormPageODName());
	Reporter.log(cOpName+"==>"+kf.getKYCFormPageODName(),true);	
	Thread.sleep(100);
	soft.assertEquals(cOpDesign, kf.getKYCFormPageODDesign());
	Reporter.log(cOpDesign+"==>"+kf.getKYCFormPageODDesign(),true);	
	Thread.sleep(100);
	soft.assertTrue(kf.getKYCFormPageODPhone().contains(cOpPhon), "cOP PHONE dont match");
	Reporter.log(cOpPhon+"==>"+kf.getKYCFormPageODPhone(),true);
	Thread.sleep(100);
	soft.assertEquals(cOpEmail, kf.getKYCFormPageODEmail());
	Reporter.log(cOpEmail+"==>"+kf.getKYCFormPageODEmail(),true);
	
	Thread.sleep(100);
	soft.assertEquals(cAccName, kf.getKYCFormPageADName());
	Reporter.log(cAccName+"==>"+kf.getKYCFormPageADName(),true);	
	Thread.sleep(100);
	soft.assertEquals(cAccDesign, kf.getKYCFormPageADDesign());
	Reporter.log(cAccDesign+"==>"+kf.getKYCFormPageADDesign(),true);	
	Thread.sleep(100);
	soft.assertTrue(kf.getKYCFormPageADPhone().contains(cAccPhon), "aD PHONE dont match");
	Reporter.log(cAccPhon+"==>"+kf.getKYCFormPageADPhone(),true);
	Thread.sleep(100);
	soft.assertEquals(cAccEmail, kf.getKYCFormPageADEmail());
	Reporter.log(cAccEmail+"==>"+kf.getKYCFormPageADEmail(),true);
	
	Thread.sleep(100);
	soft.assertEquals(cCFName, kf.getKYCFormPageCFDName());
	Reporter.log(cCFName+"==>"+kf.getKYCFormPageCFDName(),true);
	Thread.sleep(100);
	soft.assertEquals(cCFDesign, kf.getKYCFormPageCFDDesign());
	Reporter.log(cCFDesign+"==>"+kf.getKYCFormPageCFDDesign(),true);	
	Thread.sleep(100);
	soft.assertTrue(kf.getKYCFormPageCFDPhone().contains(cCFPhon), "cfD PHONE dont match");
	Reporter.log(cCFPhon+"==>"+kf.getKYCFormPageCFDPhone(),true);
	Thread.sleep(100);
	soft.assertEquals(cCFEmail, kf.getKYCFormPageCFDEmail());
	Reporter.log(cCFEmail+"==>"+kf.getKYCFormPageCFDEmail(),true);
	
	Thread.sleep(100);
	soft.assertEquals(cPrBusi, kf.getKYCFormPagePropoBussi());
	Reporter.log(cPrBusi+"==>"+kf.getKYCFormPagePropoBussi(),true);
	Thread.sleep(100);
	soft.assertEquals(cConPer, kf.getKYCFormPageContPersonAE());
	Reporter.log(cConPer+"==>"+kf.getKYCFormPageContPersonAE(),true);
	
	//Trade Reference
	Thread.sleep(100);
	soft.assertEquals(tRFName1, kf.getKYCFormPageTRName1());
	Reporter.log(tRFName1+"==>"+kf.getKYCFormPageTRName1(),true);
	Thread.sleep(100);
	//soft.assertTrue(kf.getKYCFormPageTRPhone1().contains(trfPhon1),"trf phone 1 did not matched");
	Reporter.log(trfPhon1+"==>"+kf.getKYCFormPageTRPhone1(),true);	
	Thread.sleep(100);
	soft.assertEquals(trEmail1, kf.getKYCFormPageTREmail1());
	Reporter.log(trEmail1+"==>"+kf.getKYCFormPageTREmail1(),true);
	
	Thread.sleep(100);
	soft.assertEquals(tRFName2, kf.getKYCFormPageTRName2());
	Reporter.log(tRFName2+"==>"+kf.getKYCFormPageTRName2(),true);
	Thread.sleep(100);
	//soft.assertTrue(kf.getKYCFormPageTRPhone2().contains(trfPhon2),"trf phone 2 did not matched");
	Reporter.log(trfPhon2+"==>"+kf.getKYCFormPageTRPhone2(),true);	
	Thread.sleep(100);
	soft.assertEquals(trEmail2, kf.getKYCFormPageTREmail2());
	Reporter.log(trEmail2+"==>"+kf.getKYCFormPageTREmail2(),true);
	
//Upload Document Section
	Thread.sleep(100);
	soft.assertTrue(kf.clickKYCFormPageViewCertOfInc(),"CertOfInc not displayed");
	Reporter.log("CertOfInc is displayed = "+kf.clickKYCFormPageViewCertOfInc(),true);
	
	Thread.sleep(100);
	soft.assertTrue(kf.clickKYCFormPageViewAoA(),"AoA not displayed");
	Reporter.log("AoA is displayed = "+kf.clickKYCFormPageViewAoA(),true);
	
	Thread.sleep(100);
	soft.assertTrue(kf.clickKYCFormPageViewTrL(),"TLC not displayed");
	Reporter.log("TLC is displayed = "+kf.clickKYCFormPageViewTrL(),true);
	
	Thread.sleep(100);
	soft.assertTrue(kf.clickKYCFormPageViewTaxReg(),"TRC not displayed");
	Reporter.log("TRC is displayed = "+kf.clickKYCFormPageViewTaxReg(),true);
	
	Thread.sleep(100);
	soft.assertTrue(kf.clickKYCFormPageViewCP(),"CP not displayed");
	Reporter.log("CP is displayed = "+kf.clickKYCFormPageViewCP(),true);
	
	
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
	extent.flush();
  //driver.close();
	
}
}
