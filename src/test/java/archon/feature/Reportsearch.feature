
Feature: report search

@smoke1
Scenario: create a report search
Given user create an application
When user click on created application
Then user creates a report search by giving query
Then user perform the report search
