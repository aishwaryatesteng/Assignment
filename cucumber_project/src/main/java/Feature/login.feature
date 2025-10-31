Feature: Login functionality of leaftaps application
Scenario: Login with valid credentials
Given Launch the Browser
And Load the url
And Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When Click on login button
Then It should be redirected to the next page

Scenario: Login with invalid credentials
Given Launch the Browser
And Load the url
And Enter the username as 'Demo'
And Enter the password as 'crm'
When Click on login button
But It throws the error


