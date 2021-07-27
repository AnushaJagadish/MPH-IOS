Feature: Validation on Sign Up Page negative test case

  #User should get validation messages on entering invalid Signup credentials
  Scenario: Verify the scenario when entered invalid firstname and lastname
    Given Launch  URL and click on signup
    When Enter invalid 'Firstname' and 'Lastname' details
    Then Verify the validation message

  Scenario: Verify the scenario when entered invalid 'Email ID'
    When Enter invalid 'Email ID'
    Then Verify the validation message

  Scenario: Verify the scenario when blank 'Email ID' field
    When Enter 'Email ID' as blank
    Then Verify the validation message

  Scenario: Verify the scenario when entering less than 10 digits in the 'Phone number' field
    When Enter phone number with less than ten digits
    Then Verify the validation message

  Scenario: Verify the scenario when entering more than 10 digits in 'Phone number' field
    When Enter phone number with more than ten digits
    Then Verify the validation message

  Scenario: Verify the scenario when entering already registered phone number
    When Enter already registered phone number
    Then Verify the validation message

  Scenario: Verify the scenario when blank 'Password' field
    When Enter 'Password' as blank
    Then Verify the validation message

  Scenario: Verify the scenario when password strength message and progress bar is displayed while entering password in 'Password' field
    When Enter password
    Then Verify the validation message

  Scenario: Verify the scenario when entering different data in 'Password' and 'Confirm Password'
    When Enter password and confirm password data differently
    Then Verify the validation message

  Scenario: Verify the scenario when 'Sign Up' button is disabled  when 'Terms & Conditions' is unchecked
    When Check box is unchecked
