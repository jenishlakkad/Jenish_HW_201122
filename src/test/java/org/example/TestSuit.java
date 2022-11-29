package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest
{
   HomePage homePage=new HomePage();
   //Object of HomePage class
   NewReleasePage newReleasePage=new NewReleasePage();
    //Object of NewReleasePage class
   FaceBookPage faceBookPage=new FaceBookPage();
    //Object of FaceBookPage class
   RegisterPage registerPage=new RegisterPage();
   //making registerPage method to use function of RegisterPage class

   RegisterCompletePage registerCompletePage=new RegisterCompletePage();
    //Object of RegisterCompletePage class
   AppleMacBookPage appleMacBookPage=new AppleMacBookPage();
    //Object of AppleMacBookPage class
   EmailAFriend emailAFriend=new EmailAFriend();
    //Object of EmailAFriend class

    SearchNikePage searchNikePage= new SearchNikePage();
    //Object of SearchNikePage class

    DesktopsPage desktopsPage=new DesktopsPage();

   @Test public void toVerifyUserShouldSeeSelectedCurrency()
   {
       Assert.assertEquals("https://demo.nopcommerce.com/",driver.getCurrentUrl());
       //Using the Assert to verify the URL
       homePage.verifyUsdSymbol();
       //calling method from HomePage
       homePage.verifyEuroSymbol();
       //Assert.assertEquals(3,2);

   }

  @Test public void toVerifyUserShouldNotAbleToVoteWithoutSelectingExperience()
  {
      Assert.assertEquals("https://demo.nopcommerce.com/",driver.getCurrentUrl());
      //Using the Assert to verify the URL
      homePage.clickOnVoteButton();
      //calling method from HomePage
   }
   @Test public void toVerifyUserShouldAbleToAddCommentAndSeeRecentCommentAtTheBottomOfCommentList()
   {
       Assert.assertEquals("https://demo.nopcommerce.com/",driver.getCurrentUrl());
       //Using the Assert to verify the URL
       homePage.clickOnDetails();
       //calling method from HomePage
       Assert.assertEquals("https://demo.nopcommerce.com/nopcommerce-new-release",driver.getCurrentUrl());
       //Using the Assert to verify the URL
       newReleasePage.fillCommentDetails();
       //How to check the resent comment is added to the bottom of its list is remaining

   }

   @Test public void toVerifyUserShouldAbleToGoOnFacebookPageAndComeBack()
   {
       Assert.assertEquals("https://demo.nopcommerce.com/",driver.getCurrentUrl());
       //Using the Assert to verify the URL
       homePage.clickOnFacebookIcon();
       //calling method from HomePage

       faceBookPage.toGoOnFaceBookPage();
       //calling method from FaceBookPage
   }

   @Test public void registerUserShouldAbleToReferAppleMacToAFriendSuccessfully()
   {
       Assert.assertEquals("https://demo.nopcommerce.com/",driver.getCurrentUrl());
       //Using the Assert to verify the URL
       homePage.clickOnRegisterButton();
       //calling method clickOnRegisterButton

       registerPage.registerDetails();
       //calling method registerDetails

       registerCompletePage.clickOnContinue();
       //calling method from registerCompletePage

       homePage.clickOnAppleMavBook();
       //calling method from homePage

       appleMacBookPage.clickOnEmailAFriend();
       //calling method from appleMacBookPage

       emailAFriend.enterDetailsOfEmail();
       //calling method from emailAFriend

   }

   @Test public void toVerifyUserShouldSeeNikeTextInTitleOfProduct(){
   homePage.clickOnSearchBar();
       //calling method from homePage
   searchNikePage.verifyNikeText();
       //calling method from searchNikePage
   }
   @Test public void xyz()
   {
       homePage.hoverOnComputer();
       desktopsPage.verifyUrl();

   }

}
