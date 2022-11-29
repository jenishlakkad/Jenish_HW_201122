package org.example;

import org.testng.Assert;

public class DesktopsPage extends Utils
{
    public void verifyUrl(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/desktops");
    }
}
