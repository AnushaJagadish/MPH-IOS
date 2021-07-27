Feature: Validation on Landing page

  #User is navigated to Welcome,Login,Sign Up page
  Scenario: Validate that the user is navigated to Welcome page
    Given launch the URL
    Then navigated to Welcome page

  Scenario: Validate user is able to click on 'Sign Up' button and navigate to Sign Up page
    When clicks on  'Sign Up' button
    Then navigate to Sign up page
    
Scenario: Validate user is able to click on 'Login' button and navigate to Login page
    When clicks on the 'Login' button
    Then navigate to Login page