Feature: applying compliance
@smoke1
Scenario: create a retention policy
Given user is on system settings
When user clicks on compliance
Then user creates a retention policy and save it

@smoke2
Scenario: create a Hold policy
Given user login and navigate to system settings
When user select compliance tab
Then user will create a hold and save

@smoke3
Scenario: table level retention apply
Given user creates an application with metadata
When user click on metadata and go inside one table
And click on retention tab
Then user apply table level retention

@smoke4
Scenario: applying application level retention and deleting it
Given creating a app with metadata
When user clicks on app and app info button
Then go to app compliance tab
Then create a new app level retention set

@smoke5
Scenario: applying application level hold and deleting it
Given create new app along with meta data
When user clicks on the created app and app info and app compliance
Then create a new HOLD set and delete it from application level
@smoke6
Scenario: applying table level hold and deleting it
Given new application create with blob data
Then go to the application and go to metadata tab and go inside a table
And click on hold tab and create a new hold

Scenario: applying record level hold and deleting it







