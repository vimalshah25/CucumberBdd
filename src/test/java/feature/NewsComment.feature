Feature: NewsComment

  As a user, I want to NewsCommentAddSuccessfully on DemoNopeCommerce website
  so that, I can see NewsCommentAddSuccessfully
  @test
  Scenario: user should be able to NewsCommentAddSuccessfully
    When  user click on details button
    And   user fills comments form
    And   clicks on new comment button
    Then  the user should see the NewsCommentAddSuccessfully

