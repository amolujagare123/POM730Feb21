package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DemoPropertiesFile {

    public static void main(String[] args) throws IOException {

        // 1. Read the file
        FileInputStream fis = new FileInputStream("Resorces\\Config.properties");

        // 2. create an object of the properties file
        Properties prop = new Properties();

        //3. load this object with file object
        prop.load(fis);

        // 4. read the value of key
        System.out.println(prop.getProperty("url"));




    }
}
