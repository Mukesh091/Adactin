Feature: Adactin hotel Booking

  Scenario Outline: Verifying adactin hotel search
    Given User is on the adactin hotel page
    When User should login "<username>" and "<password>"
    And User should search hotels "<Location>","<Hotels>","<Roomtype>","<Numberofrooms>","<Checkin>","<Checkout>","<Adultsperroom>" and "<Childrenperroom>"
    Then User should verify "Select Hotel" is present

    Examples: 
      | username    | password  | Location | Hotels      | Roomtype | Numberofrooms | Checkin    | Checkout   | Adultsperroom | Childrenperroom |
      | SuguAravind | sugu@3005 | Sydney   | Hotel Creek | Double   | 1 - One       | 20/11/2021 | 21/11/2021 | 1 - One       | 1 - One         |
