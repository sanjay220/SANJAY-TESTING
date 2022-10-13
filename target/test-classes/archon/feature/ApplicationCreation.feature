Feature: APPLICATION CREATION


@regression22
Scenario: User should able to create an application
Given user should able to click the ADD APPLICATION icon
When user fills the application info with application type active archiving
When user fills the application info with category with ADPTESTING
Then user should proceed to storage tier
Given storage type with HDFS
When user clicks the proceed to metadata upload
Then upload metadata page should navigated
Then clicks on BROWSE FILE and upload the metadata
Then click on proceed to application compliance
Given user is on APPLICATION COMPLIANCE
When user clicks on add icon to create a new retention set
Then apply retention box should displayed
Then user enters retention set name
Then user selects policy aging type FIXED
Then user should able to create a new retention policy
Then create retention policy box should displayed
Then user enters policy name "TESTING_POLICY29" and description "APPLY_POLICY"
When user selects aging strategy as FIXED DATE
Then user selects retention date
When user clicks on create
Then success pop up message will displayed
Then user should able to view the created policy on RETENTION POLICY  and select it
Then user clicks on apply button
Then user should able to create anapplication end to end
Then user clicks on created application
Then user clicks on app info
Then user clicks on application compliance
Then user delete the RETENTION SET
Then go back to application page and delete the created application
Then go to system settings
Then click on compliance tab
Then delete the created policy


@smoke
Scenario: case1. creating application
Given user login the application
When user clicks on add application
Then user enters application name "APPLICATION_CASE1" and description "TESTING-SA"
Then user selects category as ADPTESTING
Then create an application and successful message should get display and delete the application

@smoke1
Scenario: case2. creating application till storage tier
Given user logins in the app
When user click on add application
Then user enter application name "APPLICATION_CASE2" and description "TESTING-SA"
Then user select ADPTESTING
Then user select HDFS storage tier and create the application and finally delete it


@smoke2
Scenario: case3. creating application till metadata upload
Given user on application page
When user click on add application button on the application
Then user enters name "APPLICATION_CASE3" and descri "TESTING-SA"
Then select adptesting as category
Then select HDFS tier as a storage type
Then proceed to metadata upload and create application and finally delete it


@smoke3
Scenario: case4--NEGATIVE CASE. creating application with existing name
Given user login the application with valid creds
When cliks add button on home page
Then user enters exsisting name "APPLICATION_REGTEST" and description as "TESTING-SA"
Then ERROR message should appears and create application button should be disabled

@smoke4
Scenario: case5-- VALIDATION
Given user is on home page
When user creates a basic application
Then user validates created application details are same in application info


@smoke5
Scenario: case6-- NEGATIVE CASE. creating application without application name
Given user log in the application home page
When user click add button in home page and creates application without giving name
Then user should not able to create application

@smoke6
Scenario: case7--NEGATIVE CASE. creating application with giving below 3 characters in name
Given user is on home page of app
When user clicks add button and gives below three character in application name
And user validates the error message
Then user cannot able to create an application


@smoke7
Scenario: case8--NEGATIVE CASE.searching deleted application in search tab
Given user is on home page and clicks add button and creates an basic app
When user searches the application on search tab it should display
Then user delete the same application
And searches again the application ,it should not display




















