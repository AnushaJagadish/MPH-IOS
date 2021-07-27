Feature: Verify the header page positive scenarios

  Scenario: Validate that the mpowered health logo/hamburger in the header
    Given Launch URL
    When Navigated to the 'Header' page
    Then  Verify hamburger in the header

  Scenario: Validation of the Drop down tab
    When Click on Drop down or  hamburger tab
      Then Verify the drop down options

  Scenario: Validate profile page on clicking  Your profile tab
    When  Click on Drop down or  hamburger tab
  Then click on  Your profile
    And  Verify the profile page

  Scenario: Validate  Your ratings dashboard
    When Click on Drop down or  hamburger tab
  Then  click on  Your ratings
    Then  Verify  the ratings dashboard page.

  Scenario: Validate the alerts page
    When Click on Your alerts icon
    Then Verify the alerts page

  Scenario: Validate Help or FAQ  page
    When  Click on Drop down or  hamburger tab
    Then click on Help icon
    Then Verify  the help or FAQ page

  Scenario: Validate  Privacy Policy dialogue box on clicking on the Privacy Policy
    When  Click on Drop down or  hamburger tab
    Then click on  Privacy Policy
      Then  Verify the dialogue box

  Scenario: Validate Terms & Conditions dialogue box on clicking on the Terms & Conditions
    When  Click on Drop down or  hamburger tab
   Then click on  Terms & Conditions
   Then Verify the  dialogue box on terms and conditions page

  Scenario: Validate the Contact Us page
    When  Click on Drop down or  hamburger tab
    Then click on  Contact Us
    Then  Verify  Contact Us page

  Scenario: Validate that the user is navigated to the Feedback Port   page  on clicking Feedback
    When Click on Drop down or  hamburger tab
    Then click on  Feedback
    Then Verify the Feedback Port.
    And Verify the thank you message

  Scenario: Validate the Landing page on clicking Log out icon
    When  click on Log out icon
    Then Verify navigation to the Landing  page
