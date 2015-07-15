Meta:

Narrative:
FOR movie fans
WHO want to express their opinon of some movie
THE IMDb product is a Movie Ratiing website
THAT requires logging in to express user opinion
UNLIKE the sites that don't require logging in
OUR PRODUCT provides more precise results

Scenario: Logging in to the system
Given Registered user with credentials <email>, <password>
When The user is on IMDB home page
Then The user can log in to the system

Examples:
|email|password|
|bionic.bdd@gmail.com|bionicbdd2015|


Scenario: Nonregistered user trying to log in to the system
Given Nonregistered user
When The user is on IMDB home page
Then The user can not log in to the system

Examples:
|email|password|
|non.existing.user.adsfadsfasdf@gmail.com|qwerty123456|


