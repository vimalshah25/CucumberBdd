Feature: New comment successfully added

  As a user, I want to new comment add successfully on DemoNopeCommerce website
  so that, I can use all user features
  @test
  Scenario: User should able to new comment add successfully

    Given user is already registred
    When user click on new online store is open
    And  user verify that he successfully open new online store page
    And  user enter title and comment
    And  click on new comment button
    And user see the message News comment is successfully added
    Then user verify that his comment of bottom of the comment list
