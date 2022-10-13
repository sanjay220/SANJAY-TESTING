Feature: EXPORT AND IMPORT SEARCHES(BASIC,ADVANCE,REPORT)

@smoke1
Scenario: Basic search ,advance search,report search(export and import)
Given user on home page
When user navigate to search page
When user imports and export basic search in the application and delete it
Then user imports and export the advance search and deletes it
Then report search is imported and exported and finally deleted


