package org.example;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class DriverManager extends Utils {
    public static final String USERNAME = LoadProp.getProperty("BROWSERSTACK_USERNAME");
    //Storing the Username from Browserstack in USERNAME
    public static final String AUTOMATE_KEY = LoadProp.getProperty("BROWSERSTACK_ACCESS_KEY");
    //Storing the password from Browserstack in AUTOMATE_KEY
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
    //Storing Url of browserstack in URL
    String browserName = LoadProp.getProperty("browser");
    //    String browserName = System.getProperty("browser");
    boolean runIncloud = Boolean.parseBoolean(LoadProp.getProperty("cloud"));
    MutableCapabilities capabilities = new MutableCapabilities();


    public void openBrowser()
    {// Method to open Browser

        //run in cloud=====================================================================================================
        if (runIncloud)
        {
            System.out.println("Running in the Cloud");
            //Connect to cloud

            if (browserName.equalsIgnoreCase("Edge"))
            {
                ///connect with browserstack and seating the OS,Version,Browser,etc.
                capabilities.setCapability("browserName", "Edge");
                capabilities.setCapability("browserVersion", "106.0");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "10");
                browserstackOptions.put("local", "false");
                browserstackOptions.put("seleniumVersion", "4.1.0");
                capabilities.setCapability("bstack:options", browserstackOptions);

            }

            else if (browserName.equalsIgnoreCase("Firefox"))
            {
                ///connect with browserstack and seating the OS,Version,Browser,etc.
                capabilities.setCapability("browserName", "firefox");
                capabilities.setCapability("browserVersion", "106.0");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "11");
                browserstackOptions.put("local", "false");
                browserstackOptions.put("seleniumVersion", "4.1.0");
                capabilities.setCapability("bstack:options", browserstackOptions);
            } else
            {
                System.out.println("Your browser name is wrong or missing implementation:" + browserName);
            }

            try
            {
                driver = new RemoteWebDriver(new URL(URL), capabilities);
            } catch (MalformedURLException e)
            {
                throw new RuntimeException(e);
            }

        } else
        {
            System.out.println("Running in the locally");

            //Run in locally===========================================================================================

            if (browserName.equalsIgnoreCase("Chrome"))
            {
                System.setProperty("webdriver.chrome.driver", "src/test/java/Driver/chromedriver.exe");
                //setting the browser and the giving the chrome's driver path
                driver = new ChromeDriver();
                //Obj of Chrome Driver
            }

            else if (browserName.equalsIgnoreCase("Edge"))
            {
                // Set the driver path
                System.setProperty("webdriver.edge.driver", "src/test/java/Driver/msedgedriver.exe");
                // Start Edge Session
                driver = new EdgeDriver();
            }

            else if (browserName.equalsIgnoreCase("Firefox"))
            {
                // Set the driver path
                System.setProperty("webdriver.gecko.driver", "src/test/java/Driver/geckodriver.exe");
                // Start firefox Session
                driver = new FirefoxDriver();
            } else {
                System.out.println("Your browser name is wrong " + browserName);
                //Message if the browser name is wrong
            }

        }


        driver.manage().window().maximize();
        //Command for maximizing Screen

        driver.get(LoadProp.getProperty("url"));
        // Giving command to drive to go to given URL
    }

    public void closeBrowser() {
        //Method to close Browser

        driver.quit();
        //command to quit the browser
    }

}
