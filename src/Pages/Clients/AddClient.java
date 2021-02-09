package Pages.Clients;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {


    @FindBy(id = "client_name")
    WebElement cName;

    @FindBy(id = "client_surname")
    WebElement cSurname;

    @FindBy(id = "client_address_1")
    WebElement cAdd1;

    @FindBy(id = "client_address_2")
    WebElement cAdd2;

    @FindBy(id = "client_city")
    WebElement cCity;

    @FindBy(id = "client_state")
    WebElement cState;

    @FindBy(id = "client_zip")
    WebElement cZip;

    @FindBy(id = "btn-submit")
    WebElement btnSave;

    @FindBy(id = "select2-client_language-container")
    WebElement containerLanguage;

    @FindBy(xpath = "//input[@role='searchbox']")
    WebElement searchBox;


    @FindBy(xpath = "//input[@name='client_phone']")
    WebElement cPhone;

    public void setcPhone(String phone)
    {
        cPhone.sendKeys(phone);
    }

    @FindBy(xpath = "//input[@name='client_fax']")
    WebElement cFax;

    public void setcFax(String fax)
    {
        cFax.sendKeys(fax);
    }


    @FindBy(xpath = "//input[@name='client_mobile']")
    WebElement cMobile;

    public void setcMobile(String mobile)
    {
        cMobile.sendKeys(mobile);
    }

    @FindBy(id = "client_email")
    WebElement cEmail;

    public void setcEmail(String email)
    {
        cEmail.sendKeys(email);
    }

    @FindBy(xpath = "//input[@name='client_web']")
    WebElement cWeb;

    public void setcWeb(String web)
    {
        cWeb.sendKeys(web);
    }


    @FindBy(xpath = "//input[@name='client_vat_id']")
    WebElement cVat;

    public void setcVat(String vat)
    {
        cVat.sendKeys(vat);
    }

    @FindBy(xpath = "//input[@name='client_tax_code']")
    WebElement cTax;

    public void setcTax(String tax)
    {
        cTax.sendKeys(tax);
    }



    WebDriver driver;

    public void setLanguage(String language)
    {
        containerLanguage.click();
        searchBox.sendKeys(language);
        driver.findElement(By.xpath("//li[normalize-space()='"+language+"']")).click();
    }

    @FindBy(id = "select2-client_country-container")
    WebElement containerCountry;

    public void setCountry(String country)
    {
        containerCountry.click();
        searchBox.sendKeys(country);
        driver.findElement(By.xpath("//li[normalize-space()='"+country+"']")).click();
    }

    @FindBy (id="select2-client_gender-container")
    WebElement containerGender;

    public void setGender(String gender)
    {
        containerGender.click();
        driver.findElement(By.xpath("//li[normalize-space()='"+gender+"']")).click();
    }


    public AddClient(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='client_birthdate']")
    WebElement cDatePicker;

    public  void setDate(String date)
    {
     //   cDatePicker.sendKeys(date);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].setAttribute('value','"+date+"')",cDatePicker);


      //  js.executeScript("arguments[0].setAttribute('value','"+date+"')",cDatePicker);

    }


    public void clickSave()
    {
        btnSave.click();
    }

    public void setcName(String name)
    {
        cName.sendKeys(name);
    }

    public void setcSurname(String surname)
    {
        cSurname.sendKeys(surname);
    }

    public void setcAdd1(String add1)
    {
        cAdd1.sendKeys(add1);
    }
    public void setcAdd2(String add2)
    {
        cAdd2.sendKeys(add2);
    }

    public void setcCity(String city)
    {
        cCity.sendKeys(city);
    }

    public void setcState(String state)
    {
        cState.sendKeys(state);
    }

    public void setcZip(String zip)
    {
        cZip.sendKeys(zip);
    }
}
