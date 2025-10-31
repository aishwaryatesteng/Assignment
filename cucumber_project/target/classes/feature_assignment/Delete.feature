Feature: Delete lead functionality of the leaftaps application
Scenario Outline: Delete lead with the valid data
And Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When clicking on login button
And clicking on crm/sfa
And clicking on lead
And clicking on find lead 
And clicking on delete lead
Then Lead should be deleted