Feature: Edit lead functionality of the leaftaps application
Scenario Outline: Edit lead with the valid data
And Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When clicking on login button
And clicking on crm/sfa
And clicking on lead
And clicking on find lead 
And Entering the phone number as '99'
And clicking on find lead button
And clicking on edit button
And Entering the companyname as 'TCS'
Then Lead must be edited