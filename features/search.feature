Feature: Search Location
  As a user
  I want to search for a city
  So that I can find relevant information about the location
  Scenario:   Successfully searching for a city
    Given i am search a page.
    When I initiate the search
    And I enter "New York" as the search term
    And I select "Restaurants" as a filter
    And I click the search button
    Then I should see the results for "New York"
    And I should see a list of restaurants in New York
    And I should be able to select a restaurant to view its details
    And I should be able to refine my search using additional filters

  Scenario: Searching for a city with no results
    Given I am on the search page
    When I initiate the search
    And I enter "Atlantis" as the search term
    And I click the search button
    Then I should see a message "No results found"
    And I should be presented with suggestions for nearby cities
    And I should be able to modify my search terms