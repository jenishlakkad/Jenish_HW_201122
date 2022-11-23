package org.example;

import org.openqa.selenium.By;

public class AppleMacBookPage extends Utils
{ //AppleMacBookPage class extends Utils class by inheritance concept
    private By _emailFriend=new By.ByXPath("//button[@class='button-2 email-a-friend-button']");
    //Making the private variable and storing the command of selenium to get Locator by "xPath"


    public void clickOnEmailAFriend()
    {
        //Method to click on Email a Friend button
        clickOnElementFunction(_emailFriend);
        //calling the click function from Utils class
    }
}
