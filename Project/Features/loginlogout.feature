Feature: This feature runs for Instructor Login to Logout
 
 @validlogin @all
 Scenario: User should login and logout successfully with valid data
    Given User is in login page
    When User enters email id "instructor44@mailinator.com"
    And User enters password "start123"
    And User clicks on SignIn Button
    And User should see Instructor dashboard
    And User clicks on Profile picture
    And User clicks on Logout menu
    Then User should be able to logout   

 @invalidlogin @all
 Scenario: User should login with invalid data
    Given User is in login page
    When User enters email id "instructor44@mailinato.com"
    And User enters password "start13"
    And User clicks on SignIn Button
    Then User should see Error message
    
@invalidemail @all
 Scenario: User should login and logout successfully with valid data
    Given User is in login page
    When User enters email id "instructor44@mailinato.com"
    And User enters password "start123"
    And User clicks on SignIn Button
    Then User should see Error email message
  
 @invalidpassword @all
 Scenario: User should login and logout successfully with valid data
    Given User is in login page
    When User enters email id "instructor44@mailinator.com"
    And User enters password "start13"
    And User clicks on SignIn Button
    Then User should see Error password message  
