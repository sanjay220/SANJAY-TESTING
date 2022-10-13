Feature: Record level and group level retention

@smoke1
Scenario: Apply record level retention and deleting it - From search screen
Given  user on home page
When  user lands on home page and click on created app and clicks on record level search
Then user enters search field
Then apply retention for record level

@smoke2
Scenario: Apply record level retention - From job- Through table
Given user logins and go to system settings
When user click on job tab
Then user start adding a retention via table job by clicking add icon
Then user creates a retention job and navigate to job page

@smoke3
Scenario: Apply record level retention - From job- Through search 
Given user logins the application  and navigate to system settings
When user select job tab to create a retention
Then user start adding a retention via search job by clicking add icon
Then user clicks on creates and navigate to job page

@smoke4
Scenario: Apply group level retention and deleting it - From search screen
Given user logins the application
When user  click on exisiting app and clicks on group level search
Then user clicks search field
Then apply retention for group level

@smoke5
Scenario: Apply group level retention - From job- Through table
Given user logins in the app and go to system settings
When user click on job tab of the application
Then user add group level retention via table
Then group level retention is created by the user

@smoke6
Scenario: Apply group level retention - From job- Through search
Given when user navigates to the home page and job page
When user start creating a job by clicking add circle
Then user start creating group level retention for the specified application
Then user creates group level retention



