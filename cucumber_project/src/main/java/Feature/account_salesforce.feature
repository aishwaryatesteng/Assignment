Feature: Sales account creation of the salesforce application

Scenario: Account creation with valid username
Given Launch the Browsers
And Load the urls
And Enter the usernames as 'aishwaryatesteng7293@agentforce.com'
And Enter the passwords as 'Ai7@7@7@7@'
When click on login button
And click on waffle icon
And click on view all 
And click on sales
And click on account tab
And click on new button
Given Enter the name as 'Aishwaryaa'
And select ownership as public
When click on save 
Then Account should be created successfully
