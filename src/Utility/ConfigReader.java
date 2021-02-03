package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static  Properties getLoadedPropertyObject() throws IOException {
        // 1. Read the file
        FileInputStream fis = new FileInputStream("Resorces\\Config.properties");

        // 2. create an object of the properties file
        Properties prop = new Properties();

        //3. load this object with file object
        prop.load(fis);

        return  prop;
    }


    public static String getUrl() throws IOException {

       return getLoadedPropertyObject().getProperty("url");
    }

    public static String getUserName() throws IOException {
        return getLoadedPropertyObject().getProperty("username");
    }

    public static  String getPassword() throws IOException {
        return getLoadedPropertyObject().getProperty("password");
    }
}
