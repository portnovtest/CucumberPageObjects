@Search-Cars
Feature: Acceptance testing to validate Search cars page is working
  In order to validate that
  the search cars page is working fine
  we will do the acceptance testing

  @Search-Cars-Positive
  Scenario: Validate search cars page
    Given I am on the Home Page "https://www.carsguide.com.au/" of CarsGuide website
    When I move to the menu
      | Menu          |
      | Cars for Sale |
      | Sell My Car   |
    And click on "Search Cars" link
    And select car brand as "BMW" from AnyMake dropdown
    And select car model as "1 SERIES" from SelectModel dropdown
    And select location as "Australia" from SelectLocation dropdown
    And select price as "$1,000" from Price dropdown
    And click on Find_My_Next_Car button
    Then I should see a list of searched cars
    And the page title should be "BMW 1 Series Cars Under 1000 for sale | Cars Guide |"


