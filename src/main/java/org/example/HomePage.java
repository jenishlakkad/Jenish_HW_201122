package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils
{
    private By _customerCurrency=new By.ByName("customerCurrency");
    //Making the private variable and storing the command of selenium to get Locator by "Name"

    private By _vote=new By.ById("vote-poll-1");
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _details=new By.ByXPath("//div[@class=\"buttons\"]/a[@href=\"/nopcommerce-new-release\"]");
    //Making the private variable and storing the command of selenium to get Locator by "xPath"

    private By _faceBook=new By.ByLinkText("Facebook");
    //Making the private variable and storing the command of selenium to get Locator by "LinkText"

    private By _registration=By.linkText("Register");
    //Making the private variable and storing the commanding of selenium to get linkText

    private By _macBook=new By.ByXPath("//img[@src=\"https://demo.nopcommerce.com/images/thumbs/0000024_apple-macbook-pro-13-inch_415.jpeg\"]");
    //Making the private variable and storing the command of selenium to get Locator by "xPath"




    public void verifyUsdSymbol()
    {
        //Method to verify Usd symbol
        selectFromDropdownByVisibleText(_customerCurrency,"US Dollar");
        //Calling method selectFromDropdownByVisibleText to select from dropdown

        List<WebElement> currency=driver.findElements(By.xpath("//div[@class=\"prices\"]"));
        //Array list to find all the currency symbol By using xPath
        for (WebElement x:currency)
        {
            //Running the foreach loop to verify $ icon
            Assert.assertTrue(x.getText().contains("$"),x.getText());
            //Using Assert to verify currency must contain $ icon and compare actual and excepted
            System.out.println(x.getText());
            //To Display the price
        }
        System.out.println();
        //sot to live line
    }


    public void verifyEuroSymbol()
    {
        //Method to verify Euro symbol

        selectFromDropdownByVisibleText(_customerCurrency,"Euro");
        //Calling method selectFromDropdownByVisibleText to select from dropdown
        List<WebElement> currency=driver.findElements(By.xpath("//div[@class=\"prices\"]"));
        //Array list to find all the currency symbol By using xPath
        for (WebElement x:currency)
        {
            //Running the foreach loop to verify $ icon
            Assert.assertTrue(x.getText().contains("€"),x.getText());
            //Using Assert to verify currency must contain $ icon and compare actual and excepted
            System.out.println(x.getText());
            //To Display the price
        }
    }

//----------------------------------------------------------------------------------------------------------------------
    public void clickOnVoteButton()
    {
        //Method to click on vote button
        clickOnElementFunction(_vote);
        //calling clickOnElementFunction form Utils class to click on vote button
        isAlertPresent();
        //Calling method to verify alert is present or not
        getTextFromAlert();
        //Calling method to get Text from Alert pop up
        clickOkOnAlert();
        //Method to click on OK alert

    }



//--------------------------------------------------------------------------------------------
    public void clickOnDetails()
    {
        //Method to click on details button
        clickOnElementFunction(_details);
        //calling clickOnElementFunction form Utils class to click on Details button

    }
//    -----------------------------------------------------------------------------------------------
    public void clickOnFacebookIcon()
    {
        //Method to click on Facebook icon
        clickOnElementFunction(_faceBook);
        //calling clickOnElementFunction form Utils class to click on Details button
    }
//    -------------------------------------------------------------------------------------------------

    public void clickOnRegisterButton()
    {
        //Method to click on the Register Button
        clickOnElementFunction(_registration);
        //click on element function to click on " Register "
    }

    public void clickOnAppleMavBook()
    {
        //Method to click on mackbook
        clickOnElementFunction(_macBook);
        //click on element function to click on " _macBook "
    }

//    ------------------------------------------------------------------------------------------------------

    public void clickOnSearchBar()
    {
        clickOnElementFunction(By.id("small-searchterms"));
        sendText(By.id("small-searchterms"),"nike");
        clickOnElementFunction(By.xpath("//button[@class=\"button-1 search-box-button\"]"));
    }

    public void hoverOnComputer(){
        hoverAction2(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]"));
        clickOnElementFunction(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/ul[@class=\"sublist first-level\"]//a[@href=\"/desktops\"]"));

    }


}
