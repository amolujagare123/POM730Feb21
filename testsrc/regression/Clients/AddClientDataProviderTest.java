package regression.Clients;

import Pages.Clients.AddClient;
import Pages.Menu;
import Util.DoLogin;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

;import java.io.IOException;

import static Utility.DataProviderClass.getMyData;

public class AddClientDataProviderTest extends DoLogin {



    @Test (dataProvider = "getData")
    public void addclientTest(String name,String surname,String language,
                              String add1,String add2,String city,
                              String state ,String zip,String country,
                              String phone ,String fax,String mobile,
                              String email,String web,String gender,
                              String birthdate,String vat ,String tax,
                              String expected , String xpathActual)
        {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setcName(name);
        addClient.setcSurname(surname);
        addClient.setLanguage(language);
        addClient.setcAdd1(add1);
        addClient.setcAdd2(add2);
        addClient.setcCity(city);
        addClient.setcState(state);
        addClient.setcZip(zip);
        addClient.setCountry(country);
        addClient.setcPhone(phone);
        addClient.setcFax(fax);
        addClient.setcMobile(mobile);
        addClient.setcEmail(email);
        addClient.setcWeb(web);
        addClient.setGender(gender);
        addClient.setDate(birthdate);
        addClient.setcVat(vat);
        addClient.setcTax(tax);
        addClient.clickSave();


            String actual="";
        try {
          actual = driver.findElement(By.xpath(xpathActual)).getText();
        }
        catch (Exception e)
        {

        }
            Assert.assertEquals(actual,expected,"wrong message");

    }

    @DataProvider
    public Object[][] getData() throws IOException {
        return  getMyData("Data\\ip.xlsx","Sheet1");
    }

}
