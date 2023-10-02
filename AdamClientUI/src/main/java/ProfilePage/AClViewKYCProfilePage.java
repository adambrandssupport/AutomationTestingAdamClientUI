package ProfilePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AClViewKYCProfilePage 
{
@FindBy(xpath = "//p[text()='Registered Company Name']/following::p[1]")private WebElement compName;
@FindBy(xpath = "//p[text()='Parent Company']/following::p[1]")private WebElement paCompName;
@FindBy(xpath = "//p[text()='Company Registered Address']/following::p[1]")private WebElement compAdd;
@FindBy(xpath = "//p[text()='Contact Number']/following::p[1]")private WebElement phone;
@FindBy(xpath = "(//p[text()='Email Address']/following::p[1])[1]")private WebElement eMail;
@FindBy(xpath = "//p[text()='Company Website']/following::p[1]")private WebElement website;
@FindBy(xpath = "//p[text()='Corporate Domain Name']/following::p[1]")private WebElement domain;
@FindBy(xpath = "//p[text()='Number of Employees']/following::p[1]")private WebElement empNo;

@FindBy(xpath = "//p[text()='Business Structure']/following::p[1]")private WebElement bussStru ;
@FindBy(xpath = "//p[text()='Nature of Business']/following::p[1]")private WebElement bussNature;
@FindBy(xpath = "//p[text()='Country of Incorporation']/following::p[1]")private WebElement countryofIncorp;
@FindBy(xpath = "//p[contains (text(),'Date of Incorporation')]/following:: p[1]")private WebElement dateofIncorp;
@FindBy(xpath = "//p[text()='Company Registration No']/following::p[1]")private WebElement regNo;
@FindBy(xpath = "//p[text()='Trade License Numbere']/following::p[1]")private WebElement trdLiscNo;
@FindBy(xpath = "//p[contains (text(),'Trade License Expiry Date')]/following:: p[1]")private WebElement trdLiscExpDate;
@FindBy(xpath = "//p[text()='VAT Registration Number']/following::p[1]")private WebElement vatNo;

@FindBy(xpath = "//p[text()='Bank Name']/following::p[1]")private WebElement bnkname;
@FindBy(xpath = "//p[text()='Bank Country']/following::p[1]")private WebElement bnkCountry;
@FindBy(xpath = "//p[text()='Bank Branch Address']/following::p[1]")private WebElement bnkAdd;
@FindBy(xpath = "//p[text()=' Swift Code']/following::p[1]")private WebElement bnkSwiftCode;
@FindBy(xpath = "//p[text()='Account Name']/following::p[1]")private WebElement bnkAccName;
@FindBy(xpath = "//p[text()=' Account Currency']/following::p[1]")private WebElement bnkCurrency;
@FindBy(xpath = "//p[text()='Account Number']/following::p[1]")private WebElement bnkAccNo;
@FindBy(xpath = "//p[text()='IBAN/ABA']/following::p[1]")private WebElement bnkIban;
@FindBy(xpath = "(//p[contains(text(),'Bank Account Manager')])[1]/following::p[1]")private WebElement bnkManName;
@FindBy(xpath = "(//p[contains(text(),'Bank Account Manager')])[2]/following::p[1]")private WebElement bnkManPhone;
@FindBy(xpath = "//p[text()='Correspondent Bank Name']/following::p[1]")private WebElement correBnkName;
@FindBy(xpath = "//p[text()=' Correspondent Bank SWIFT Code']/following::p[1]")private WebElement correBnkSwiftCode;

@FindBy(xpath = "(//p[text()='Name'])[1]/following::p[1]")private WebElement shrName1;
@FindBy(xpath = "(//p[text()='Percentage (%)'])[1]/following::p[1]")private WebElement shrPercentage1;
@FindBy(xpath = "(//p[text()=' Nationality'])[1]/following::p[1]")private WebElement shrCountry1;
@FindBy(xpath = "(//p[text()='Name'])[2]/following::p[1]")private WebElement shrName2;
@FindBy(xpath = "(//p[text()='Percentage (%)'])[2]/following::p[1]")private WebElement shrPercentage2;
@FindBy(xpath = "(//p[text()=' Nationality'])[2]/following::p[1]")private WebElement shrCountry2;

@FindBy(xpath = "(//h1[text()='Primary Contact Details']/following-sibling::div/div/p[2])[1]")private WebElement pcName;
@FindBy(xpath = "(//h1[text()='Primary Contact Details']/following-sibling::div/child::div/child::p[2])[2]")private WebElement pcDesign;
@FindBy(xpath = "(//h1[text()='Primary Contact Details']/following-sibling::div/child::div/child::p[2])[3]")private WebElement pcPhone;
@FindBy(xpath = "//h1[text()='Primary Contact Details']/following-sibling::div/div[4]/p[2]")private WebElement pcEmail;

@FindBy(xpath = "(//h1[text()='Operations Department Contact Details']/following-sibling::div/div/p[2])[1]")private WebElement odName;
@FindBy(xpath = "(//h1[text()='Operations Department Contact Details']/following-sibling::div/child::div/child::p[2])[2]")private WebElement odDesign;
@FindBy(xpath = "(//h1[text()='Operations Department Contact Details']/following-sibling::div/child::div/child::p[2])[3]")private WebElement odPhone;
@FindBy(xpath = "(//h1[text()='Operations Department Contact Details']/following-sibling::div/child::div/child::p[2])[4]")private WebElement odEmail;

@FindBy(xpath = "(//h1[text()='Accounting Department Contact Details']/following-sibling::div/child::div/child::p[2])[1]")private WebElement adName;
@FindBy(xpath = "(//h1[text()='Accounting Department Contact Details']/following-sibling::div/child::div/child::p[2])[2]")private WebElement adDesign;
@FindBy(xpath = "(//h1[text()='Accounting Department Contact Details']/following-sibling::div/child::div/child::p[2])[3]")private WebElement adPhone;
@FindBy(xpath = "(//h1[text()='Accounting Department Contact Details']/following-sibling::div/child::div/child::p[2])[4]")private WebElement adEmail;

@FindBy(xpath = "(//h1[text()='Credit/Finance Contact Details']/following-sibling::div/child::div/child::p[2])[1]")private WebElement cfName;
@FindBy(xpath = "(//h1[text()='Credit/Finance Contact Details']/following-sibling::div/child::div/child::p[2])[2]")private WebElement cfDesign;
@FindBy(xpath = "(//h1[text()='Credit/Finance Contact Details']/following-sibling::div/child::div/child::p[2])[3]")private WebElement cfPhone;
@FindBy(xpath = "(//h1[text()='Credit/Finance Contact Details']/following-sibling::div/child::div/child::p[2])[4]")private WebElement cfEmail;

@FindBy(xpath = "//p[contains(text(),'What is the proposed business')]/following-sibling::p")private WebElement propoBusi;
@FindBy(xpath = "//p[text()='Who is your Contact Person in Adam Energy FZE?']/following-sibling::p")private WebElement contPersonAE;

@FindBy(xpath = "//div[@class='Dkyc-tradeReference']/child::div[1]/p[2]")private WebElement trName1;
@FindBy(xpath = "//div[@class='Dkyc-tradeReference']/child::div[2]/p[2]")private WebElement trPhone1;
@FindBy(xpath = "//div[@class='Dkyc-tradeReference']/child::div[3]/p[2]")private WebElement trEmail1;

@FindBy(xpath = "//div[@class='Dkyc-tradeReference']/child::div[4]/p[2]")private WebElement trName2;
@FindBy(xpath = "//div[@class='Dkyc-tradeReference']/child::div[5]/p[2]")private WebElement trPhone2;
@FindBy(xpath = "//div[@class='Dkyc-tradeReference']/child::div[6]/p[2]")private WebElement trEmail2;

@FindBy(xpath = "//p[contains(text(),'1)')]/following-sibling::div/button")private WebElement certOfInc;
@FindBy(xpath = "(//img[@class='popup-image'])[1]")private WebElement imgDisplay;
@FindBy(xpath = "//i[@class='fa-solid fa-square-xmark fa-beat']")private WebElement closeImg;

@FindBy(xpath = "//p[contains(text(),'2)')]/following-sibling::div/button")private WebElement aOA;
@FindBy(xpath = "//p[contains(text(),'3)')]/following-sibling::div/button")private WebElement trL;
@FindBy(xpath = "//p[contains(text(),'4)')]/following-sibling::div/button")private WebElement taxR;
@FindBy(xpath = "//p[contains(text(),'5)')]/following-sibling::div/button")private WebElement compPr;
@FindBy(xpath = "//p[contains(text(),'7)')]/following-sibling::div/button")private WebElement BR;
@FindBy(xpath = "//p[contains(text(),'8)')]/following-sibling::div/button")private WebElement PsP;

public 	boolean clickKYCFormPageViewCP() throws InterruptedException
{
	compPr.click();
	Thread.sleep(500);
	boolean CP = imgDisplay.isDisplayed();
	Thread.sleep(500);
	closeImg.click();	
	return CP;
}

public AClViewKYCProfilePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public String getKYCFormPageCompName()
{
	return compName.getText();
}
public String getKYCFormPagePaCompName()
{
	return paCompName.getText();
}
public String getKYCFormPageCompAdd()
{
	return compAdd.getText();
}
public String getKYCFormPageCompPhone()
{
	return phone.getText();
}
public String getKYCFormPageCompeMail()
{
	return eMail.getText();
}
public String getKYCFormPageCompWebsite()
{
	return website.getText();
}
public String getKYCFormPageCompDomain()
{
	return domain.getText();
}
public String getKYCFormPageCompEmpNo()
{
	return empNo.getText();
}
public String getKYCFormPageCompStrBussStru()
{
	return bussStru.getText();
}
public String getKYCFormPageCompStrBussNature()
{
	return bussNature.getText();
}

public String getKYCFormPageCompStrCountryofIncorp()
{
	return countryofIncorp.getText();
}
public String getKYCFormPageCompStrDateofIncorp()
{
	String date=dateofIncorp.getText(); 
	String s1=date.substring(8,10)+date.substring(5,7);
	String s2=date.substring(0,4);
	String s3=s1.concat(s2);
	return s3;   // 1984-09-30 <==>3009
}
public String getKYCFormPageCompStrRegNo()
{
	return regNo.getText();
}
public String getKYCFormPageCompStrTrdLiscNo()
{
	return trdLiscNo.getText();
}
public String getKYCFormPageCompStrTrdLiscExpDate()
{
	String date=trdLiscExpDate.getText(); 
	String s1=date.substring(8,10)+date.substring(5,7);
	String s2=date.substring(0,4);
	String s3=s1.concat(s2);
	return s3;
}
public String getKYCFormPageCompStrVatNo()
{
	return vatNo.getText();
}
//Bank Details
public String getKYCFormPageBnkName()
{
	return bnkname.getText();
}
public String getKYCFormPageBnkCountry()
{
	return bnkCountry.getText();
}
public String getKYCFormPageBnkAdd()
{
	return bnkAdd.getText();
}
public String getKYCFormPageBnkSwiftCode()
{
	return bnkSwiftCode.getText();
}
public String getKYCFormPageBnkAccName()
{
	return bnkAccName.getText();
}
public String getKYCFormPageBnkCurrency()
{
	return bnkCurrency.getText();
}

public String getKYCFormPageBnkAccNo()
{
	return bnkAccNo.getText();
}
public String getKYCFormPageBnkIban()
{
	return bnkIban.getText();
}

public String getKYCFormPageBnkManName()
{
	return bnkManName.getText();
}
public String getKYCFormPageBnkManPhone()
{
	return bnkManPhone.getText();
}
public String getKYCFormPageBnkCorreBnkName()
{
	return correBnkName.getText();
}
public String getKYCFormPageBnkCorreBnkSwiftCode()
{
	return correBnkSwiftCode.getText();
}

public String getKYCFormPageShrName1()
{
	return shrName1.getText();
}
public String getKYCFormPageShrPercentage1()
{
	return shrPercentage1.getText();
}
public String getKYCFormPageShrCountry1()
{
	return shrCountry1.getText();
}
public String getKYCFormPageShrName2()
{
	return shrName2.getText();
}
public String getKYCFormPageShrPercentage2()
{
	return shrPercentage2.getText();
}
public String getKYCFormPageShrCountry2()
{
	return shrCountry2.getText();
}

public String getKYCFormPagePCName()
{
	return pcName.getText();
}
public String getKYCFormPagePCDesign()
{
	return pcDesign.getText();
}
public String getKYCFormPagePCPhone()
{
	return pcPhone.getText();
}
public String getKYCFormPagePCEmail()
{
	return pcEmail.getText();
}

public String getKYCFormPageODName()
{
	return odName.getText();
}
public String getKYCFormPageODDesign()
{
	return odDesign.getText();
}
public String getKYCFormPageODPhone()
{
	return odPhone.getText();
}
public String getKYCFormPageODEmail()
{
	return odEmail.getText();
}

public String getKYCFormPageADName()
{
	return adName.getText();
}
public String getKYCFormPageADDesign()
{
	return adDesign.getText();
}
public String getKYCFormPageADPhone()
{
	return adPhone.getText();
}
public String getKYCFormPageADEmail()
{
	return adEmail.getText();
}

public String getKYCFormPageCFDName()
{
	return cfName.getText();
}
public String getKYCFormPageCFDDesign()
{
	return cfDesign.getText();
}
public String getKYCFormPageCFDPhone()
{
	return cfPhone.getText();
}
public String getKYCFormPageCFDEmail()
{
	return cfEmail.getText();
}
public String getKYCFormPagePropoBussi()
{
	return propoBusi.getText();
}
public String getKYCFormPageContPersonAE()
{
	return contPersonAE.getText();
}
public String getKYCFormPageTRName1()
{
	return trName1.getText();
}
public String getKYCFormPageTRPhone1()
{
	return trPhone1.getText();
}
public String getKYCFormPageTREmail1()
{
	return trEmail1.getText();
}

public String getKYCFormPageTRName2()
{
	return trName2.getText();
}
public String getKYCFormPageTRPhone2()
{
	return trPhone2.getText();
}
public String getKYCFormPageTREmail2()
{
	return trEmail2.getText();
}

public 	boolean clickKYCFormPageViewCertOfInc() throws InterruptedException
{
	certOfInc.click();
	Thread.sleep(500);
	boolean CoI = imgDisplay.isDisplayed();
	Thread.sleep(500);
	closeImg.click();	
	return CoI;
}
public 	boolean clickKYCFormPageViewAoA() throws InterruptedException
{
	aOA.click();
	Thread.sleep(500);
	boolean AOA = imgDisplay.isDisplayed();
	Thread.sleep(500);
	closeImg.click();	
	return AOA;
}
public 	boolean clickKYCFormPageViewTrL() throws InterruptedException
{
	trL.click();
	Thread.sleep(500);
	boolean TL = imgDisplay.isDisplayed();
	Thread.sleep(500);
	closeImg.click();	
	return TL;
}
public 	boolean clickKYCFormPageViewTaxReg() throws InterruptedException
{
	taxR.click();
	Thread.sleep(500);
	boolean TR = imgDisplay.isDisplayed();
	Thread.sleep(500);
	closeImg.click();	
	return TR;
}
}
