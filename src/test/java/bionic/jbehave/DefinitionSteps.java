package bionic.jbehave;

import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import bionic.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("Registered user with credentials <email>, <password>")
    public void userLogin(@Named("email") String email, @Named("password") String password) {
        endUser.loginToGoogleAccount(email, password);
    }

    @Given("logged in user is on main page")
    public void givenLoggedInUserIsOnMainPage() {
        endUser.loginToGoogleAccount("bionic.bdd@gmail.com", "bionicbdd2015");
        endUser.openHomePage();
        endUser.loginToSystemViaGoogle();
        endUser.openHomePage();
    }

    @Given("unregistered user is on main page")
    public void givenUnregisteredUserIsOnMainPage() {
        endUser.openHomePage();
    }

    @Given("logged in user is on theatre movie page")
    public void givenUserIsLoggedInAndOnMoviePage() {
        endUser.loginProcess();
        endUser.openMoviePage();
    }

    @Given("Nonregistered user")
    @Pending
    public void notRegisterUser() {
        //Pending
    }

    @When("user select any coming soon film")
    public void whenUserSelectAnyComingSoonFilm() {
        endUser.openComingSoonPage();
        endUser.openComingSoonFilm(1);
    }

    @When("The user is on IMDB home page")
    public void userOnHomePage() {
        endUser.openHomePage();
    }

    @When("user set score")
    public void whenUserSetScore() {
        endUser.setMovieScore(8);
    }

    @Then("The user can log in to the system")
    public void userCanLog() {
        endUser.loginToSystemViaGoogle();
        endUser.openHomePage();
        endUser.verifyUserLoggedIn();
    }

    @Then("user shouldn't be able to rate film")
    public void thenUserShouldntBeAbleToRateFilm() {
        endUser.verifyMovieCannotBeScored();
    }

    @Then("statistic on the site has been changed")
    public void whenStatisticOnTheSiteHasBeenChanges() {
        endUser.verifyMovieScoreChanged();
    }

    @Then("The user can not log in to the system")
    @Pending
    public void userCannotLog() {
        //Pending
    }
}