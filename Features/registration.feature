Feature: Account Registration

  Scenario: Successful Account Registration
    Given User navigates to Register Account page
    When User enters the details into below fields
      | firstname | Juby   |
      | lastname  | George  |
    And User enters valid email 
    And valid password 
    And Confirm password
    And User clicks on Register button
    Then User account should get created successfully with "Your registration completed" message
   