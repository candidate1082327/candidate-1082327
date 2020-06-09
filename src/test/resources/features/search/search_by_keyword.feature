#candidate 1082327 computer is setup with all environment dependencies to work on this sample framework.
#Drivers are updated as per the candidate 1082327 machine compatability
#Sample test run successful with serenity framework build pass on candidate 1082327 computer.
#Ready for Gitlab project (as Master Repository)

Feature: Search by keyword

  Scenario: Searching for a term
    Given Sergey is researching things on the internet
    When he looks up "Cucumber"
    Then he should see information about "Cucumber"

