package KYCPage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import LibraryFiles.BaseClass;
import LibraryFiles.UtilityClass;

public class datePicker extends BaseClass
{
	AClHomePage hp;
	AClLoginPage lp;
    AClKYCformPage kp;
	SoftAssert soft;
	Actions actions;
@Test
public void dateSelection() throws Throwable
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
	String dateStr = "30-08-1994";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDate date = LocalDate.parse(dateStr, formatter);
    String formattedDate = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	
    WebElement targetElement = driver.findElement(By.xpath("(//input[@type='date'])[1]"));
	
	int elementX = targetElement.getLocation().getX();
    int elementY = targetElement.getLocation().getY();

    // Calculate the xOffset and yOffset based on the desired offset from the target element
    int xOffset = 100; // Replace with the desired horizontal offset in pixels
    int yOffset = 50; // Replace with the desired vertical offset in pixels

    // Calculate the final coordinates for right-click
    int finalX = elementX + xOffset;
    int finalY = elementY + yOffset;

    // Perform the right-click action using Actions class
    actions = new Actions(driver);
    actions.moveToElement(targetElement, xOffset, yOffset).contextClick().perform();

   
}
}
