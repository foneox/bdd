package bionic.jbehave;

import bionic.steps.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

public class LoginSteps {
    @Steps
    EndUserSteps userSteps;

    @Given("a user is on IMDb home page")
    public void givenAUserIsOnImdbHomePage() {
        userSteps.isTheImdbHomePage();
    }

    @When("the user logs in to the system with <login> and <password>")
    public void whenTheUserLogsInToTheSystemWith(String login, String password) {
        userSteps.logInToTheSystem(login, password);
    }
}
