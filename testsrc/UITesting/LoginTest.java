package UITesting;

import Pages.Login;
import Util.DoLogin;
import Util.OpenUrl;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends OpenUrl {

    Login login;

    @BeforeClass
    public void initLogin()
    {
        login = new Login(driver);
    }
    
    @Test
    public void checkTxtUsernameVisibility()
    {
        
      boolean expected = true;
        boolean actual = false;
      try {
         actual = login.txtUser.isDisplayed(); // true | false
      }
      catch (Exception e)
      {
          
      }
      Assert.assertEquals(actual,expected,"the username text box is absent");
    }

    @Test
    public void checkTxtUsernameEnability()
    {

        boolean expected = true;
        boolean actual = false;
        try {
            actual = login.txtUser.isEnabled(); // true | false
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected,"the username text box is not enabled");
    }

    @Test
    public void checkLoginFormWidth()
    {
        String expected = "570px"; // 570px
        String actual = "";
        try
        {
            actual = login.loginForm.getCssValue("width");
            System.out.println("actual="+actual);
            System.out.println(login.loginForm.getCssValue("height")); // 268px
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void checkLoginFormHeight()
    {
        String expected = "268px";
        String actual = "";
        try
        {
            actual = login.loginForm.getCssValue("height");
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected);
    }


    @Test
    public void checkEmailTextWaterMark()
    {
        String expected ="Email";
        String actual = "";

        try
        {
           actual = login.txtUser.getAttribute("placeholder");
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected);
    }

    @Test
    public  void checkFontSize()
    {
        String expected ="14px";
        String actual = "";

        try
        {
            actual = login.txtUser.getCssValue("font-size");
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected);
    }

    @Test
    public  void checkFontFamily()
    {
        String expected ="-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";
        String actual = "";

        try
        {
            actual = login.txtUser.getCssValue("font-family");
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected);
    }

    @Test
    public  void checkFont() // check do we have a font sans-serif in the font family
    {
        String expected ="sans-serif";
        String actual = "";

        try
        {
            actual = login.txtUser.getCssValue("font-family");
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }

        boolean result = actual.contains(expected);

        Assert.assertTrue(result,"given fornt is not in the font family");

    }


    @Test
    public  void checkbtnLoginColor()
    {
        String expected ="#2C8EDD";
        String actual = "";

        try
        {
            String rgbColor = login.btnLogin.getCssValue("background-color");


            actual = Color.fromString(rgbColor).asHex().toUpperCase();

            System.out.println("rgbColor="+rgbColor);
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void chekPaawordSpelling()
    {
        String expected ="Password";
        String actual = "";

        try
        {
            actual = login.lblPass.getText();
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected);
    }
}
