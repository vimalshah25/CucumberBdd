package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
    CategoryUrl categoryUrl = new CategoryUrl();
    NewOnlineStoreIsOpen newOnlineStoreIsOpen = new NewOnlineStoreIsOpen();
    NewOnlineIsOpenSuccessfullyPage newOnlineIsOpenSuccessfullyPage = new NewOnlineIsOpenSuccessfullyPage();
    BuildYourOwnComputer1 buildYourOwnComputer = new BuildYourOwnComputer1();
    ShoppingCart shoppingCart = new ShoppingCart();
    CheckOut checkOut = new CheckOut();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInformationPage paymentInformationPage = new PaymentInformationPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    OrderConfirmSuccessPage orderConfirmSuccessPage = new OrderConfirmSuccessPage();







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
    @Given("I am on Home Page")
    public void i_am_on_home_page() {

    }
    @When("I click on {string} button")
    public void i_click_on_button(String string) {
     homePage.clickOnCategory(string);


    }
    @Then("I should able to verify the {string} accordingly")
    public void i_should_able_to_verify_the_accordingly(String string) {
        categoryUrl.verifyUrl(string);



    }


    @And("I should able to verify the page{string} accordingly")
    public void iShouldAbleToVerifyThePageAccordingly(String string) {
        categoryUrl.verifyPageTitle(string);

    }

    @Given("user is already registred")
    public void user_is_already_registred() {
        homePage.ClickOnRegisterButton();
        registrationPage.enterRegistrationDetails();
        registrationSuccessPage.clickOnContinueOnRegistrationSuccessfulPage();
        homePage.clickOnNewOnlineStoreIsOpen();


    }
    @When("user click on new online store is open")
    public void user_click_on_new_online_store_is_open() {
        newOnlineStoreIsOpen.userTypeTitle();


    }
    @When("user verify that he successfully open new online store page")
    public void user_verify_that_he_successfully_open_new_online_store_page() {



    }
    @When("user enter title and comment")
    public void user_enter_title_and_comment() {
        newOnlineStoreIsOpen.userTypeTitle();


    }
    @When("click on new comment button")
    public void click_on_new_comment_button() {


    }
    @When("user see the message News comment is successfully added")
    public void user_see_the_message_news_comment_is_successfully_added() {



    }
    @Then("user verify that his comment of bottom of the comment list")
    public void user_verify_that_his_comment_of_bottom_of_the_comment_list() {

    }
    @Given("user is on homepage")
    public void user_is_on_homepage() {



    }
    @When("user click on facebook icon")
    public void user_click_on_facebook_icon() {
        homePage.facebookWindowHandling();


    }
    @Then("user should able to see facebook page url with page of DemoNopeCommerce website")
    public void user_should_able_to_see_facebook_page_url_with_page_of_demo_nope_commerce_website() {


    }
    @Given("user is already on homepage")
    public void user_is_already_on_homepage() {

    }
    @When("click on vote button")
    public void click_on_vote_button() {
        homePage.clickOnVoteButton();

    }
    @Then("I should able to click on ok button of alert popup box of DemoNopeCommerce website")
    public void i_should_able_to_click_on_ok_button_of_alert_popup_box_of_demo_nope_commerce_website() {


    }
    @Given("I am already on homepage")
    public void i_am_already_on_homepage() {
        homePage.ClickOnRegisterButton();
        registrationPage.enterRegistrationDetails();
        registrationSuccessPage.registrationSuccessful();
        registrationSuccessPage.clickOnContinueOnRegistrationSuccessfulPage();
        homePage.clickOnBuildYourOwnComputer1();


    }
    @When("I click on Build your own computer")
    public void i_click_on_build_your_own_computer() {
        buildYourOwnComputer.userShouldAbleToSelectSpecificFunction();


    }
    @When("select specific processor and RAM from dropdown")
    public void select_specific_processor_and_ram_from_dropdown() {

    }
    @When("click on radio button of specific HDD and operating system")
    public void click_on_radio_button_of_specific_hdd_and_operating_system() {

    }
    @When("select software from software list")
    public void select_software_from_software_list() {

    }
    @When("click on Add to cart")
    public void click_on_add_to_cart() {


    }
    @When("I click on shopping cart from popup")
    public void i_click_on_shopping_cart_from_popup() {
        shoppingCart.toVerifyTermsAndConditions();


    }
    @When("click on check box of terms and condition")
    public void click_on_check_box_of_terms_and_condition() {


    }
    @When("click on checkout button")
    public void click_on_checkout_button() {


    }
    @When("fill all require details in billing address page")
    public void fill_all_require_details_in_billing_address_page() {
        checkOut.userShouldVerifyBillingAddress();

    }
    @When("click on continue button")
    public void click_on_continue_button() {
        shippingMethodPage.userShouldConfirmShipping();



    }
    @When("click in continue button on shipping method page")
    public void click_in_continue_button_on_shipping_method_page() {




    }
    @When("select any one method for payment and click on continue button")
    public void select_any_one_method_for_payment_and_click_on_continue_button() {
        paymentMethodPage.userShouldBeVerifyPaymentMethod();




    }
    @When("fill all details of payment information and click on continue button")
    public void fill_all_details_of_payment_information_and_click_on_continue_button() {
        paymentInformationPage.userShouldEnterCorrectPaymentDetails();


    }
    @When("click on confirm button on confirm order page")
    public void click_on_confirm_button_on_confirm_order_page() {
        confirmOrderPage.userShouldVerifyConfirmOrder();

    }
    @Then("I can see message of order successful")
    public void i_can_see_message_of_order_successful() {
        orderConfirmSuccessPage.toVerifyUserShouldPlacedOrderSuccessfully();



    }


    @And("I click on {string}")
    public void iClickOn(String string) {
        homePage.mouseHoover(string);
    }
}
