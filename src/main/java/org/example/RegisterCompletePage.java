package org.example;

import org.openqa.selenium.By;

public class RegisterCompletePage extends Utils
{
    private By _continue= new By.ByXPath("//a[@class=\"button-1 register-continue-button\"]");
    //Making a private variable and storing the command of selenium to get locator "by xPath"
    public void clickOnContinue()
    {
        //Method to click on continue Button

         clickOnElementFunction(_continue);
         //calling method to click on continue button from Utils class
    }
}
