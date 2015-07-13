Meta:

Narrative:
As a logged in user
I am on  showing in theatre movie page
I want  to set a score to movie

Scenario: setting score to theatre movie
Given user is logged in
And theatre movie page is opened
When I set score
Then I see that score is set
And number of user increased to one