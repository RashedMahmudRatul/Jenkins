Feature: Functionality Test For Shopping Feature

  Background:
    Given a valid url

    @tagShopping
    Scenario: Verify Shopping New Request
    When user click on shopping button
    And user click on new request tab
    And user input description
    And user input brand name
    And user input style
    And user input color
    And user input weblink
    And user hit the create request button
    Then user should see the created shopping request and status should be 'Search in progress'

    @tagShopping
    Scenario: Verify dropdown functionalities in Shopping page
      When user is on shopping tab
      And user selects in progress from status dropdown
      And shopping requests is in progress status should appear
      And user selects complete from status dropdown
      And shopping requests is complete status should appear
      And user selects all from status dropdown
      Then all shopping requests should appear



