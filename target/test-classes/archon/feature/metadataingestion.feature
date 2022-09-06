Feature: Metadata Ingestion

@smoke1
Scenario: ingesting a metadata to a application E2E(schema level)
Given user login and creates a application
Then in created application go to metadata page and click
And user click on ingest data icon
Then user ingest the data with proper creds
@smoke2
Scenario: ingesting a metadata to a application(table level)
Given user login and creates a application with different name
Then user navigate to metadata page in created app
And user click on any table
Then user ingest the data with proper creds in table level
@smoke3
Scenario: ingesting metadata giving wrong source path
Given user in login page and creates a application
Then in created application click on metadata icon
And user click upload ingest data icon in the page
Then user try to ingest metadata with wrong source path

