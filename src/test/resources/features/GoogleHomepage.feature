Feature: Google Homepage
This feature verifies the functionality on Google Homepage

Scenario: Check that main elements on Google Homepage are displayed
Given I launch Chrome browser
When I open Google Homepage
Then I verify that the page displays search text box
And the page displays Google Search button
And the page displays Im Feeling Lucky button

#Scenario: Search sth on Google Searchpage
#Given I send keywords  to search text box to search
#When I click Google logo
#Then the page displays Search btn
#And I click Google Search button
#And the page displays Tumu tab
#And I quit the browser
