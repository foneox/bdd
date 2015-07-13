Meta:

Narrative:
As a product owner
I want be sure that user cannot rate cooming soon film
So do not misrepresent statistics

Scenario: Denying possibility to rate coming soon film for logged user
Given logged in user is on main page
When user select any coming soon film
Then user shouldn't be able to rate film

Scenario: Denying possibility to rate coming soon film for unregistered user
Given unregistered user is on main page
When user select any coming soon film
Then user shouldn't be able to rate film