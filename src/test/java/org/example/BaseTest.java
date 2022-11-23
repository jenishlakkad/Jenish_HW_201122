package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils
{
    //BaseTest class extends Utils class by concept of inheritance
    DriverManager driverManager=new DriverManager();
    // calling method of 'driver manager' form DriverManager class

    @BeforeMethod public void open()
    {
        //BeforeMethod to run code before executing every Test cases

        driverManager.openBrowser();
        //Using function of open browser to open browser
    }

    @AfterMethod public void close(ITestResult result)
    {
        //AfterMethod to run code after executing every Test cases
        if (!result.isSuccess())
        {
            //If condition to take Screen short only if test case fail
            captureScreenshot(result.getName());
            //Calling Method form Utils to take Screen Short
        }

         driverManager.closeBrowser();
        // Using function of close browser to close browser
    }

}
