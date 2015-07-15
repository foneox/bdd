Meta:

Narrative:
FOR movie fans
WHO want to express their opinon of some movie
THE IMDb product is a Movie Ratiing website
THAT requires logging in to express user opinion
UNLIKE the sites that don't require logging in
OUR PRODUCT provides more precise results

Scenario: Logging in to the system as a registered user
Given a user is on IMDb home page
When the user logs in to the system with <login> and <password>
Then the user is logged in

Examples:
|login|password|
|bionic.bdd@gmail.com|bionicbdd2015|

Meta:
@ignore

Scenario: Logging in to the system as a non-registered user
Given a user is on IMDb home page
When the user logs in to the system with <login> and <password>
Then the user is not logged in

Examples:
|login|password|
|iamguest@guest.com|guestpass|