Feature: search
  As a end user
  I want to search
  So that i can view desired products

  Scenario: search by product
    Given I am on the home page
    When I search for a product "carrots"
    Then I should see results search by "carrot"
