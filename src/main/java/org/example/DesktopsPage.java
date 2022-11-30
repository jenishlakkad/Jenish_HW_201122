package org.example;

import org.testng.Assert;

public class DesktopsPage extends Utils
{
    public void verifyUrl()
    {
        //Method to verify Url

        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/desktops");
        //Using Assert to verify Url
    }
}
