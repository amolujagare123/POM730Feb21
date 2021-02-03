import Pages.ForgotPassword;
import Pages.Login;
import Util.OpenUrl;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

import static Utility.ConfigReader.getUrl;

public class ForgotPasswordTest extends OpenUrl  {


    @Test
    public void forgotPassTest() throws IOException {

        Login login = new Login(driver);
        login.clickForgotPass();

        ForgotPassword forgotPassword = new ForgotPassword(driver);
        forgotPassword.setTxtEmail("amol@gmail.com");
        forgotPassword.clickReset();

    }
}
