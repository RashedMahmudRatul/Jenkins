Feature: Test functionality of Card page
  Background:
    Given a valid url

  @common @test
  Scenario: Verify Load Functionality of Physical Card
    When user clicks on cards on side menu
    And user clicks on physical card
    And user clicks on load tab
    And user enters amount to load "180"
    And user checks overview
    And user clicks confirm button
    And user provides otp and clicks confirm button again
    And user checks transfer success message and press ok button
    Then user should redirect back to physical card page

  @common
  Scenario: Verify Unload Functionality of Physical Card
    When user clicks on cards on side menu
    And user clicks on physical card
    And user clicks on unload tab
    And user enters amount to unload
    And user checks overview
    And user clicks confirm button
    And user provides otp and clicks confirm button again
    And user checks transfer success message and press ok button
    Then user should redirect back to physical card page

    #Topup only for clubswan
  @clubswan_us
  Scenario: Verify Topup Functionality of Physical Card for US members
    When user clicks on cards on side menu
    And user clicks on physical card
    And user clicks on topup tab
    And user selects amount to topup
    And clicks on topup button
    And user checks summary
    And user clicks confirm button for topup
    And enter card details in Stripe and clicks on pay
    And user checks topup confirmation message and clicks ok button
    Then user should redirect back to physical card page

  @clubswan_non_us
  Scenario: Verify Topup Functionality of Physical Card for Non-US members
    When user clicks on cards on side menu
    And user clicks on physical card
    And user clicks on topup tab
    And user selects amount to topup
    And clicks on topup button
    And user checks summary
    And user clicks confirm button for topup
    And enter card details in Apexx and clicks on pay
    And user checks topup confirmation message and clicks ok button
    Then user should redirect back to physical card page

  @common
  Scenario: Verify Pin Functionality of Physical Card
    When user clicks on cards on side menu
    And user clicks on physical card
    And user clicks on pin tab
    And user inputs password
    And user clicks on submit
    Then card pin should appear

  @common
  Scenario: Verify Digital Card Functionality of Physical Card
    When user clicks on cards on side menu
    And user clicks on physical card
    And user clicks on digital card tab
    And user inputs otp
    And user clicks on show card details button
    Then card details should appear

  @common
  Scenario: Verify Statement Tab of Physical Card
    When user clicks on cards on side menu
    And user clicks on physical card
    And user clicks on statements Tab
    And user clicks on download button if any statement available
    Then a statement will be downloaded

  @common
  Scenario: Verify Transaction Tab of Physical Card
    When user clicks on cards on side menu
    And user clicks on physical card
    When user clicks on transaction tab
    And latest transactions should appear in  your transactions section
    Then user should be able to export transactions as pdf and csv

##++++++++++++++++++++++++++++++++++++++++++++++++++++ First Virtual Card ++++++++++++++++++++++++++++++++++++++++++++++
  @common
  Scenario: Verify Load Functionality of First Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    And user clicks on load tab
    And user enters amount to load "550"
    And user checks overview
    And user clicks confirm button
    And user provides otp and clicks confirm button again
    And user checks transfer success message and press ok button
    Then user should redirect back to physical card page

  @common
  Scenario: Verify UnLoad Functionality of First Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    When user clicks on unload tab
    And user enters amount to unload
    And user checks overview
    And user clicks confirm button
    And user provides otp and clicks confirm button again
    And user checks transfer success message and press ok button
    Then user should redirect back to physical card page

  @clubswan_us
  Scenario: Verify Topup Functionality of First Virtual Card for US members
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    And user clicks on topup tab
    And user selects amount to topup
    And clicks on topup button
    And user checks summary
    And user clicks confirm button for topup
    And enter card details in Stripe and clicks on pay
    And user checks topup confirmation message and clicks ok button
    Then user should redirect back to virtual card page


  @clubswan_non_us
  Scenario: Verify Topup Functionality of First Virtual Card for Non-US members
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    And user clicks on topup tab
    And user selects amount to topup
    And clicks on topup button
    And user checks summary
    And user clicks confirm button for topup
    And enter card details in Apexx and clicks on pay
    And user checks topup confirmation message and clicks back button
    Then user should redirect back to virtual card page

  @common
  Scenario: Verify Pin Functionality of First Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    And user clicks on pin tab
    And user inputs password
    And user clicks on submit
    Then card pin should appear

  @common
  Scenario: Verify Digital Card Functionality of  First Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    And user clicks on digital card tab
    And user inputs otp
    And user clicks on show card details button
    Then card details should appear

  @common
  Scenario: Verify Transaction Tab of First Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    And user clicks on transaction tab
    And latest transactions should appear in  your transactions section
    Then user should be able to export transactions as pdf and csv

  @common
  Scenario: Verify Statement Tab of First Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on first virtual card
    And user clicks on statements Tab
    And user clicks on download button if any statement available
    Then a statement will be downloaded

##++++++++++++++++++++++++++++++++++++++++++++++++++++ Second Virtual Card +++++++++++++++++++++++++++++++++++++++++++++
  @common
  Scenario: Verify Load Functionality of Second Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on second virtual card
    And user clicks on load tab
    And user enters amount to load "350"
    And user checks overview
    And user clicks confirm button
    And user provides otp and clicks confirm button again
    And user checks transfer success message and press ok button
    Then user should redirect back to physical card page

  @common
  Scenario: Verify UnLoad Functionality of Second Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on second virtual card
    When user clicks on unload tab
    And user enters amount to unload
    And user checks overview
    And user clicks confirm button
    And user provides otp and clicks confirm button again
    And user checks transfer success message and press ok button
    Then user should redirect back to physical card page


  @clubswan_us
  Scenario: Verify Topup Functionality of Second Virtual Card for US members
    When clicks on virtual card tab from card page
    And user clicks on second virtual card
    And user clicks on topup tab
    And user selects amount to topup
    And clicks on topup button
    And user checks summary
    And user clicks confirm button for topup
    And enter card details in Stripe and clicks on pay
    And user checks topup confirmation message and clicks ok button
    Then user should redirect back to virtual card page


  @clubswan_non_us
  Scenario: Verify Topup Functionality of Second Virtual Card for Non-US members
    When clicks on virtual card tab from card page
    And user clicks on second virtual card
    And user clicks on topup tab
    And user selects amount to topup
    And clicks on topup button
    And user checks summary
    And user clicks confirm button for topup
    And enter card details in Apexx and clicks on pay
    And user checks topup confirmation message and clicks back button
    Then user should redirect back to virtual card page

  @common
  Scenario: Verify Pin Functionality of Second Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on second virtual card
    And user clicks on pin tab
    And user inputs password
    And user clicks on submit
    Then card pin should appear

  @common
  Scenario: Verify Digital Card Functionality of  Second Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on second virtual card
    And user clicks on digital card tab
    And user inputs otp
    And user clicks on show card details button
    Then card details should appear

  @common
  Scenario: Verify Transaction Tab of Second Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on second virtual card
    And user clicks on transaction tab
    And latest transactions should appear in  your transactions section
    Then user should be able to export transactions as pdf and csv

  @common
  Scenario: Verify Statement Tab of Second Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on second virtual card
    And user clicks on statements Tab
    And user clicks on download button if any statement available
    Then a statement will be downloaded

    ##++++++++++++++++++++++++++++++++++++++++++++++++++++ Third Virtual Card +++++++++++++++++++++++++++++++++++++++++++++
  @common
  Scenario: Verify Load Functionality of Third Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on third virtual card
    And user clicks on load tab
    And user enters amount to load "150"
    And user checks overview
    And user clicks confirm button
    And user provides otp and clicks confirm button again
    And user checks transfer success message and press ok button
    Then user should redirect back to physical card page

  @common
  Scenario: Verify UnLoad Functionality of Third Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on third virtual card
    When user clicks on unload tab
    And user enters amount to unload
    And user checks overview
    And user clicks confirm button
    And user provides otp and clicks confirm button again
    And user checks transfer success message and press ok button
    Then user should redirect back to physical card page


  @clubswan_us
  Scenario: Verify Topup Functionality of Third Virtual Card for US members
    When clicks on virtual card tab from card page
    And user clicks on third virtual card
    And user clicks on topup tab
    And user selects amount to topup
    And clicks on topup button
    And user checks summary
    And user clicks confirm button for topup
    And enter card details in Stripe and clicks on pay
    And user checks topup confirmation message and clicks ok button
    Then user should redirect back to virtual card page


  @clubswan_non_us
  Scenario: Verify Topup Functionality of Third Virtual Card for Non-US members
    When clicks on virtual card tab from card page
    And user clicks on third virtual card
    And user clicks on topup tab
    And user selects amount to topup
    And clicks on topup button
    And user checks summary
    And user clicks confirm button for topup
    And enter card details in Apexx and clicks on pay
    And user checks topup confirmation message and clicks back button
    Then user should redirect back to virtual card page

  @common
  Scenario: Verify Pin Functionality of Third Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on third virtual card
    And user clicks on pin tab
    And user inputs password
    And user clicks on submit
    Then card pin should appear

  @common
  Scenario: Verify Digital Card Functionality of  Third Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on third virtual card
    And user clicks on digital card tab
    And user inputs otp
    And user clicks on show card details button
    Then card details should appear

  @common
  Scenario: Verify Transaction Tab of Third Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on third virtual card
    And user clicks on transaction tab
    And latest transactions should appear in  your transactions section
    Then user should be able to export transactions as pdf and csv

  @common
  Scenario: Verify Statement Tab of Third Virtual Card
    When clicks on virtual card tab from card page
    And user clicks on third virtual card
    And user clicks on statements Tab
    And user clicks on download button if any statement available
    Then a statement will be downloaded

