package regression.Clients;

import Pages.Clients.AddClient;
import Pages.Menu;
import Util.DoLogin;

import org.testng.annotations.Test;

;

public class AddClientTest extends DoLogin {



    @Test
    public void addclientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setcName("amol");
        addClient.setcSurname("ujagare");
        addClient.setLanguage("Swedish");
        addClient.setcAdd1("abc");
        addClient.setcAdd2("abcd");
        addClient.setcCity("pune");
        addClient.setcState("MH");
        addClient.setcZip("898989");
        addClient.setCountry("Libya");
        addClient.setcPhone("7878");
        addClient.setcFax("909090");
        addClient.setcMobile("8989");
        addClient.setcEmail("a@f.com");
        addClient.setcWeb("www.abcd.com");
        addClient.setGender("Female");
        addClient.setDate("09/28/1985");
        addClient.setcVat("9090");
        addClient.setcTax("90909090");

       // addClient.clickSave();

    }

}
