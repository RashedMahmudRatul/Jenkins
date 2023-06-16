Feature: Functionality Test For Instance Rewards Feature

  Background:
  Given a valid url
  @tagReward
  Scenario: Verify Instance Rewards Option
  When user click on instance rewards options
  And user will choose card from card option
  And user will click select button from the card list
  Then user should see the payment method page

  @tagReward
  Scenario: Verify Payment Methode Work Perfectly
  When user in the payment methode
  And user input some text if need
  And user select wallet from wallet list
  And user click on redeem button
  And user click on see order button
  Then user should see the order successful page

  @tagReward
  Scenario:Verify Reward Is Successfully Done
    When user in successful rewards page
    And  user click on close button
    And  user click on your rewards tab
    Then user should see his reward cards




