package bionic.jbehave;

import bionic.steps.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("Registered user with credentials <email>, <password>")
    public void givenRegisteredUserWithCredentialsemailpassword(String email, String password) {
        endUser.isLoginedWithGoogle(email, password);
    }

    @When("The user is on IMDB home page")
    public void whenTheUserIsOnIMDBHomePage() {
        endUser.opensHomePage();
    }

    @Then("The user can log in to the system")
     public void thenTheUserCanLogInToTheSystem() {
        endUser.isLoginedTroughGoogleAccount();
    }

    @Given("user is logged in")
    @Alias("logged in user is on main page")
    public void givenUserIsLoggedIn() {
        endUser.loginsWith("bionic.bdd@gmail.com", "bionicbdd2015");
    }

    @Given("theatre movie page is opened")
    public void givenTheatreMoviePageIsOpened() {
        endUser.openTheatreMovieDetails();
    }

    @When("user set score")
    public void whenUserSetScore() {
        endUser.rateMovie();
    }

    @Then("statistic on the site has been changes")
    public void thenStatisticOnTheSiteHasBeenChanges() {
        endUser.shouldSeeMovieStatisticChanged();
    }


    @Given("unregistered user is on main page")
    public void givenUnregisteredUserIsOnMainPage() {
        endUser.opensHomePage();
        endUser.logOutIfLogined();
    }

    @When("user select any coming soon film")
    public void whenUserSelectAnyComingSoonFilm() {
        endUser.opensComingSoonFilmDetails();
    }

    @Then("user shouldn't be able to rate film")
    public void thenUserShouldntBeAbleToRateFilm() {
        endUser.shouldNotSeeOwnRate();
    }


}
