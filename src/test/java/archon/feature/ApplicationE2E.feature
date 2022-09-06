Feature: APPLICATION CREATION AND METADATA INGESTION IN HDFS AND S3


@regression
Scenario: User should able to create an application with metadata ingestion(HDFS)
Given user should able to click the ADD APPLICATION icon
When user fills the application info with application type active archiving
When user fills the application info with category with ADPTESTING
Then user should proceed to storage tier
Given storage type with HDFS
When user clicks the proceed to metadata upload
Then upload metadata page should navigated
Then clicks on BROWSE FILE and upload the metadata and create an new application
Then user clicks on created application
Then in created application go to metadata page and click
And user click on ingest data icon
Then user ingest the data with proper creds
Then user enter source path to ingest data and click ingest
