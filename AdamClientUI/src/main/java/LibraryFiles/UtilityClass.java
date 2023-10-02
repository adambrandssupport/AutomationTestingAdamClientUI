package LibraryFiles;

import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityClass 
{


public static String getPFData(String key) throws IOException
{
	FileInputStream file= new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\AdamClientUI\\PropertyFile.properties");
	Properties p = new Properties();
	p.load(file);
	String value = p.getProperty(key);
	file.close();
	return value;
}
public static String getTD(int rowIndex, int colIndex) throws IOException
{
FileInputStream file= new FileInputStream("C:\\Users\\PC\\git\\AEClientUITest\\Adambrands\\Test Data\\TestDataHomePage.xlsx");
String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(rowIndex).getCell(colIndex).getStringCellValue();
return value;
}

public static void captureSS(WebDriver driver, String TCID) throws IOException
{
    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest = new File("C:\\Users\\PC\\eclipse-workspace\\AdamClientUI\\FailedTCScreenShots\\Screenshot"+TCID+".png");
    FileHandler.copy(src, dest);
}

public static void drawBorder(WebDriver driver, WebElement ele) throws IOException
{
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0]. setAttribute('style', 'border:2px solid red; background:yellow')", ele);
}
public static void scrollDownToElement(WebDriver driver, WebElement ele) throws IOException
{
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0].scrollIntoView();", ele);
}
public static void clearPhoneNo(WebDriver driver, WebElement accdNo1) throws IOException
{
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("arguments[0].value('');", accdNo1);
}
public static void scrollUpDown(WebDriver driver) throws IOException
{
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor.executeScript("window.scrollBy(0,-500)", "");
}
public static void selectBusinessList(WebElement ele, String BusinText ) throws IOException
{
	Select	s = new Select(ele);
	s.selectByVisibleText(BusinText);
}
public static void selectBusinessNatureList(WebElement natureEle, String BusinNatureText )
{
	Select	s = new Select(natureEle);
	s.selectByVisibleText(BusinNatureText);
}
public static void selectCountryList(WebElement countryEle, String countryText )
{
	Select	s = new Select(countryEle);
	s.selectByVisibleText(countryText);
}
public static void jSClick(WebDriver driver, WebElement ele2) throws IOException
{
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	jsExecutor. executeScript("arguments[0].click();", ele2);
}

}
