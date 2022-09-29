Feature: Application Login

#Background: 
#Given validate the browser
#When Browser is triggered
#Then Check if browser is started

@SmokeTest
Scenario: Home page default login
Given User is at landing page
When User logs in into application with "john" and password "4321"
Then Home page appears
And Cards displayed are "true"
