package UITesting.Clients;

import Pages.Clients.AddClient;
import Pages.Menu;
import Util.DoLogin;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddClientTest extends DoLogin {

    AddClient addClient;

    @BeforeClass
    public void addClientPage()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();
        addClient = new AddClient(driver);
    }

    @Test
    public void activeCheckBoxSelection()
    {
         boolean expected= true;
        boolean actual = false;

        try {
            actual = addClient.checkBoxActive.isSelected();
            System.out.println("actual="+actual);
        }
        catch (Exception e)
        {

        }

        Assert.assertEquals(actual,expected);
    }
}
