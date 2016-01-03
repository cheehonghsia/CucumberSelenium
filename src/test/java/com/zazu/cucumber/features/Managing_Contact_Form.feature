Feature: Filling in the Contact form

  Scenario: Fill in the Contact Us form with valid info
    Given I am on the Zoo website
    When I click on the "contact_link" link
    And Fill in the form with valid data
      | Field    | Value           |
      | Name     | John Doe        |
      | Address  | adres           |
      | Postcode | postcode        |
      | Email    | Johnny@gmailcom |
    Then I see a confirmationpage the text "We have your message"