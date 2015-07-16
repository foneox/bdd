package bionic.jbehave;

import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import bionic.steps.EndUserSteps;


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
        endUser.loginToImdb();
        endUser.isUserLoggedIn(userName);
    }

    @Given("user is logged in")
    @Alias("user '$user' is logged in")
    public void givenUserIsLoggedIn(String user) {
        endUser.generalLogin("bionic.bdd@gmail.com", "bionicbdd2015");
    }

    @Given("theatre movie page is opened")
     public void givenTheatreMoviePageIsOpened() {
        endUser.openTheatreMoviePage();
    }

    @When("user set score")
    public void whenUserSetScore() {
        // PENDING
    }

    @Then("statistic on the site has been changed")
     public void whenStatisticOnTheSiteHasBeenChanges() {
        // PENDING
    }

}
