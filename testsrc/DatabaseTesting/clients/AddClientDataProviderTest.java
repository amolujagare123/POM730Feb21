package DatabaseTesting.clients;

import Pages.Clients.AddClient;
import Pages.Menu;
import Util.DoLogin;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import static Utility.DataProviderClass.getMyData;

;

public class AddClientDataProviderTest extends DoLogin {



    @Test (dataProvider = "getData")
    public void addclientTest(String name,String surname,String language,
                              String add1,String add2,String city,
                              String state ,String zip,String country,
                              String phone ,String fax,String mobile,
                              String email,String web,String gender,
                              String birthdate,String vat ,String tax) throws ClassNotFoundException, SQLException {

        ArrayList<String> expected = new ArrayList<>();
            expected.add(name);
            expected.add(surname);
            expected.add(language);
            expected.add(add1);
            expected.add(add2);
            expected.add(city);
            expected.add(state );
            expected.add(zip);
            expected.add(country);
            expected.add(phone );
            expected.add(fax);
            expected.add(mobile);
            expected.add(email);
            expected.add(web);
            expected.add(gender);
            expected.add(birthdate);
            expected.add(vat );
            expected.add(tax);


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


        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/ip";
        String user = "root";
        String pass = "root";

        Connection con = DriverManager.getConnection(url,user,pass) ;

        Statement st = con.createStatement();

        String sql = "select * from ip_clients where client_name='"+name+"'";

        ResultSet rs = st.executeQuery(sql);

        ArrayList<String> actual = new ArrayList<>();

        while(rs.next())
        {
            actual.add(rs.getString("client_name") );
            actual.add(rs.getString("client_surname") );
            actual.add(rs.getString("client_language") );
            actual.add(rs.getString("client_address_1") );
            actual.add(rs.getString("client_address_2") );
            actual.add(rs.getString("client_city") );
            actual.add(rs.getString("client_state") );
            actual.add(rs.getString("client_zip") );
            actual.add(rs.getString("client_country") );
            actual.add(rs.getString("client_phone") );
            actual.add(rs.getString("client_fax") );
            actual.add(rs.getString("client_mobile") );
            actual.add(rs.getString("client_email") );
            actual.add(rs.getString("client_web") );
            actual.add(rs.getString("client_gender") );
            actual.add(rs.getString("client_birthdate") );
            actual.add(rs.getString("client_vat_id") );
            actual.add(rs.getString("client_tax_code") );
        }


        Assert.assertEquals(actual,expected,"all or some records doesnot match");

    }

    @DataProvider
    public Object[][] getData() throws IOException {
        return  getMyData("Data\\ip.xlsx","Sheet2");
    }

}
