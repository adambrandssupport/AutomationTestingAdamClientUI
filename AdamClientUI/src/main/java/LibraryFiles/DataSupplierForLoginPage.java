package LibraryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataSupplierForLoginPage
{

@DataProvider(name = "dataContainerTFLogin")
public String[][] excelDataSupplierTFLogin() throws IOException
{
FileInputStream file = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\AdamClientUI\\Test Data\\excelDataProviderLoginPage.xlsx");
XSSFWorkbook Workbook = new XSSFWorkbook(file);
XSSFSheet sheet = Workbook.getSheet("LoginCombination");

int row= sheet.getPhysicalNumberOfRows();
//System.out.println(row);
int col= sheet.getRow(0).getLastCellNum();
//System.out.println(col);
String[][] data = new String[row-1][col];
  for(int i=0; i<row-1; i++)
   {
    for(int j=0; j<col; j++)
       {
    	DataFormatter df = new  DataFormatter();
    	   data [i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
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

@DataProvider(name = "dataContainerForNegativeTC")
public String[][] excelDataSupplierNegative() throws IOException
{
FileInputStream file = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\AdamClientUI\\Test Data\\excelDataProviderLoginPage.xlsx");
XSSFWorkbook Workbook = new XSSFWorkbook(file);
XSSFSheet sheet = Workbook.getSheet("NegativeTC");

int row= sheet.getPhysicalNumberOfRows();
//System.out.println(row);
int col= sheet.getRow(0).getLastCellNum();
//System.out.println(col);
String[][] data = new String[row-1][col];
  for(int i=0; i<row-1; i++)
   {
    for(int j=0; j<col; j++)
       {
    	DataFormatter df = new  DataFormatter();
    	   data [i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
       }
    	System.out.println();
   }
 
Workbook.close();
file.close(); 
return data;
}
}