Feature: user post a comment
  Scenario: Successfully posting a comment
    Given user logged into the system
    And user has navigated to the desired location or post
    When user clicks "Post Comment"
    And user enters his/her comment in the input text area
    And user confirms the posting of my comment
    Then the comment should be processed by the system
    And the comment should be stored successfully
    And user should see his/her comment displayed on the post

  Scenario: Posting a comment without confirmation
    Given user is logged into the system
    And user has navigated to the desired location or post
    When user clicks "Post Comment"
    And user enters my comment in the input text area
    But user does not confirm the posting
    Then his/her comment should not be processed
    And his/her comment should not be stored
    And user should not see my comment displayed on the post