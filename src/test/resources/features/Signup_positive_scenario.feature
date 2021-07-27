Feature: Validation on Sign Up Positive test cases

  #User must be able to Signup with valid credentials
  Scenario: Verify that the browser is lauched.Clicks on the Signup button and navigates to Signup page
    Given Launch the URL and click on signup
    Then Navigated to signup page

  Scenario: Verify clicking on login link will navigate to login page
    When Clicks on the 'Login' link
    Then Navigates to the login page

  Scenario: Verify that the data entered in both Password and Confirm password fields are masked
    When Enter details in the 'Password' and 'Confirmed Password' field should be masked

  Scenario: Verify that the password should be displayed on an eye click for Password fields
    When Clicks on the Eye
    Then Orginal value should be displayed in the password fields

  Scenario: Verify that the Confirm password field by comparing data entered in the Password field
    When Enter same values of 'Password' in the 'Confirmed Password' field

  Scenario: Verify click on Sign Up with valid credentials
    When Enters valid credentials
    Then Verify navigation to OTP page

  Scenario: verify the scenario when navigate to the otp Login page
    When Enters otp
    And Clicks on 'verify' button
