Meta:

Narrative:
As a user of sokol.ua site
I want to search for a cell phone
So that I can get first result with the product I am looking for

Scenario: Finding of cell phone by name
Given main page is opened
When I search for <phone>
Then I see corresponding <smartphoneLink> link as first in the results list

Examples:
|phoneName|expectedphoneLink|
|HTC one M9|http://www.sokol.ua/htc-one-m9-gunmetal-gray-182ba/p579832/|
|Iphone 6|www.sokol.ua/iphone-6/p372261/|
|Galaxy S6|http://www.sokol.ua/smartfon-samsung-galaxy-s6-32gb-black-sm-g920fzkasek-8237c/p311005/|