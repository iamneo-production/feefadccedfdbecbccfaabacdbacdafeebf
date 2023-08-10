Feature: Feedback Functionality Verification
  As a user
  I want to submit feedback on the website
  So that the admin can receive and reply to my feedback

  Scenario: Submit Feedback and Receive Response
    Given the user navigates to JavaTpoint.com
    When the user clicks on Feedback
    Then the Feedback page opens
    And the user submits feedback message
    Then feedback should be received on the admin page
    And admin can reply to the user
