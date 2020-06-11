Feature: Confirm whether a visa is required to visit the UK

Scenario: Nationality Japan, Study visa, longer than six months
Given I provide a nationality of Japan
And I select the reason “Study”
And I state I am intending to stay for more than 6 months
When I submit the form
Then I will be informed “I need a visa to study in the UK”

Scenario: Nationality Japan, Tourism visit
Given I provide a nationality of Japan
And I select the reason “Tourism”
When I submit the form
Then I will be informed “I won’t need a visa to study in the UK”

Scenario: Nationality Russia, Tourism visit
Given I provide a nationality of Russia
And I select the reason “Tourism”
And I state I am not travelling or visiting a partner or family
When I submit the form
Then I will be informed “I need a visa to come to UK”