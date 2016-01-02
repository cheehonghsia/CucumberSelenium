Feature: My first Cucumber test

  Scenario: Test if the title is correct
    Given I am on the Zoo website
    When I click on the About link
    Then I see the header displaying "ABOUT"
