Feature: Record level hold

@smoke1
Scenario: Apply record level hold and deleting it - From search screen
Given user on home page
When user lands on home page and click on created app and clicks on record level search
Then user enters search field
Then apply hold for record level

@smoke2
Scenario: Apply record level hold - From job- Through table
Given user logins app and go to system setting
When user click on job button
Then user start adding a hold via table job by clicking add icon
Then user creates a hold job and navigate to job page

@smoke3
Scenario: Apply record level hold - From job- Through search 
Given user login the application  and navigate to system setting
When user select job tab to create a hold
Then user start adding a hold via search job by clicking add icon
Then user click on creates and navigate to job page in application
