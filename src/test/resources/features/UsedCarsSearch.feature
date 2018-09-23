@Used-Search-Cars
Feature: Acceptance testing to validate usedSearch cars page is working
  In order to validate that
  the Used search cars page is working fine
  we will do the acceptance testing

  @Used-Search-Cars-Positive
  Scenario: Validate used search cars page
    Given I am on the Home Page "https://www.carsguide.com.au/" of CarsGuide website
    When I move to the menu
      | Menu          |
      | Cars for Sale |
      | Sell My Car   |
    And click on "Used Search Cars" link on Used Search Car page
    And select car brand as "AUDI" from AnyMake dropdown on Used Search Car page
    And select car model on Used Search Car page
      | carModel  |
      | A4        |
      | A3        |
    And select location as "SA - All" from SelectLocation dropdown on Used Search Car page
    And select price as "$2,000" from Price dropdown on Used Search Car page
    And click on Find_My_Next_Car button on Used Search Car page
    Then I should see a list of searched cars on Used Search Car page
    And the page title should be "Used Audi A4 Under 2000 for Sale SA | carsguide"



