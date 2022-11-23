package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;

public class Utils extends BaseFile
{
    public String getTimeStamp()
    {
        //Method for time stamp for ddhhmmss
        return new SimpleDateFormat("ddHHmmss").format(new java.util.Date());
    }
    public String getTextFromElement(By by)
    {
        //Method "getText" to get text from website. By passing one parameter 'by'
        String regMsg=driver.findElement(by).getText();
        System.out.println(regMsg);
        // To print message
        return regMsg;
        //return method
    }
    public void clickOnElementFunction(By by)
    {
        //Method to click on button,image,text,field, etc. By passing one parameter 'by'
        driver.findElement(by).click();
    }
    public void sendText(By by,String name)
    {
        //Method "sendText" to write any text on website, by passing two parameter 'By' and 'String'
        driver.findElement(by).sendKeys(name);
    }

    public void waitForElementToClickAble(By by,int timeInSeconds)
    {
        //Method to wait for element to click able by passing two parameter 'By' and 'int'
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        //commanding to driver to wait
    }
    public static void waitForElementToBeVisible(By by,int duration)
    {
        //Method to wait for element to Visible by passing two parameter 'By' and 'int'
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(duration));
        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        //commanding to drover to wait
    }
    public void waitForUrlToBe(String url,int timeInSeconds)
    {
        //Method to wait for 'URL' by passing two parameter 'By' and 'int'
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.urlToBe(url));
        //commanding to driver to wait
    }

    public void hover(By xpath)
    {
        //Method to hover actions
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Obj to call an inbuild class(JavascriptExecutor) :- for hovering mouse

        js.executeScript("window.scrollBy(0,370)", "");
    }
    public void selectFromDropdownByVisibleText(By by,String a)
    {
        //Method to Dropdown by locator 'Visible Text'
        //    driver.findElement(by);
        Select select=new Select(driver.findElement(by));
        select.selectByVisibleText(a);
        //commanding to driver to drop down
    }
    public void selectFromDropdownByValue(By by,String a)
    {
        //Method to Dropdown by locator 'Value'
        //   driver.findElement(by);
        Select select=new Select(driver.findElement(by));
        select.selectByValue(a);
        //commanding to driver to drop down
    }
    public void selectFromDropdownByIndex(By by,int a)
    {
        //Method to Dropdown by locator 'Index'
        //    driver.findElement(by);
        Select select=new Select(driver.findElement(by));
        select.selectByIndex(a);
        //commanding to driver to drop down
    }

    public void captureScreenshot(String screenShortName)
    {
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
         //Move image file to new destination
        File DestFile=new File("Jenish_HW_201122\\src\\ScreenShorts"+screenShortName+getTimeStamp()+".jpg");
        //Copy file at destination
        try
        {
            FileUtils.copyFile(SrcFile, DestFile);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void clickOkOnAlert()
    {
        //Method to click on OK Alert
        driver.switchTo().alert().accept();
    }


    public void clickCancelOnAlert()
    {
        //Method to click on Cancel Alert
        driver.switchTo().alert().dismiss();
    }


    String getTextFromAlert()
    {
        //Method to Get text form Alert
       String displayMessage= driver.switchTo().alert().getText();
        System.out.println(displayMessage);
       return displayMessage;
       //Return value

    }

    public boolean isAlertPresent()
    {
        //Method to check if Alert is present or not
        try
        {
            driver.switchTo().alert();
            return true;
        }   // try
        catch (NoAlertPresentException Ex)
        {
            return false;
        }   // catch
    }   // isAlertPresent()



}

