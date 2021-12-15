package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;

public class MyStepDefs  {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage = new RegistrationSuccessPage();
    NewsCommentPage newsCommentPage = new NewsCommentPage();
    NewsCommentAddSuccessfullyPage newsCommentAddSuccessfullyPage = new NewsCommentAddSuccessfullyPage();
    ComputerPage computerPage = new ComputerPage();
    NavigateToDesktopPage navigateToDesktopPage = new NavigateToDesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    EmailAFriend emailAFriend = new EmailAFriend();
    EmailAFriendResult emailAFriendResult = new EmailAFriendResult();






    @Given("user is on registration page")
    public void user_is_on_registration_page() {

        homePage.ClickOnRegisterButton();

    }
    @When("user enters required registration details")
    public void user_enters_required_registration_details() {
        registrationPage.enterRegistrationDetails();

    }
    @When("click on register submit button")
    public void click_on_register_submit_button() {

    }
    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        registrationSuccessPage.registrationSuccessful();

    }



    @When("user click on details button")
    public void user_click_on_details_button() {
        homePage.clickOnNewsCommentsDetails();


    }
    @When("user fills comments form")
    public void user_fills_comments_form() {
        newsCommentPage.enternewscommentsdetails();

    }
    @When("clicks on new comment button")
    public void clicks_on_new_comment_button() {
        newsCommentPage.enternewscommentsdetails();


    }
    @Then("the user should see the NewsCommentAddSuccessfully")
    public void the_user_should_see_the_news_comment_add_successfully() {
        newsCommentAddSuccessfullyPage.newsCommentAddSuccessfully();

    }

    @Given("user is on Home page")
    public void user_is_on_home_page() {
        homePage.clickOnComputerButton();

    }

    @When("user click on Computer")
    public void user_click_on_computer() {
        computerPage.clickOnComputerButton();

    }

    @When("click on Desktop  button")
    public void click_on_desktop_button() {
        computerPage.clickOnTheDesktop();

    }

    @Then("user should able to NavigateToDesktopPage successfully")
    public void user_should_able_to_navigate_to_desktop_page_successfully() {
        navigateToDesktopPage.navigateToADesktop();


    }
    @When("user click on Desktop")
    public void user_click_on_desktop() {
       computerPage.clickOnTheDesktop();

    }
    @When("user click on BuildYourOwnComputer")
    public void user_click_on_build_your_own_computer() {
        navigateToDesktopPage.clickOnBuildYourOwnComputer();

    }
    @When("click on EmailAFriendButton  button")
    public void click_on_email_a_friend_button_button() {
        buildYourOwnComputerPage.emailAFriend();

    }
    @When("fill the comments")
    public void fill_the_comments() {
        emailAFriend.emailAFriend();


    }
    @Then("Click on Send EmailButton")
    public void click_on_send_email_button() {
        emailAFriend.emailAFriend();


    }
    @Then("user should able to send EmailAFriend  successfully")
    public void user_should_able_to_send_email_a_friend_successfully() {
        emailAFriend.emailAFriendVimal();



    }







}
