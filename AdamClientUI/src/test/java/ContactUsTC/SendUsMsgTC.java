package ContactUsTC;

import java.io.IOException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import ContactUsPage.AClContactUsPage;
import ContactUsPage.AClHomePage;
import LibraryFiles.BaseClass;
import LibraryFiles.DataSupplierForContactUsPage;
import LibraryFiles.UtilityClass;
import net.bytebuddy.utility.RandomString;

public class SendUsMsgTC extends BaseClass
{
	AClHomePage hp;
	AClContactUsPage cs;
	SoftAssert soft;
@BeforeClass
public void openBrowser() throws IOException, InterruptedException
{
	initialiseBrowser();
	hp = new AClHomePage(driver);
	cs = new AClContactUsPage(driver);
	soft = new SoftAssert();
	Thread.sleep(2000);
}
@Test(dataProvider = "dataContainerContactUsPage", dataProviderClass = DataSupplierForContactUsPage.class)
public void SendUsMsgFormFill(String Scenario, String naMe,String eMail,String countrCode,String phone,String Msg ) throws IOException,InterruptedException 
{	
	hp.clickHomePageContactUsButton();
	Thread.sleep(2000);
	cs.inpAClContactUsPageName(naMe);
	cs.inpAClContactUsPageEmail(eMail);
//	
	cs.inpAClContactUsPagePhone(phone);
	cs.inpAClContactUsPageMsg(Msg);
	cs.clickAClContactUsPageSubmitNowBtn();
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
