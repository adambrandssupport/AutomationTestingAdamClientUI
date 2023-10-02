package LocalTestingKYCPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.DataSupplierCountryCode;
import LibraryFiles.DataSupplierForLoginPage;

public class GetCountryCode extends BaseClass
{
@Test(dataProvider = "dataContainerTFLogin", dataProviderClass = DataSupplierCountryCode.class)
public void codeCountry(String code, String country) 
{
    System.out.println("\""+code+"-"+country+"\",");
    
    
}
}
