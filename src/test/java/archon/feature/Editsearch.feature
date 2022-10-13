Feature: EDIT SEARCHES(BASIC,REPORT)
@smoke1
Scenario: edit  searches
Given user logins application ,and create new application
When user creates a new basic search
Then user edit the created basic search and save it
Then user import report search
And user edits the imported basic search and save it

