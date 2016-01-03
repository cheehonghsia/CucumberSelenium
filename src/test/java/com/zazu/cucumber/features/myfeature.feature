Feature: My first Cucumber test

  Background: 
  Given I am on the Zoo website

  Scenario: Test if the title is correct
    When I click on the "about_link" link
    Then I see the header displaying "ABOUT"

  Scenario: Fill in the Contact Us form with valid info
    When I click on the "contact_link" link
    And Fill in the form with valid data
      | Field    | Value           |
      | Name     | John Doe        |
      | Address  | adres           |
      | Postcode | postcode        |
      | Email    | Johnny@gmailcom |
    Then I see a confirmationpage the text "We have your message"
