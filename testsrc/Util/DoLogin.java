package Util;

import Pages.Login;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import static Utility.ConfigReader.getPassword;
import static Utility.ConfigReader.getUserName;

public class DoLogin extends OpenUrl{

    @BeforeClass
    public void doLogin() throws IOException {
        Login login = new Login(driver);
        login.setTxtUser(getUserName());
        login.setTxtPassword(getPassword());
        login.clickLogin();
    }

}
