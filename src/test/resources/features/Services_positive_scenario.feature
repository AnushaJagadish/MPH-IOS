Feature: Validating all the services available in the services tab

  Scenario: Validate that the user is navigated to the Services page on clicking Services tab
    Given  Home page of mpowered health app
    When Login with valid credentials
    Then Click on Services tab

  Scenario:Navigation to the Second Opinion page on clicking Second Opinions
    Given Services page
    When Click on Second opinion tile
    Then Verify second opinion page

  Scenario: Navigation to the Conditions page on clicking Conditions
    Given  Services page
    When click on Conditions
    Then Verify Conditions page

  Scenario:  Validate Navigation to the Medications page on clicking Medications
    Given Services page
    When Click on medications page
    Then Verify Medications page

  Scenario: Validate navigation to the Bills page on clicking Bills
    Given Services page
    When Click Bills page
    Then Verify Bills page

  Scenario: Validate navigation to the Claims page on clicking Claims
    Given Services page
    When Click claims page
    Then Verify Claims page