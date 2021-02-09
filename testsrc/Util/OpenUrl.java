package Util;

import Utility.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import static Utility.ConfigReader.getUrl;
import static Utility.Driver.DriverType.CHROME;
import static Utility.Driver.DriverType.FIREFOX;
import static Utility.Driver.getMyDriver;

public class OpenUrl {

    public static WebDriver driver;

    @BeforeClass
    public void openUrl() throws IOException {

        driver = getMyDriver(CHROME);
        driver.get(getUrl());
    }
}
