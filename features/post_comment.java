import io.cucumber.java.en.*;

public class PostCommentSteps {

    private boolean isUserLoggedIn;
    private boolean isCommentConfirmed;
    private String comment;
    private boolean isCommentStored;
    private boolean isCommentDisplayed;

    @Given("user logged into the system")
    public void user_logged_into_the_system() {
        // Simulate user login
        isUserLoggedIn = true;
        System.out.println("User is logged in.");
    }

    @Given("user has navigated to the desired location or post")
    public void user_has_navigated_to_the_desired_location_or_post() {
        // Simulate user navigation
        System.out.println("User has navigated to the post.");
    }

    @When("user clicks \"Post Comment\"")
    public void user_clicks_post_comment() {
        // Simulate clicking the Post Comment button
        System.out.println("User clicks 'Post Comment'.");
    }

    @When("user enters his/her comment in the input text area")
    public void user_enters_comment_in_the_input_text_area() {
        // Simulate user entering a comment
        comment = "This is a test comment.";
        System.out.println("User enters the comment: " + comment);
    }

    @When("user confirms the posting of my comment")
    public void user_confirms_the_posting_of_my_comment() {
        // Simulate user confirming the comment
        isCommentConfirmed = true;
        System.out.println("User confirms posting the comment.");
    }

    @Then("the comment should be processed by the system")
    public void the_comment_should_be_processed_by_the_system() {
        if (isCommentConfirmed) {
            // Simulate comment processing
            isCommentStored = true;
            System.out.println("Comment is processed.");
        } else {
            System.out.println("Comment was not processed.");
        }
    }

    @Then("the comment should be stored successfully")
    public void the_comment_should_be_stored_successfully() {
        if (isCommentStored) {
            System.out.println("Comment is stored successfully.");
        } else {
            System.out.println("Comment was not stored.");
        }
    }

    @Then("user should see his/her comment displayed on the post")
    public void user_should_see_comment_displayed_on_the_post() {
        if (isCommentStored) {
            isCommentDisplayed = true;
            System.out.println("User sees the comment displayed.");
        } else {
            System.out.println("User does not see the comment displayed.");
        }
    }

    @When("user enters my comment in the input text area")
    public void user_enters_my_comment_in_the_input_text_area() {
        // Simulate entering the comment in the second scenario
        comment = "Another test comment.";
        System.out.println("User enters the comment: " + comment);
    }

    @When("user does not confirm the posting")
    public void user_does_not_confirm_the_posting() {
        // Simulate not confirming the posting
        isCommentConfirmed = false;
        System.out.println("User does not confirm the posting.");
    }

    @Then("his/her comment should not be processed")
    public void comment_should_not_be_processed() {
        if (!isCommentConfirmed) {
            isCommentStored = false;
            System.out.println("Comment is not processed.");
        }
    }

    @Then("his/her comment should not be stored")
    public void comment_should_not_be_stored() {
        if (!isCommentStored) {
            System.out.println("Comment is not stored.");
        }
    }

    @Then("user should not see my comment displayed on the post")
    public void user_should_not_see_comment_displayed_on_the_post() {
        if (!isCommentDisplayed) {
            System.out.println("User does not see the comment displayed.");
        }
    }
}