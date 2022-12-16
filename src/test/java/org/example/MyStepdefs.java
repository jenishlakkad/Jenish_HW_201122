package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepdefs {

    HomePage homePage=new HomePage();

    RegisterPage registerPage=new RegisterPage();

    RegisterCompletePage registerCompletePage=new RegisterCompletePage();

    Utils utils =new Utils();
    @Given("I am on register page")
    public void i_am_on_register_page() {
        // Write code here that turns the phrase above into concrete actions
         homePage.clickOnRegisterButton();
    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        // Write code here that turns the phrase above into concrete actions
         registerPage.registerDetails();
    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        // Write code here that turns the phrase above into concrete actions
        registerCompletePage.clickOnContinue();
    }
    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        // Write code here that turns the phrase above into concrete actions

    }


    @Given("I  click{string}")
    public void iClick(String arg0) {

    }



//    ------------------------------------------------------------------------------
    @When("I  click on {string} link")
    public void iClickOnLink(String category_name) {
        homePage.clickOnCetegory(category_name);
    }

    @Then("I should able to navigate to related {string} page successfully")
    public void iShouldAbleToNavigateToRelatedPageSuccessfully(String category_link) {
         utils.assertUrl1(category_link);
    }
}
