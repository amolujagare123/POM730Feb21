import Pages.Login;
import Util.OpenUrl;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

import static Utility.ConfigReader.*;

public class LoginTest extends OpenUrl {

    @Test
    public void myLoginTest() throws IOException {

        Login login = new Login(driver);

        login.setTxtUser(getUserName());
        login.setTxtPassword(getPassword());
        login.clickLogin();


    }

}
