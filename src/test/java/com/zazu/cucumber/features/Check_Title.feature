Feature: Checking title of pages

  Scenario Outline: Checking if the title matches the pages
    Given I am on the Zoo page
    When I click on <link>
    Then I see that the title is <title>

    Examples: 
      | link          | title     |
      | adoption_link | Adoption  |
      | about_link    | About Zoo |
      | contact_link  | Contact   |
