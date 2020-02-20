Feature:Checkboxes in the checkbox page

  Scenario: Testing checkboxes functionality

    Given user is on homepage
    When user clicks to the Checkboxes link
    Then user sees the Checkboxes text
    When user clicks to the first check box
    Then checkbox will be checked
    When user clicks to the second check box
    Then checkbox will be unchecked
    And user quits the browser