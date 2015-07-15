Search For a Phone By Name

Meta:
@tag productcatalog:phone

Narrative:
As a product owner of sokol.ua
I want to search for a phone by name
Where the first available product is the phone that I search
Only phone should be displayed as the first available product

Scenario: Searching for a phone
Given a guest user is on the Home page
When they search for <product>
Then the product on <position> position should be <product> from <category>

Examples:
|product|position|category|
|iPhone 6|1|Смартфоны|