 package EditKYCBeforeSubmitPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibraryFiles.UtilityClass;

public class AClKYCformPage 
{
	
//*Company Info*//
@FindBy(xpath="(//input[@placeholder='Company Name'])[1]")private WebElement regCompName;
@FindBy(xpath="//div[4]//div[1]//div[1]//p[2]")private WebElement regCompNameEr;
@FindBy(xpath="//input[@placeholder='Parent Company']")private WebElement parCompName;
@FindBy(xpath="//div[4]//div[1]//div[2]//p[2]")private WebElement parCompNameEr;
@FindBy(xpath="//input[@placeholder='Address']")private WebElement compRegAddrs;
@FindBy(xpath="//div[4]//div[1]//div[3]//p[2]")private WebElement compRegAddrsEr;
@FindBy(xpath="(//select[@class='PhoneInputCountrySelect'])[1]")private WebElement seleInfoCountry;
@FindBy(xpath="(//input[@type='tel'])[1]")private WebElement contNo;
@FindBy(xpath="//div[4]//div[1]//div[4]//div[1]//p")private WebElement contNoEr;
@FindBy(xpath="//input[@placeholder='Email']")private WebElement cEmail;
@FindBy(xpath="//input[@placeholder='Email']")private WebElement cEmailEr;
@FindBy(xpath="//input[@placeholder='URL']")private WebElement coSite;
@FindBy(xpath="//div[4]//div[1]//div[6]//p[2]")private WebElement coSiteEr;
@FindBy(xpath="//input[@placeholder='Domain Name']")private WebElement coDomain;
@FindBy(xpath="//div[4]//div[1]//div[7]//p[2]")private WebElement coDomainEr;
@FindBy(xpath="//input[@placeholder='Numbers of Employees']")private WebElement empNo;
@FindBy(xpath="//div[4]//div[1]//div[8]//p[2]']")private WebElement empNoEr;

//*Company Structure*//
@FindBy(xpath="//select[@name='option']")private WebElement seleStru;
@FindBy(xpath="//input[@placeholder='Structure']")private WebElement strOther;
@FindBy(xpath="//select[@name='optionNature']")private WebElement seleNature;
@FindBy(xpath="//input[@placeholder='Business']")private WebElement strBusinessOther;
@FindBy(xpath="//button[@id='rfs-btn']")private WebElement selectCountryofIncorpBtn;
@FindBy(xpath="//input[@placeholder='Search']")private WebElement typeCountryofIncorp;
@FindBy(xpath="//li")private List<WebElement> listCountryofIncorp;
@FindBy(xpath="//input[@name='date_of_incorporation']")private WebElement stDoInco ;
@FindBy(xpath="//input[@placeholder='Company Registartion No']")private WebElement regNo;
@FindBy(xpath="//input[@placeholder='Trade License Number']")private WebElement tradLiscNo;
@FindBy(xpath="//input[@name='trade_license_expiry_date']")private WebElement trLEDate;
@FindBy(xpath="//input[@name='VAT']")private WebElement vatNo;

//*Bank Details*//
@FindBy(xpath="//input[@placeholder='Bank Name']")private WebElement bankName;

@FindBy(xpath="(//button[@id='rfs-btn'])[2]")private WebElement selectCountryOfBank;
@FindBy(xpath="//input[@placeholder='Search']")private WebElement typeCountryofBank;
@FindBy(xpath="//li")private List<WebElement> listCountryofBank;

@FindBy(xpath="//input[@placeholder='Bank Branch Address']")private WebElement bankAddr;
@FindBy(xpath="//input[@placeholder='Swift Code']")private WebElement bankSwiftCod;
@FindBy(xpath="//input[@placeholder='Account Name']")private WebElement accName;

@FindBy(xpath="(//button[@id='rfs-btn'])[2]")private WebElement selectCurrency;
@FindBy(xpath="//input[@id='react-select-2-input']")private WebElement typeCurrency;
@FindBy(xpath="//li")private List<WebElement> listOfCurrency;

@FindBy(xpath="//input[@placeholder='Account Number']")private WebElement accNo;
@FindBy(xpath="//input[@placeholder='IBAN/ABA']")private WebElement iBan;
@FindBy(xpath="//input[@name='back_account_managers_name']")private WebElement bnkAccMangName;
@FindBy(xpath="(//select[@class='PhoneInputCountrySelect'])[2]")private WebElement seleBnkAccManCountry;
@FindBy(xpath="(//input[@type='tel'])[2]")private WebElement bnkAccMangConct;
@FindBy(xpath="//input[@name='correspondent_bank_name']")private WebElement corrBnkName;
@FindBy(xpath="//input[@name='correspondent_bank_swift_code']")private WebElement corrBnkSwift;

//*Share Holder*//
@FindBy(xpath="//input[@name='shareholder_name']")private WebElement shrHldName1;
@FindBy(xpath="(//input[@name='shareholder_persentage'])[1]")private WebElement shrHldPerctg1;
@FindBy(xpath="(//button[@type='button'])[3]")private WebElement shrHldCountry1;
@FindBy(xpath="//input[@placeholder='Search']")private WebElement typeShrCountry1;
@FindBy(xpath="//li")private List<WebElement> listShrCountry1;

@FindBy(xpath="//input[@name='shareholder_name2']")private WebElement shrHldName2;
@FindBy(xpath="//input[@name='shareholder_persentage2']")private WebElement shrHldPerctg2;
@FindBy(xpath="(//button[@type='button'])[4]")private WebElement shrHldCountry2;
@FindBy(xpath="//input[@placeholder='Search']")private WebElement typeShrCountry2;
@FindBy(xpath="//li")private List<WebElement> listShrCountry2;

@FindBy(xpath="//i[@class='fa-sharp fa-solid fa-circle-plus']")private WebElement addShrHldBtn;
//@FindBy(xpath="//input[@name='shareholder_name3']")private WebElement shrHldName3;
//@FindBy(xpath="//input[@name='shareholder_persentage3']")private WebElement shrHldPerctg3;
//@FindBy(xpath="//input[@name='shareholder_name4']")private WebElement shrHldName4;
//@FindBy(xpath="//input[@name='shareholder_persentage4']")private WebElement shrHldPerctg4;

//@FindBy(xpath="")private WebElement shrAddBtn;

//@FindBy(xpath="//input[@name='shareholder_name5']")private WebElement shrHldName5;
//@FindBy(xpath="//input[@name='shareholder_persentage5']")private WebElement shrHldPerctg5;

//*Contact Details*//
@FindBy(xpath="//input[@name='primary_D_name']")private WebElement pCName;
@FindBy(xpath="//input[@name='primary_D_designation']")private WebElement pCDesigna;
@FindBy(xpath="(//select[@class='PhoneInputCountrySelect'])[3]")private WebElement seleCDPCCountry;
@FindBy(xpath="(//input[@type='tel'])[3]")private WebElement pCphNo;
@FindBy(xpath="//input[@name='primary_D_email']")private WebElement pCEmail;

@FindBy(xpath="//input[@name='credit_finance_D_name']")private WebElement cfdName;
@FindBy(xpath="//input[@name='credit_finance_D_designation']")private WebElement cfdDesigna;
@FindBy(xpath="(//select[@class='PhoneInputCountrySelect'])[4]")private WebElement seleCFCountry;
@FindBy(xpath="(//input[@type='tel'])[4]")private WebElement cfdphNo;
@FindBy(xpath="//input[@name='credit_finance_D_email']")private WebElement cfdEmail;

@FindBy(xpath="//input[@name='operations_D_name']")private WebElement opDCName;
@FindBy(xpath="//input[@name='operations_D_designation']")private WebElement opDCDesigna;
@FindBy(xpath="(//select[@class='PhoneInputCountrySelect'])[5]")private WebElement seleOpDCountry;
@FindBy(xpath="(//input[@type='tel'])[5]")private WebElement opDCPhNo;
@FindBy(xpath="//input[@name='operations_D_email']")private WebElement opDCEmail;

@FindBy(xpath="//input[@name='accounting_D_name']")private WebElement acdName;
@FindBy(xpath="//input[@name='accounting_D_designation']")private WebElement acdDesigna;
@FindBy(xpath="(//select[@class='PhoneInputCountrySelect'])[6]")private WebElement seleAccCountry;
@FindBy(xpath="(//input[@type='tel'])[6]")private WebElement acdphNo;
@FindBy(xpath="//input[@name='accounting_D_email']")private WebElement acdEmail;

@FindBy(xpath="//input[@name='FZE_proposed_business']")private WebElement proposBusiness;
@FindBy(xpath="//input[@name='FZE_contact_person']")private WebElement conctPerson;

//*Trade Referance*//
@FindBy(xpath="//input[@name='trade_name1']")private WebElement tRName1;
@FindBy(xpath="(//select[@class='PhoneInputCountrySelect'])[7]")private WebElement seleTrRefCountry1;
@FindBy(xpath="(//input[@id='phone'])[7]")private WebElement tRPhone1;
@FindBy(xpath="(//input[@name='email_OR_phone1'])[1]")private WebElement tREmail1;

@FindBy(xpath="//input[@name='trade_name2']")private WebElement tRName2;
@FindBy(xpath="(//select[@class='PhoneInputCountrySelect'])[8]")private WebElement seleTrRefCountry2;
@FindBy(xpath="(//input[@id='phone'])[8]")private WebElement tRPhone2;
@FindBy(xpath="(//input[@name='email_OR_phone2'])[1]")private WebElement tREmail2;

//*Upload Document*//
@FindBy(xpath="(//input[@type='file'])[1]")private WebElement certOfIncorp;
@FindBy(xpath="(//input[@type='file'])[2]")private WebElement articleOfAssociation;
@FindBy(xpath="(//input[@type='file'])[3]")private WebElement tradeLiscCert;
@FindBy(xpath="(//input[@type='file'])[4]")private WebElement taxRegiCert;
@FindBy(xpath="(//input[@type='file'])[5]")private WebElement compProfile;
@FindBy(xpath="(//input[@type='file'])[6]")private WebElement bankRefLetter;
@FindBy(xpath="(//input[@type='file'])[7]")private WebElement passportAuthoSignatory;

@FindBy(xpath="//input[@name='website_URL']")private WebElement upldURL;
@FindBy(xpath="//input[@type='checkbox']")private WebElement iDeclare;
@FindBy(xpath="//input[@name='signature']")private WebElement upldSign;

@FindBy(xpath="//input[@name='Authorized_Signatory_Name']")private WebElement AuthoSignName;
@FindBy(xpath="//button[text()='Submit']")private WebElement submitBtn;
@FindBy(xpath="//div[text()='Email address is already taken.']")private WebElement emailIsTakenMsg;
@FindBy(xpath="//div[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--error Toastify__toast--close-on-click']")private WebElement emailIsTakenWindow;
@FindBy(xpath="//h1[text()='Please Review KYC Form Before Submitting']")private WebElement kycViewbeforeSubmit;
@FindBy(xpath="(//input[@type='checkbox'])[2]")private WebElement kycViewPopUpiReview;
@FindBy(xpath="//button[text()='Edit']")private WebElement kycViewPopUpEditBtn;
@FindBy(xpath="//button[text()='Submit']")private WebElement kycViewPopUpSubmitBtn;

@FindBy(xpath="//button[text()='Update']")private WebElement UpdateBtn;

Actions act;
Robot rb;
public AClKYCformPage(WebDriver driver) throws Throwable
{
	PageFactory.initElements(driver, this);
	this.act=new Actions(driver);
	this.rb=new Robot();
}
//*Company Info*//
  public void inpAClKYCformPageIRegCompName(String regCoName)
   {
	regCompName.clear();
	regCompName.sendKeys(regCoName);	
   }

  public boolean inpAClKYCformPageIRegCompNameEr()
  {  
		return regCompNameEr.isDisplayed();
  }
  public void inpAClKYCformPageIParCompName(String parCoName)
   {
	  parCompName.clear();
	parCompName.sendKeys(parCoName);
   }
  public boolean inpAClKYCformPageIParCompNameEr()
  {
	  return parCompNameEr.isDisplayed();
  }
  public void inpAClKYCformPageICompRegAddrs(String coAdd)
   {
	  compRegAddrs.clear();
	compRegAddrs.sendKeys(coAdd);
   }
  public boolean inpAClKYCformPageICompRegAddrsEr()
  {
	  return compRegAddrsEr.isDisplayed();
  }
  public void selectAClKYCformPageStCountry(String infoCountry) throws IOException
  {
	  UtilityClass.selectCountryList(seleInfoCountry, infoCountry);
  }
  public void inpAClKYCformPageIRegCompConNo(WebDriver driver, String regConNoN) throws IOException, InterruptedException
   {
	  compRegAddrs.click();
      Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
	  contNo.sendKeys(regConNoN);
   }
  public boolean inpAClKYCformPageIRegCompConNoEr()
  {
	  return contNoEr.isDisplayed();
  }
  public void inpAClKYCformPageIRegCompEmail(String comEmail)
   {
	  cEmail.clear();
	  cEmail.sendKeys(comEmail);
   }

  public void inpAClKYCformPageIRegCompWSite(String compSite)
  {
	  coSite.clear();
	  coSite.sendKeys(compSite);
  }
  public boolean inpAClKYCformPageIRegCompWSiteEr()
  {
	  return coSiteEr.isDisplayed();
  }
  public void inpAClKYCformPageIRegCompDomain(String comDomain)
  {
	  coDomain.clear();
	  coDomain.sendKeys(comDomain);
  }
  public boolean inpAClKYCformPageIRegCompDomainEr()
  {
	  return coDomainEr.isDisplayed();
  }
  public void inpAClKYCformPageIRegCompEmployee(String comEmp)
  {
	  empNo.clear();
	  empNo.sendKeys(comEmp);
  }
  public boolean inpAClKYCformPageIRegCompEmployeeEr()
  {
	  return empNoEr.isDisplayed();
  }
  
//Company Structure*//
  
  public void selectAClKYCformPageStBusineStructure(String StructureType) throws IOException
  {
	  UtilityClass.selectBusinessList(seleStru, StructureType);
  }
  
  public void inpAClKYCformPageStOtherStructure(String otherStructure)
  {
	  strOther.clear();
	  strOther.sendKeys(otherStructure);
  }
  public void selectAClKYCformPageStBusineNature(String naturType)
  {
	  UtilityClass.selectBusinessNatureList(seleNature, naturType);
  }
  
 public void inpAClKYCformPageStOtherBusiness(String otherBusiness)
  {
	 strBusinessOther.clear();
	  strBusinessOther.sendKeys(otherBusiness);
  }
  public void selectAClKYCformPageCountryOfIncorp(String cntryOfIncorp) throws InterruptedException
  {
	  selectCountryofIncorpBtn.click();
      Thread.sleep(500);
	  typeCountryofIncorp.sendKeys(cntryOfIncorp);
	  Thread.sleep(500);
	  
	 for(WebElement s:listCountryofIncorp)
	  {
		//System.out.println(s.getText());
		  if(s.getText().equalsIgnoreCase(cntryOfIncorp))
		  {
			  s.click();
		  }
		  else 
		  {
    		  rb.keyPress(KeyEvent.VK_TAB);	
    		  rb.delay(500);
	      }	  
	  }	
  }
 public void inpAClKYCformPageStDateOfIncorporation(String ddmm1 ) throws AWTException
 {
	
	 stDoInco.sendKeys(ddmm1);
	 rb.delay(500);
	 rb.keyPress(KeyEvent.VK_RIGHT);
	 rb.delay(100); // Optional delay to hold the key pressed
	 rb.keyRelease(KeyEvent.VK_RIGHT);
	 rb.delay(100);
     rb.keyPress(KeyEvent.VK_1);
     rb.keyPress(KeyEvent.VK_9);   
     rb.keyPress(KeyEvent.VK_8);
     rb.keyPress(KeyEvent.VK_4);
	 //trLEDate.sendKeys("30-08-2023");
 }
 public void inpAClKYCformPageStRegNo(String RegiNo)
 {
	 regNo.clear();
	  regNo.sendKeys(RegiNo);
 }
 public void inpAClKYCformPageStTradLiscNo(String tradeLisc)
 {
	 tradLiscNo.clear();
	  tradLiscNo.sendKeys(tradeLisc);
 } 

 public void inpAClKYCformPageStTradLiscExDate(String ddmm ) throws AWTException
 {
	 trLEDate.sendKeys(ddmm);
	// Robot rb=new Robot();
	 rb.delay(500);
	 rb.keyPress(KeyEvent.VK_RIGHT);
	 rb.delay(100); // Optional delay to hold the key pressed
	 rb.keyRelease(KeyEvent.VK_RIGHT);
	 rb.delay(100);
     rb.keyPress(KeyEvent.VK_2);
     rb.keyPress(KeyEvent.VK_0);
     rb.keyPress(KeyEvent.VK_2);
     rb.keyPress(KeyEvent.VK_5);
	 //trLEDate.click();
	 //trLEDate.sendKeys("30-08-2023"); 
  // this.act.moveToElement(trLEDate).moveByOffset(427, 0).click().perform();
 }
 public void inpAClKYCformPageStVatNo(String compvatNo)
 {
	 vatNo.clear();
	  vatNo.sendKeys(compvatNo);
 }
 
//*Bank Details*//
 public void inpAClKYCformPageBankName(String bnkName)
 {
	 bankName.clear();
     bankName.sendKeys(bnkName);
 }
 public void selectAClKYCformPageBankCountry(String cntryOfBank) throws InterruptedException
 {
	  selectCountryOfBank.click();
      Thread.sleep(500);
	  typeCountryofBank.sendKeys(cntryOfBank);
	  Thread.sleep(500);
	  
	 for(WebElement s:listCountryofBank)
	  {
	//	System.out.println(s.getText());
		  if(s.getText().equalsIgnoreCase(cntryOfBank))
		  {
			  s.click();
		  }
		  else 
		  {
   		  rb.keyPress(KeyEvent.VK_TAB);	
   		  rb.delay(500);
	      }	  
	  }	
 }
 public void inpAClKYCformPageBankAddr(String bnkAddr)
 {
	 bankAddr.clear();
     bankAddr.sendKeys(bnkAddr);
 }
 public void inpAClKYCformPageBankSwiftCod(String bnkSwiftCod)
 {
	 bankSwiftCod.clear();
     bankSwiftCod.sendKeys(bnkSwiftCod);
 } 
 public void inpAClKYCformPageBankAccName(String accontName)
 {
	 accName.clear();
     accName.sendKeys(accontName);
 }
 public void inpAClKYCformPageBankCurrency(String currency,WebDriver driver)
 {
	 typeCurrency.sendKeys(currency);
	 rb.delay(100);
	 rb.keyPress(KeyEvent.VK_TAB);
	// rb.keyPress(KeyEvent.VK_ENTER);
 }
 public void inpAClKYCformPageBankAccNo(String accountNo)
 {
	 accNo.clear();
 	accNo.sendKeys(accountNo);
 }
 public void inpAClKYCformPageBankIBan(String iBanNo)
 {
	 	iBan.clear();
 	iBan.sendKeys(iBanNo);
 }
 public void inpAClKYCformPageBankAccMangName(String bnkAccManName)
 {
	 bnkAccMangName.clear();
 	bnkAccMangName.sendKeys(bnkAccManName);
 }
 public void selectAClKYCformPageBankAccMangCountry(String infoCountry) throws IOException, InterruptedException
 {
	
	  UtilityClass.selectCountryList(seleBnkAccManCountry, infoCountry);
 }
 public void inpAClKYCformPageBankAccMangConct(String bnkAccMangPhone) throws InterruptedException
 {
	 bnkAccMangName.click();
     Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
 	bnkAccMangConct.sendKeys(bnkAccMangPhone);
 } 
 public void inpAClKYCformPageBankCorrBnkName(String corBnkName)
 {
	 corrBnkName.clear();
 	corrBnkName.sendKeys(corBnkName);
 }
 public void inpAClKYCformPageBankcorrBnkSwift(String corrSwift)
 {
	 corrBnkSwift.clear();
 	corrBnkSwift.sendKeys(corrSwift);
 } 
 
//*Share Holder*//
 public void inpAClKYCformPageShrHldName1(String shareHldName1)
 {
	 shrHldName1.clear();
 	shrHldName1.sendKeys(shareHldName1);
 }
 public void inpAClKYCformPageShrHldPerctg1(String shareHldPrctg1)
 {
	 shrHldPerctg1.clear();
 	shrHldPerctg1.sendKeys(shareHldPrctg1);
 }
 public void selectAClKYCformPageShrHldCountry1(String shrCountry1) throws IOException, InterruptedException
 {
	
	 shrHldCountry1.click();
     Thread.sleep(500);
     typeShrCountry1.sendKeys(shrCountry1);
	  Thread.sleep(500);
	  
	 for(WebElement s:listShrCountry1)
	  {
		//System.out.println(s.getText());
		  if(s.getText().equalsIgnoreCase(shrCountry1))
		  {
			  s.click();
		  }
		  else 
		  {
  		  rb.keyPress(KeyEvent.VK_TAB);	
  		  rb.delay(500);
	      }	  
	  }	
 }
 
 public void inpAClKYCformPageShrHldName2(String shareHldName2)
 {
	 shrHldName2.clear();
 	shrHldName2.sendKeys(shareHldName2);
 } 
 public void inpAClKYCformPageShrHldPerctg2(String shareHldPrctg2)
 {
	 shrHldPerctg2.clear();
 	shrHldPerctg2.sendKeys(shareHldPrctg2);
 }
 public void selectAClKYCformPageShrHldCountry2(String shrCountry2) throws IOException, InterruptedException
 {
	
	 shrHldCountry2.click();
     Thread.sleep(500);
     typeShrCountry2.sendKeys(shrCountry2);
	  Thread.sleep(500);
	  
	 for(WebElement s:listShrCountry2)
	  {
		//System.out.println(s.getText());
		  if(s.getText().equalsIgnoreCase(shrCountry2))
		  {
			  s.click();
		  }
		  else 
		  {
  		  rb.keyPress(KeyEvent.VK_TAB);	
  		  rb.delay(500);
	      }	  
	  }	
 }
 
 public void clickAClKYCformPageShrHldPerctg2()
 {
	 addShrHldBtn.click();
 }
 
//*Contact Details*//
 public void inpAClKYCformPageCPCName(String pConName)
 {
	 pCName.clear();
 	pCName.sendKeys(pConName);
 }
 public void inpAClKYCformPageCPCDesigna(String PConDesigna)
 {
	 pCDesigna.clear();
 	pCDesigna.sendKeys(PConDesigna);
 }
 
 public void selectAClKYCformPageCPCCountry(String CPCCountry) throws IOException
 {
	  UtilityClass.selectCountryList(seleCDPCCountry, CPCCountry);
 }
 public void inpAClKYCformPageCPCPhNo(String pConPhNo) throws InterruptedException
 {
	 pCDesigna.click();
     Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
 	pCphNo.sendKeys(pConPhNo);
 }
 public void inpAClKYCformPageCPCEmail(String pConEmail)
 {
	 pCEmail.clear();
 	pCEmail.sendKeys(pConEmail);
 }
 
 
 public void inpAClKYCformPageCCFName(String cFName)
 {
	 cfdName.clear();
 	cfdName.sendKeys(cFName);
 }
 public void inpAClKYCformPageCCFDesigna(String cFDesigna)
 {
	 cfdDesigna.clear();
 	cfdDesigna.sendKeys(cFDesigna);
 }
 public void selectAClKYCformPageCCFCountry(String CCFCountry) throws IOException
 {
	  UtilityClass.selectCountryList(seleCFCountry, CCFCountry);
 }
 public void inpAClKYCformPageCCFPhNo(String cFPhNo) throws InterruptedException
 {
	 cfdDesigna.click();
     Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
 	cfdphNo.sendKeys(cFPhNo);
 }
 public void inpAClKYCformPageCCFEmail(String cFEmail)
 {
	 cfdEmail.clear();
 	cfdEmail.sendKeys(cFEmail);
 }
 
 
 public void inpAClKYCformPageCOpDCName(String opDConName)
 {
	 opDCName.clear();
 	opDCName.sendKeys(opDConName);
 }
 public void inpAClKYCformPageCOpDCDesigna(String opDConDesigna)
 {
	 opDCDesigna.clear();
 	opDCDesigna.sendKeys(opDConDesigna);
 }
 public void selectAClKYCformPageCOpDCCountry(String COpDCCountry) throws IOException
 {
	  UtilityClass.selectCountryList(seleOpDCountry, COpDCCountry);
 }
 public void inpAClKYCformPageCOpDCPhNo(String opDConNo) throws InterruptedException
 {
	 opDCDesigna.click();
     Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
 	opDCPhNo.sendKeys(opDConNo);
 }
 public void inpAClKYCformPageCOpDCEmail(String opDConEmail)
 {
	 opDCEmail.clear();
 	opDCEmail.sendKeys(opDConEmail);
 }
 
 
 public void inpAClKYCformPageCAcdName(String accdName)
 {
	 acdName.clear();
 	acdName.sendKeys(accdName);
 }
 public void inpAClKYCformPageCAcdDesigna(String accdDesigna)
 {
	 acdDesigna.clear();
 	acdDesigna.sendKeys(accdDesigna);
 }
 public void selectAClKYCformPageCAccCountry(String CAcdCountry) throws IOException
 {
	  UtilityClass.selectCountryList(seleAccCountry, CAcdCountry);
 }
 public void inpAClKYCformPageCAcdphNo(String accdNo) throws Throwable
 {
	 acdDesigna.click();
     Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
 	acdphNo.sendKeys(accdNo);
 }
 public void inpAClKYCformPageCAcDEmail(String accdEmail)
 {
	 acdEmail.clear();
 	acdEmail.sendKeys(accdEmail);
 }
 
 
 public void inpAClKYCformPageCProposedBusiness(String proposedBusiness)
 {
	 proposBusiness.clear();
 	proposBusiness.sendKeys(proposedBusiness);
 }
 public void inpAClKYCformPageCConctPerson(String cnctPerson)
 {
	 conctPerson.clear();
 	conctPerson.sendKeys(cnctPerson);
 }
 
 
//*Trade Referance*//
 public void inpAClKYCformPageTrdRefName1(String tradeRefName1)
 {
	 tRName1.clear();
 	tRName1.sendKeys(tradeRefName1);
 }
 public void seleAClKYCformPageTrdRefCountry1(String tradeRefCountry1)
 {
	 UtilityClass.selectCountryList(seleTrRefCountry1, tradeRefCountry1);
 }
 public void inpAClKYCformPageTrdRefPhone1(String tradeRefPhone1) throws InterruptedException
 {
	 seleTrRefCountry1.click();
     Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
	 tRPhone1.sendKeys(tradeRefPhone1);
 }
 public void inpAClKYCformPageTrdRefEmail1(String tradeRefMail1)
 {
	 tREmail1.clear();
	 tREmail1.sendKeys(tradeRefMail1);
 }
 
 public void inpAClKYCformPageTrdRefName2(String tradeRefName2)
 {
	 tRName2.clear();
 	tRName2.sendKeys(tradeRefName2);
 }
 public void seleAClKYCformPageTrdRefCountry2(String tradeRefCountry2)
 {
	 UtilityClass.selectCountryList(seleTrRefCountry2, tradeRefCountry2);
 }
 public void inpAClKYCformPageTrdRefPhone2(String tradeRefPhone2) throws InterruptedException
 {
	 seleTrRefCountry2.click();
     Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  Thread.sleep(100);
	  rb.keyPress(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
	  rb.keyRelease(KeyEvent.VK_DELETE);
	  Thread.sleep(100);
	 tRPhone2.sendKeys(tradeRefPhone2);
 }
 public void inpAClKYCformPageTrdRefEmail2(String tradeRefMail2)
 {
	 tREmail2.clear();
	 tREmail2.sendKeys(tradeRefMail2);
 }
//*Upload Document*//
 
 public void uplodkAClKYCformPageUpldCertOfIncorp(String UpldCertOfIncorp) throws IOException, InterruptedException
 {
	 certOfIncorp.sendKeys(UpldCertOfIncorp);
 }
 public void uplodAClKYCformPageUpldAoA(String UpldAoA) throws IOException, InterruptedException
 {
	 articleOfAssociation.sendKeys(UpldAoA);
 }
 public void uplodAClKYCformPageUpldTrdLiscCert(String UpldTrdLiscCert) throws IOException, InterruptedException
 {
	 tradeLiscCert.sendKeys(UpldTrdLiscCert);
 }
 public void uplodAClKYCformPageUpldTaxRegi(String TaxRegiDU) throws IOException, InterruptedException
 {
	 taxRegiCert.sendKeys(TaxRegiDU);
 }
 public void uplodAClKYCformPageUpldCompProfile(String CompProfileDU) throws IOException, InterruptedException
 {
	 compProfile.sendKeys(CompProfileDU);
 }
 public void uplodAClKYCformPageUpldBankRef(String UpldBankRef) throws IOException, InterruptedException
 {
	 bankRefLetter.sendKeys(UpldBankRef);
 }
 public void uplodAClKYCformPageUpldPassport(String UpldPassport) throws IOException, InterruptedException
 {
	 passportAuthoSignatory.sendKeys(UpldPassport);
 }
 
 public void inpAClKYCformPageUpldURL(String uploadURL)
 {
	 upldURL.clear();
 	upldURL.sendKeys(uploadURL);
 }

 public void clickAClKYCformPageUiDeclrare()
 {
 	iDeclare.click();
 }
 public void uplodAClKYCformPageUpldSign(String UpldSign) throws IOException, InterruptedException
 {
	 upldSign.sendKeys(UpldSign);
 }
 public void inpAClKYCformPageUpldAuthoSignName(String authSignName)
 {
	 AuthoSignName.clear();
	 AuthoSignName.sendKeys(authSignName);
 }
 public void clickAClKYCformPageUSubmitBtn()
 {
 	submitBtn.click();
 }
 public WebElement rtnAClKYCformPageUemailIsTakenMsg()
 {
	 return emailIsTakenMsg;
 }
 public WebElement rtnAClKYCformPageUemailIsTakenMsgWindow()
 {
	 return emailIsTakenWindow;
 }
 //KYC View Before Submit
 public WebElement rtnAClKYCformPageCBPopUpKycViewBeforeSubmit()
 {
	 return kycViewbeforeSubmit;
 }
 public void clickAClKYCformPageVBSPopUpIReview()
 {
	 kycViewPopUpiReview.click();
 }
 public void clickAClKYCformPageVBSPopUpEditBtn()
 {
	 kycViewPopUpEditBtn.click();
 }
 public void clickAClKYCformPageVBSPopUpSubmitBtn()
 {
	 kycViewPopUpSubmitBtn.click();
 }
 public void clickAClKYCformPageUpdateBtn()
 {
	 UpdateBtn.click();
 }
 
}
