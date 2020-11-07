Feature: Login to the Harry Potter API

  Scenario: User should login to the API with valid credentials
    Given User get the current information from API for end point "characters"
    When status code should be 200
    And "_id" should not be empty

  @smoke
  Scenario: User should get the information from API
    Given User get the current information from API for end point "characters"
    When status code should be 200
    Then User should get the "house" of below names
      | Ronald Weasley |
      | Percy Weasley  |
      | Fred Weasley   |
      | Harry Potter   |
      | Gregory Goyle  |

  @wip
  Scenario: User should see the houses informations from the API
    Given User get the current information from API for end point "houses"
    When status code should be 200
    Then Houses should include following items
      | Ravenclaw  |
      | Gryffindor |
