package LibraryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataSupplierForContactUsPage
{

@DataProvider(name = "dataContainerContactUsPage")
public String[][] excelDataSupplierTFLogin() throws IOException
{
FileInputStream file = new FileInputStream("C:\\Users\\PC\\eclipse-workspace\\AdamClientUI\\Test Data\\excelDataProviderContactUsPage.xlsx");
XSSFWorkbook Workbook = new XSSFWorkbook(file);
XSSFSheet sheet = Workbook.getSheet("ContactUsForm");

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
}