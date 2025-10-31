Feature: Create lead functionality of the leaftaps application
Scenario Outline: Create lead with the valid data
And Enter the username as 'DemoCSR'
And Enter the password as 'crmsfa'
When clicking on login button
And clicking on crm/sfa
And clicking on lead
And clicking on createlead
And Entering the company name as <company>
And Entering the first name as <first>
And Entering the last name as <last>
And clicking on create lead button
Then lead must be created successfully

Examples:
|company|first|last|
|amazon|aishwarya|rajasegaran|
|accenture|aishwarya|randish|
|hid|randish|raj|
