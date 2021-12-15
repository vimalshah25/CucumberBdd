Feature: EmailAFriend
  As a user, I want to EmailAFriend on DemoNopeCommerce website
  so that, I can use all user features

  @test
  Scenario: User should able to EmailAFriend successfully

    Given user is on Home page
    When user click on Computer
    When user click on Desktop
    When user click on BuildYourOwnComputer

    And click on EmailAFriendButton  button
    And fill the comments
    Then Click on Send EmailButton
    Then user should able to send EmailAFriend  successfully
