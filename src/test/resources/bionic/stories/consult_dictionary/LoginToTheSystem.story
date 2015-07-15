Meta:

Narrative:
FOR movie fans
WHO want to express their opinon of some movie
THE IMDb product is a Movie Rating website
THAT requires logging in to express user opinion
UNLIKE the sites that don't require logging in
OUR PRODUCT provides more precise results

Scenario: Logging in to the system
Given user is logged in to Google account using <email> and <password> credentials
When the user is on IMDB home page
Then the user <userName> can log in to the system using Google

Examples:
|email|password|userName|
|bionic.bdd@gmail.com|bionicbdd2015|bionicbdd|

