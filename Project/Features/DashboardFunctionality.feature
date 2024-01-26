

Feature: Dashboard Functionality

  
 @alldash
 Scenario: User views the dashboard with valid credentials
    Given User is in login page 
    When User enters valid credentials 
    Then User should see Instructor dashboard
    And User verifies the dash board 
    And User clicks on Profile picture
    And User clicks on Logout menu
    Then User should be able to logout 
     