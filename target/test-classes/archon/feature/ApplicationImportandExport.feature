Feature: export and import
Scenario: application  import
Given user is on application home page
When user delete the exisisting application
Then user click on import icon and import the application

Scenario: application export
Given user is on home page
When user select the application and export it
Then user clicks on background jobs
Then user download the application
Then user logout the application


