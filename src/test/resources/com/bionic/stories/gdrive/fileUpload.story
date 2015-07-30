Meta:

Narrative:
As a authorised user
I want to upload file to Google drive
So that file can accesible from anywhwre where the internet is

Scenario: File uploading
Given authorized connection to <user> drive
When I upload file to Google drive
Then I see file is on the drive

Examples:
|user|
|"bionic.bdd@gmail.com"|