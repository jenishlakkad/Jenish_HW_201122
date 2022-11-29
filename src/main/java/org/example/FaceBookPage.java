package org.example;

import org.testng.Assert;

import java.util.ArrayList;

public class FaceBookPage extends Utils
{    //FaceBookPage class extends Utils class by inheritance concept
    public void toGoOnFaceBookPage()
    {
        //Method to go on next tab and come back to parent tab
      //  waitForUrlToBe("https://www.facebook.com/nopCommerce",5);

        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        //Command to Switch to next tab
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce","Url of website is correct");
        //Using Assert function to verify URL
        driver.close();
        //Command to close child tab
        driver.switchTo().window(tabs2.get(0));
        //Command to come back to parent tab
    }

}
