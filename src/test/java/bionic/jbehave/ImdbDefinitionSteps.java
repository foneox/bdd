package bionic.jbehave;

import bionic.steps.ImdbUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Sergii on 7/14/2015.
 */
public class ImdbDefinitionSteps {

    @Steps
    ImdbUserSteps imdbUser;

    @Given("Registered user with credentials <email>, <password>")
    public void givenLoggedInUserIsOnMainPage(@Named("email") String email,
                                              @Named("password") String password) {
        imdbUser.logsIntoGmail(email, password);
    }

    @When("The user is on IMDB home page")
    public void whenUserIsOnImdbHomePage(){
        imdbUser.opensSiteHomePage();
    }

    @Then("The user can log in to the system")
    public void theUserCanLogInToTheSystem(){

    }
}
