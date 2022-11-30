package org.example;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp
{
    //This Class is made in JD's lecture

    static Properties prop;
//    static String propertiesFileLocation = "src/test/java/TestConfig/";
//    static String propertiesFileName = "TestData.properties";
    static FileInputStream input;

    public static String getProperty(String key) {

        prop = new Properties();
        try {
//            input = new FileInputStream(propertiesFileLocation + propertiesFileName);
            input = new FileInputStream("src/test/java/TestConfig/TestData.properties");
            //assigning the path
            prop.load(input);
            input.close();
        } catch (IOException e) {
            //catch block
            e.printStackTrace();
        }
        return prop.getProperty(key);
        //Returning the value

    }

    @Test public void readKeys()
    {
        //Testcase to test the above method is working or not
        System.out.println(getProperty("url"));
        System.out.println(getProperty("FirstName"));
    }

}
