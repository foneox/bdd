Meta:
@ignore
@issue BDD-001

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: login to gmail and get list of emails
Given authorized connection to gmail
When I get list of emails
Then no new emails received