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

    @Given("Registered user with credentials <email>, <password>")
    @Pending
    public void givenRegisteredUserWithCredentialsemailpassword() {
        // PENDING
    }

    @When("The user is on IMDB home page")
    @Pending
    public void whenTheUserIsOnIMDBHomePage() {
        // PENDING
    }

    @Then("The user can log in to the system")
    @Pending
    public void thenTheUserCanLogInToTheSystem() {
        // PENDING
    }

    @Given("Nonregistered user")
    @Pending
    public void givenNonregisteredUser() {
        // PENDING
    }

    @When("The user is on IMDB home page")
    @Pending
    public void whenTheUserIsOnHomePage() {
        // PENDING
    }

    @Then("The user can not log in to the system")
    @Pending
    public void thenTheUserCanNotLogInToTheSystem() {
        // PENDING
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
