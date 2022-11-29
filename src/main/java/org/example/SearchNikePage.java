package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchNikePage extends Utils
{
    public void verifyNikeText()
    {
        //Method to verify Nike text

        List<WebElement> text=driver.findElements(By.xpath("//div[@class=\"details\"]//h2"));
        //Array list to find all the currency symbol By using xPath
        for (WebElement x:text)
        {
            //Running the foreach loop to verify $ icon
            Assert.assertTrue(x.getText().contains("Nike"),x.getText());
            //Using Assert to verify currency must contain $ icon and compare actual and excepted
            System.out.println(x.getText());
            //To Display the price
      //     Assert.assertTrue(x.getText().contentEquals("Nike"),x.getText());
        }
        System.out.println();
        //sot to live line
    }
}
