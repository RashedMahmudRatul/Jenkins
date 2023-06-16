Feature: Functionality Test For Concierge Feature

@Con
  Scenario:Verify Concierge Page
    Given a valid url
    When user click on concierge button
    And input a message on chat area
    And user hit the send button
    Then user should see the message on concierge board