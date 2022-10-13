Feature: Group level hold

@smoke1
Scenario: Apply group level hold and deleting it - From search screen
Given user on home page in application
When user lands on home page and click on created app and clicks on group level search
Then user enter search field
Then apply hold for group level

@smoke2
Scenario: Apply group level hold - From job- Through table
Given user login app and go to system settings
When user click on job button in application
Then user start adding a group hold via table job by clicking add icon
Then user creates a group hold job and navigate to job page


@smoke3
Scenario: Apply group level hold - From job- Through search 
Given user logins the application  and navigate to system settings
When user select job tab to create a group hold
Then user start adding a group hold via search job by clicking add icon
Then user click on creates  group hold via search and navigate to job page in application

