Feature: Application Login

#Background: 
#Given validate the browser
#When Browser is triggered
#Then Check if browser is started

@RegTest
Scenario: Home page default login
Given User is at landing page
When User logs in into application with "john" and password "4321"
Then Home page appears
And Cards displayed are "true"

@SmokeTest @RegTest
Scenario: Home page default login
Given User is at landing page
When User logs in into application with "jim" and password "1234"
Then Home page appears
And Cards displayed are "false"

@MobileTest
Scenario: Home page default login
Given User is at landing page
When User Signs up with following details
| jenny | abcd | jenny@abcd | Australia|
Then Home page appears
And Cards displayed are "false"

@SmokeTest
Scenario Outline: Home page default login
Given User is at landing page
When User logs in into the application with <Username> and password <Password>
Then Home page appears
And Cards displayed are "true"

Examples:
|Username |Password |
|user1    |pass1    |
|user2    |pass2    |
|user3    |pass3    |
|user4    |pass4    |

