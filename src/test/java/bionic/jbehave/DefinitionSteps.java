package bionic.jbehave;

import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import bionic.steps.EndUserSteps;
import org.jbehave.core.model.Meta;


public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("user is logged in to Google account using <email> and <password> credentials")
    public void givenUserIsLoggedInToGoogle(String email,String password) {
       endUser.loginToGoogle(email,password);
    }

    @When("the user is on IMDB home page")
    public void whenTheUserIsOnIMDBHomePage() {
        endUser.openImdbPage();
    }

    @Then("the user <userName> can log in to the system using Google")
    public void thenTheUserCanLogInToTheSystem(String userName) {
        endUser.loginToImdb(userName);
    }

    @Given("user is logged in")
    @Pending
    public void givenUserIsLoggedIn() {
        // PENDING
    }

    @Given("theatre movie page is opened")
    @Pending
    public void givenTheatreMoviePageIsOpened() {
        // PENDING
    }

    @When("user set score")
    @Pending
    public void whenUserSetScore() {
        // PENDING
    }

    @When("statistic on the site has been changes")
    @Pending
    public void whenStatisticOnTheSiteHasBeenChanges() {
        // PENDING
    }

}
