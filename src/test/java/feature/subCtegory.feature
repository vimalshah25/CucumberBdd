Feature: As a user navigate to subcategory pages

  Scenario Outline: As a user, I should be Able to Navigate to subcategory pages

    Given I am on Home Page
    When  I click on "<category>" button
    And   I click on "<Subcategory>"
    Then  I should able to verify the "<page_Url>" accordingly
    And   I should able to verify the page"<page_title>" accordingly

    Examples:
    | category       | Subcategory       | page_Url                                  | page_title      |
    | Computers      | Desktops          | https://demo.nopcommerce.com/desktops     | Desktops        |
    | Computers      | Notebooks         | https://demo.nopcommerce.com/notebooks    | Notebooks       |
    | Computers      | Software          | https://demo.nopcommerce.com/software     | Software        |
    | Electronics    | Camera & photo    | https://demo.nopcommerce.com/camera-photo | Camera & photo  |
    | Electronics    | Cell phones       | https://demo.nopcommerce.com/cell-phones  | Cell phones     |
    | Electronics    | Others            | https://demo.nopcommerce.com/others       | Others          |
    | Apparel        | Shoes             | https://demo.nopcommerce.com/shoes        | Shoes           |
    | Apparel        | Clothing          | https://demo.nopcommerce.com/clothing     | Shoes           |
    | Apparel        | Accessories       | https://demo.nopcommerce.com/accessories  | Accessories     |