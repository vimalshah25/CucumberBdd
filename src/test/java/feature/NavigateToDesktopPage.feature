Feature: NavigateToDesktopPage
  As a user, I want to NavigateToDesktopPage on DemoNopeCommerce website
  so that, I can use all user features

  @test
  Scenario: User should able to NavigateToDesktopPage successfully

    Given user is on Home page
    When user click on Computer
    And click on Desktop  button
    Then user should able to NavigateToDesktopPage successfully
