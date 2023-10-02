package LibraryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataSupplierForKYCForm 
{

@DataProvider(name = "dataContainerKYCForm")
public String[][] excelDataSupplierKYCData() throws IOException
{
FileInputStream file = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\AdamClientUI\\Test Data\\excelDataProviderKYCPage.xlsx");
XSSFWorkbook Workbook = new XSSFWorkbook(file);
XSSFSheet sheet = Workbook.getSheet("KYC");

int row= sheet.getPhysicalNumberOfRows();
//System.out.println(row);
int col= sheet.getRow(0).getLastCellNum();
//System.out.println(col);
String[][] data = new String[row-2][col];
  for(int i=0; i<row-2; i++)
   {
    for(int j=0; j<col; j++)
       {
    	DataFormatter df = new  DataFormatter();
    	   data [i][j]=df.formatCellValue(sheet.getRow(i+2).getCell(j));
       }
    	System.out.println();
   }
 //for(String[] s1:data)
 //{
 // System.out.println(Arrays.toString(s1)); 
// }
 
Workbook.close();
file.close(); 
return data;
}


//@Test(dataProvider ="dataContainer" )
//public void man(String ID, String pw)
//{
//	System.out.println(ID+pw);
//}
//@DataProvider(name="kiran")
//public Object[][] dataSupply()
//{
//	Object[][] data= new Object[2][2];
//	data[0][0]="kiran";
//	data[0][1]="tester";
//	data[1][0]="Dhaval";
//	data[1][1]="UIUX";
//	return data;
//}
@DataProvider(name = "dataContainerEditKYC")
public String[][] excelDataSupplierEditKYCData() throws IOException
{
FileInputStream file = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\AdamClientUI\\Test Data\\excelDataProviderKYCPage.xlsx");
XSSFWorkbook Workbook = new XSSFWorkbook(file);
XSSFSheet sheet = Workbook.getSheet("EditKYC");

int row= sheet.getPhysicalNumberOfRows();
//System.out.println(row);
int col= sheet.getRow(0).getLastCellNum();
//System.out.println(col);
String[][] data = new String[row-2][col];
  for(int i=0; i<row-2; i++)
   {
    for(int j=0; j<col; j++)
       {
    	DataFormatter df = new  DataFormatter();
    	   data [i][j]=df.formatCellValue(sheet.getRow(i+2).getCell(j));
       }
    	System.out.println();
   }
 //for(String[] s1:data)
 //{
 // System.out.println(Arrays.toString(s1)); 
// }
 
Workbook.close();
file.close(); 
return data;
}
@DataProvider(name = "dataContainerKYCCompanyInfo")
public String[][] excelDSCompInfo() throws IOException
{
FileInputStream file = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\AdamClientUI\\Test Data\\excelDataProviderKYCPage.xlsx");
XSSFWorkbook Workbook = new XSSFWorkbook(file);
XSSFSheet sheet = Workbook.getSheet("KYCCompInfo");

int row= sheet.getPhysicalNumberOfRows();
//System.out.println(row);
int col= sheet.getRow(0).getLastCellNum();
//System.out.println(col);
String[][] data = new String[row-2][col];
  for(int i=0; i<row-2; i++)
   {
    for(int j=0; j<col; j++)
       {
    	DataFormatter df = new  DataFormatter();
    	   data [i][j]=df.formatCellValue(sheet.getRow(i+2).getCell(j));
       }
    	System.out.println();
   }
Workbook.close();
file.close(); 
return data;
}
@DataProvider(name = "dataContainerKYCCompanyStructure")
public String[][] excelDSKYCCompanyStructure() throws IOException
{
FileInputStream file = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\AdamClientUI\\Test Data\\excelDataProviderKYCPage.xlsx");
XSSFWorkbook Workbook = new XSSFWorkbook(file);
XSSFSheet sheet = Workbook.getSheet("KYCCompStru");

int row= sheet.getPhysicalNumberOfRows();
//System.out.println(row);
int col= sheet.getRow(0).getLastCellNum();
//System.out.println(col);
String[][] data = new String[row-2][col];
  for(int i=0; i<row-2; i++)
   {
    for(int j=0; j<col; j++)
       {
    	DataFormatter df = new  DataFormatter();
    	   data [i][j]=df.formatCellValue(sheet.getRow(i+2).getCell(j));
       }
    	System.out.println();
   }
Workbook.close();
file.close(); 
return data;
}
}