package LibraryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataSupplierCountryCode
{

@DataProvider(name = "dataContainerTFLogin")
public String[][] excelDataSupplierTFLogin() throws IOException
{
FileInputStream file = new FileInputStream("C:\\Users\\PC\\git\\AEClientUITest\\Adambrands\\Test Data\\CountryName.xlsx");
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