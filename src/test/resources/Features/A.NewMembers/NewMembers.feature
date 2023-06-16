Feature: Test New Accounts Functionality

  Background:
    Given a valid url
  ##+++++++++++++++++++++++++++++++++++++++++++++++++ Topup Popup ++++++++++++++++++++++++++++++++++++++++++++++++++++++
  @topup_us
  Scenario: Verify Topup popup for US members
    When topup popup appears
    And user inputs topup amount
    And user click on checkbox
    And click proceed button
    And enter card details in Stripe and clicks on pay
    And user checks success message with loader and press Ok
    Then user should see the Home page

  @topup_non_us
  Scenario: Verify Topup popup for Non-US members
    When topup popup appears
    And user inputs topup amount
    And user click on checkbox
    And click proceed button
    And enter card details in Apexx and clicks on pay
    And user checks sucess message and press Ok
    Then user should see the Home page

    ##+++++++++++++++++++++++++++++++++++++++++++++++++ First Card +++++++++++++++++++++++++++++++++++++++++++++++++++++
    @first_card_purchase @card_common
  Scenario: Verify first virtual card purchase
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user clicks on create virtual card button
    And user selects first card
    Then virtual card activation page will appear


  @card_us  @first_card_activate_us_dc
    Scenario: Verify first virtual card Activation(USD) for US members using debit card
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user selects debit card for topup for activation
    And user enters sending amount and click checkBox
    And user click on continue button
    And user checks summary and press confirm
    And enter card details in Stripe and clicks on pay
    And user enter otp and click activate button
    And user checks success message with loader and press Ok
    Then user should redirect back to virtual card page

  @card_non_us @first_card_activate_non_us_dc
  Scenario: Verify first virtual card Activation(USD) for Non-US members using debit card
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user selects debit card for topup for activation
    And user enters sending amount and click checkBox
    And user click on continue button
    And user checks summary and press confirm
    And user enter otp and click activate button
    And enter card details in Apexx and clicks on pay
    And user checks activation success message and press on back button
    Then user should redirect back to virtual card page

    ##++++++++++++++++++++++++++++++++++++++++++++++ Euro Card +++++++++++++++++++++++++++++++++++++++++++++++++++++++++
  @card_common @euro_card_purchase_dc
  Scenario: Verify Euro virtual card Purchase using debit card
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user clicks on Add virtual card button
    And user selects euro card
    And user selects debit card for payment
    And user click checkBox and clicks on continue
    And user enter otp and click purchase button
    And enter card details in Apexx and clicks on pay
    And user checks purchase success message and press on back button
    Then user should redirect back to virtual card page

  @card_us @euro_card_activate_us_dc
  Scenario: Verify Euro virtual card Activation for US members using debit card
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user selects euro virtual card
    And user selects debit card for topup for activation
    And user enters sending amount and click checkBox
    And user click on continue button
    And user checks summary and press confirm
    And enter card details in Stripe and clicks on pay
    And user enter otp and click activate button
    And user checks success message with loader and press Ok
    Then user should redirect back to virtual card page

  @card_non_us @euro_card_activate_non_us_dc
  Scenario: Verify Euro virtual card Activation for Non-US members using debit card
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user selects euro virtual card
    And user selects debit card for topup for activation
    And user enters sending amount and click checkBox
    And user click on continue button
    And user checks summary and press confirm
    And user enter otp and click activate button
    And enter card details in Apexx and clicks on pay
    And user checks activation success message and press on back button
    Then user should redirect back to virtual card page

##+++++++++++++++++++++++++++++++++++++++++++++++++++++++ Pound Card +++++++++++++++++++++++++++++++++++++++++++++++++++
  @card_common @pound_card_purchase_dc
  Scenario: Verify Pound Sterling virtual card Purchase using debit card
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user clicks on Add virtual card button
    And user selects pound card
    And user selects debit card for payment
    And user click checkBox and clicks on continue
    And user enter otp and click purchase button
    And enter card details in Apexx and clicks on pay
    And user checks purchase success message and press on back button
    Then user should redirect back to virtual card page

  @card_us @pound_card_activate_us_dc @test1
  Scenario: Verify Pound Sterling virtual card Activation for US members using debit card
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user selects pound sterling virtual card
    And user selects debit card for topup for activation
    And user enters sending amount and click checkBox
    And user click on continue button
    And user checks summary and press confirm
    And enter card details in Stripe and clicks on pay
    And user enter otp and click activate button
    And user checks success message with loader and press Ok
    Then user should redirect back to virtual card page

  @card_non_us @pound_card_activate_non_us_dc
  Scenario: Verify Pound Sterling virtual card Activation for Non-US members using debit card
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user selects pound sterling virtual card
    And user selects debit card for topup for activation
    And user enters sending amount and click checkBox
    And user click on continue button
    And user checks summary and press confirm
    And user enter otp and click activate button
    And enter card details in Apexx and clicks on pay
    And user checks activation success message and press on back button
    Then user should redirect back to virtual card page

    ##+++++++++++++++++++++++++++++++++++++++++++++++++++++ Accounts +++++++++++++++++++++++++++++++++++++++++++++++++++
  @accounts @first_card_acc
  Scenario: Verify first virtual card Activation using Wallet
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user clicks on create virtual card button
    And user selects first card
    Then virtual card activation page will appear

  @first_card_purchase_acc
  Scenario: Verify first virtual card Activation(USD) for US members using Wallet
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user selects accounts for topup for activation
    And user enters sending amount and click continue button
    And user clicks on confirm button
    And user enter otp and click activate button
    And user checks activation success message and press on back button
    Then user should redirect back to virtual card page

  @accounts @euro_card_purchase_accounts
  Scenario: Verify Euro virtual card purchase using Wallet
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user clicks on Add virtual card button
    And user selects euro card
    And user selects accounts for payment
    And user clicks on continue button
    And user enter otp and click purchase button
    And user checks purchase success message and press on back button
    Then user should redirect back to virtual card page

  @accounts @euro_card_activate_accounts
  Scenario: Verify Euro virtual card Activation using Wallet
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user selects euro virtual card
    And user selects accounts for topup for activation
    And user enters sending amount and click continue button
    And user clicks on confirm button
    And user enter otp and click activate button
    And user checks activation success message and press on back button
    Then user should redirect back to virtual card page

  @accounts @pound_card_purchase_accounts
  Scenario: Verify Pound virtual card Purchase using Wallet
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user clicks on Add virtual card button
    And user selects pound card
    And user selects accounts for payment
    And user clicks on continue button
    And user enter otp and click purchase button
    And user checks purchase success message and press on back button
    Then user should redirect back to virtual card page

  @accounts @pound_card_activate_accounts
  Scenario: Verify Pound virtual card Activation using Wallet
    When user clicks on cards on side menu
    And user clicks on virtual cards tab
    And user selects pound sterling virtual card
    And user selects accounts for topup for activation
    And user enters sending amount and click continue button
    And user clicks on confirm button
    And user enter otp and click activate button
    And user checks activation success message and press on back button
    Then user should redirect back to virtual card page
##++++++++++++++++++++++++++++++++++++++++++++++++++++ Beneficiary and Activate ++++++++++++++++++++++++++++++++++++++++
  @beneficiary
  Scenario: Verify Beneficiary creation for Transfer to another member in Payment
    When user clicks on account button
    And user clicks on USD wallet
    And user clicks payments tab
    And user clicks on transfer to a member pay
    And user clicks on transfer to another member wallet
    And user input valid wallet number "270826231"
    And user input reference name "Hodl T ten"
    And user clicks on next button
    Then saved beneficiary wallet number should appear in summary section

  @activate
  Scenario: Verify Physical card Activation
    When user clicks on cards on side menu
    And user clicks on physical card
    And user clicks activate tab
    And user inputs last four digit "8651" of physical card
    And user clicks verify button
    And user inputs password and clicks on confirm button
    And user press on back button
    Then physical card status should change to active




