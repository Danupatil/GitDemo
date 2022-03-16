Feature: Application Login



@SanityTest
   Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User Login into application with username "Jan" and password "1234"
    Then Homepage is populated
    And Cards displayed are "true"
    
    Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User Login into application with username "Janu" and password "234"
    Then Homepage is populated
    And Cards displayed are "false"
 @SmokeTest  
   Scenario: Homepage default login with data pipeline
    Given User is on Netbanking landing page
    When User sign up with following details
    | jenny | abcd | jenny@gmail.com | Australia | 234567810 |
    Then Homepage is populated
    And Cards displayed are "false"
   
  @RegTest 
   Scenario Outline: Homepage default login with parameters
    Given User is on Netbanking landing page
    When User Log in into application with username <Username> and password <Password>
    Then Homepage is populated
    And Cards displayed are "true"
    
    Examples:
    | Username | Password |
    | user1    | pass1    |
    | user2    | pass2    |
    | user3    | pass3    |
    | user4    | pass4    |
    | user5    | pass5    |
    




