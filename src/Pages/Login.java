package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
//    WebDriver driver;
//    WebElement txtUser= driver.findElement(By.xpath("//input[@type='email']"));

    @FindBy(xpath = "//input[@type='email']")
    public WebElement txtUser;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement btnLogin;

    @FindBy(xpath = "//a[normalize-space()='I forgot my password']")
    public WebElement btnForgotPass;

    @FindBy(xpath = "//label[@for='email']")
    public WebElement lblEmail;

    @FindBy(xpath = "//label[@for='password']")
    public WebElement lblPass;

    @FindBy (xpath = "//div[@id='login']")
    public WebElement loginForm;

    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setTxtUser(String username) {
        txtUser.sendKeys(username);
    }

    public void setTxtPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public void clickForgotPass()
    {
         btnForgotPass.click();
    }


}
