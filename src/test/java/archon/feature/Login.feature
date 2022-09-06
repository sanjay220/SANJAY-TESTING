Feature: LOGIN FUNCTIONALITY

Scenario Outline: Hme page default logins
Given user is on landing page
When user login into the application with <username> and <password>

Examples:
|username |password|
|sanjay   |admin   |
|sysadmin |sadmin  |
|sadmin   |sysadmin|
|sysadmin |sysadmin|

















