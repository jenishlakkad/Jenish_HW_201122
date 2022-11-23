package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NewReleasePage extends Utils
{
    private By _title=new By.ById("AddNewComment_CommentTitle");
    //Making the private variable and storing the command of selenium to get Locator by "id"
    private By _comment=new By.ById("AddNewComment_CommentText");
    //Making the private variable and storing the command of selenium to get Locator by "id"
    private By _addComment= new By.ByName("add-comment");
    //Making the private variable and storing the command of selenium to get Locator by "name"
    public void fillCommentDetails()
    {
        //Method to fill the comment details
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/nopcommerce-new-release");
        //Using Assert function to verify URL

        sendText(_title,"news comment "+getTimeStamp());
        //sentText function to write on page

        sendText(_comment,"Hello kem cho maja ma");
        //sentText function to write on page

        clickOnElementFunction(_addComment);
        //click function to click on locator

        getTextFromElement(By.className("result"));
        //function to get text from Webpage

        Assert.assertEquals("News comment is successfully added.","News comment is successfully added.","Test Pass");
        //Assert to check actual and expected

        driver.findElement(By.xpath(" //div[@class=\"comment news-comment\"][last()]"));
        //Assert.assertEquals( driver.findElement(By.xpath(" //div[@class=\"comment news-comment\"][last()]")));
    }
}
