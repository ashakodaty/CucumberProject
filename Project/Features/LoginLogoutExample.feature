Feature: This feature runs for Instructor Login to Logout with examples
 
 @validlogin @allinfyni
 Scenario Outline:User should login and logout successfully with valid data
    Given User is in login page
    When User enters email id "<email>"
    And User enters password "<password>"
    And User clicks on SignIn Button
    And User should see Instructor dashboard
    And User clicks on Profile picture
    And User clicks on Logout menu
    Then User should be able to logout   
Examples: 
      |email|password|status|
      |instructor44@mailinator.com|start123|success|
      
 @invalidlogin @allinfyni
 Scenario Outline:User should login with invalid data
    Given User is in login page
    When User enters email id "<email>"
    And User enters password "<password>"
    And User clicks on SignIn Button
    Then User should see Error message
Examples: 
    |email|password|status|
      |instructor4@mailinator.com|start13|success|  
       
@invalidemail @allinfyni
 Scenario Outline:User should login and logout successfully with invalid email
    Given User is in login page
    When User enters email id "<email>"
    And User enters password "<password>"
    And User clicks on SignIn Button
    Then User should see Error email message
 Examples: 
       |email|password|status|
       |instructor44@mailinato.com|start123|success| 
       
 @invalidpassword @allinfyni
 Scenario Outline:User should login and logout successfully with invalid Password
    Given User is in login page
    When User enters email id "<email>"
    And User enters password "<password>"
    And User clicks on SignIn Button
    Then User should see Error password message
Examples: 
      |email|password|status|
      |instructor44@mailinator.com|start13|success|
      

 