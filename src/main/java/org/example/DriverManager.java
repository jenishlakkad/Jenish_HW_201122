package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager extends Utils
{
    public void openBrowser()
    {
    // Method to open Browser

    System.setProperty("webdriver.chrome.driver","src/test/java/Driver/chromedriver.exe");
    //setting the browser and the giving the chrome's driver path

    driver=new ChromeDriver();
    //Obj of Chrome Driver

    driver.manage().window().maximize();
    //Command for maximizing Screen

    driver.get("https://demo.nopcommerce.com/");
    // Giving command to drive to go to given URL
    }

    public void closeBrowser()
    {
        //Method to close Browser

        driver.quit();
        //command to quit the browser
    }

}
