Feature: Navigate to category page

  @test

  Scenario Outline: As a user, I should able to navigate to correct category page
  when I click on menu category button

    Given I am on Home Page
    When I click on "<category>" button
    Then I should able to verify the "<page_URL>" accordingly
    And I should able to verify the page"<page_title>" accordingly

    Examples:
      | category    | page_URL                                 | page_title  |
      | Computers   | https://demo.nopcommerce.com/computers   | Computers   |
      | Electronics | https://demo.nopcommerce.com/electronics | Electronics |
      | Apparel     | https://demo.nopcommerce.com/apparel     | Apparel     |

