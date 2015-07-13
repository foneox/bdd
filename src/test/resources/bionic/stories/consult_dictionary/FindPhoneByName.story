Meta:

Narrative:
In order to make purchase more quiqly
As a buyer
I want to search phone by name and be sure that only phones are displayed

Scenario: Search phone by name
Given I am on main page
When I search for <product>
Then I should see result list of items which belong to <category>
And item <number> from result list contains title <product>

Examples:
|product|number|category|
|Iphone 6|1|Смартфоны|
