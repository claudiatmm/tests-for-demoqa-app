Feature: Alerts Windows

  Background:
    Given I open the page with name "https://demoqa.com/alerts"

  Scenario: Check functionality of every alerts on page Alerts Windows
    Given I click on first alert button
    And I click on the second alert button with 5 seconds wait
    And I click on the third alert button
    And I click on the fourth alert button


