package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils
{ //RegisterPage class extends Utils class by inheritance concept
    private By _gender=By.id("gender-male");
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _firstName=By.id("FirstName");
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _lastName=By.id( "LastName" );
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _date=By.name( "DateOfBirthDay" );
    //Making the private variable and storing the command of selenium to get Locator by "name"

    private By _month=By.name("DateOfBirthMonth");
    //Making the private variable and storing the command of selenium to get Locator by "name"

    private By _year=By.name("DateOfBirthYear");
    //Making the private variable and storing the command of selenium to get Locator by "name"

    private By _eMail=By.id("Email");
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _companyName=By.id("Company");
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _password=By.id("Password");
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _confirmPassword=By.id("ConfirmPassword");
    //Making the private variable and storing the command of selenium to get Locator by "id"

    private By _registerButton=By.id("register-button");
    //Making the private variable and storing the command of selenium to get Locator by "id"


    public void registerDetails()
    {
        //Method to calling all useful functions from "Utils" class

        clickOnElementFunction(_gender);
        //click function to click on locator

        sendText(_firstName,"Jenish");
        //sentText function to write on website

        sendText(_lastName,"Lakkad");
        //sentText function to write on website

        selectFromDropdownByIndex(_date,7);
        //select function to select the "date" "locator" from dropdown with help of Index

        selectFromDropdownByValue(_month,"12");
        //select function to select the "month" "locator" from dropdown with help of Value

        selectFromDropdownByValue(_year,"2002");
        //select function to select the "year" "locator" from dropdown with help of Value

        sendText(_eMail,"jl"+getTimeStamp()+"@gmail.com");
        //sentText function to write on website

        sendText(_companyName,"LSL");
        //sentText function to write on website

        sendText(_password,"J123@.");
        //sentText function to write on website

        sendText(_confirmPassword,"J123@.");
        //sentText function to write on website

        clickOnElementFunction(_registerButton);
        //click function to click on locator

    }

}
