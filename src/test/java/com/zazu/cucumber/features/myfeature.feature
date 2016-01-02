Feature: My first Cucumber test

Scenario: Test if the title is correct
Given I am on the Zoo website
When I press the "About" link
Then the title should be "About"
