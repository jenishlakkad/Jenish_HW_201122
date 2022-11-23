package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class EmailAFriend extends Utils
{
    private By _friendEmail=new By.ById("FriendEmail");
    //Making the private variable and storing the command of selenium to get Locator by "id"
    private By _yourEmail=new By.ById("YourEmailAddress");
    //Making the private variable and storing the command of selenium to get Locator by "id"
    private By _personalMessage=new By.ById("PersonalMessage");
    //Making the private variable and storing the command of selenium to get Locator by "id"
    private By _sendEmail=new By.ByName("send-email");
    //Making the private variable and storing the command of selenium to get Locator by "Name"
    private By _result=new By.ByXPath("//div[@class=\"result\"]");
    //Making the private variable and storing the command of selenium to get Locator by "xPath"
    public void enterDetailsOfEmail()
    {    //Method to enter the details of emails

    Assert.assertEquals("https://demo.nopcommerce.com/productemailafriend/4",driver.getCurrentUrl());
         //Using the Assert to verify the URL

     sendText(_friendEmail,"black@gmail.com");
         //Calling sentText function to write on text Field
     sendText(_yourEmail,"");
        //Calling sentText function to write on text Field

     sendText(_personalMessage,"Hello Everyone");
        //Calling sentText function to write on text Field

     clickOnElementFunction(_sendEmail);
        //Calling clickOnElementFunction function from Util class to click

     getTextFromElement(_result);
        //Calling getTextFromElement function to get text from Page

        Assert.assertEquals("Your message has been sent.",getTextFromElement(_result));
        //Using the Assert to verify the massage displayed

    }
}
